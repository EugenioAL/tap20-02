import java.awt.Point;
import java.util.*;
import java.math.*;

/**
 * Classe de exemplo para a implementação de um Jogador para o Jogo Snake.
 * Nesta implementação, a próxima direção da cobra é escolhida aleatoriamente
 * entre as direções possíveis (que não geram colisões).
 * <p>
 * Use esta classe como base inicial para a sua solução do jogo. Basicamente
 * você precisará reimplementar o método {@code getDirecao}.
 * 
 * @author Horácio
 */

public class SnakeJogador {
    private Snake jogo;
    
    /**
     * Cria um novo jogador para o jogo passado como parâmetro.
     * @param jogo jogo snake.
     */
    public SnakeJogador(Snake jogo) {
        this.jogo = jogo;
    }

    double distanciaDeDoisPontos(Point comida, Point possibilidade){
        double res;
        res =  Math.sqrt((Math.pow(comida.getX() - possibilidade.getX(), 2)) + (Math.pow(comida.getY() - possibilidade.getY(), 2)));
        return res;
    }

    char proxDirecao(Point u, Point r, Point d, Point l,Point comida, Point cabeca ){
        char direcao= 'N';
        direcao = jogo.getDirecaoAtual();
        double du,dd,dl,dr,temp = 20*30;

        du = distanciaDeDoisPontos(u, comida);
        dd = distanciaDeDoisPontos(d, comida);
        dl = distanciaDeDoisPontos(l, comida);
        dr = distanciaDeDoisPontos(r, comida);
        System.out.println("DISTANCIA 1---" +du+  " DISTANCIA 2---" + dr+ " DISTANCIA 3---"+ dd + " DISTANCIA 4---"+ dl);

        

        return direcao;
        
    }



    /**
     * Executado pelo método {@link Snake#inicia()} a cada 'tick' do jogo para
     * perguntar qual a próxima direção da cobra ('C'ima, 'D'ireita, 'B'aixo,
     * 'E'squerda ou 'N'enhum).
     * 
     * @return a próxima direção da cobra.
     */
    public char getDirecao() {
        /*
         * IMPLEMENTE AQUI A SUA SOLUÇÃO PARA O JOGO
         */
        Point comidaAtual = jogo.getComida();
        Point posUp = new Point(),posRight  = new Point(),posDown = new Point(),posLeft = new Point();
        
        char direcao;
        Point cabeca = jogo.getSegmentos().getFirst();
        /*minha implementação*/
        posUp.setLocation(cabeca.getX(), cabeca.getY() + 1);
        posRight.setLocation(cabeca.getX() + 1, cabeca.getY());
        posDown.setLocation(cabeca.getX(), cabeca.getY() - 1);
        posLeft.setLocation(cabeca.getX() - 1, cabeca.getY());



        direcao = proxDirecao(posUp, posRight, posDown, posLeft, comidaAtual,cabeca);
        
        /* Adiciona as possíveis direções na lista
        if (comidaAtual.getY() > cabeca.getY() && jogo.isCelulaLivre(cabeca.x, cabeca.y-1)) possiveisDirecoes.add('C'); // Cima
        if (jogo.isCelulaLivre(cabeca.x+1, cabeca.y)) possiveisDirecoes.add('D'); // Direita
        if (jogo.isCelulaLivre(cabeca.x, cabeca.y+1)) possiveisDirecoes.add('B'); // Baixo
        if (jogo.isCelulaLivre(cabeca.x-1, cabeca.y)) possiveisDirecoes.add('E'); // Esquerda
        
        // Não existe mais nenhuma direção disponível
        if (possiveisDirecoes.size() == 0) return 'N';
        
        // Pega um número aleatório entre 0 e o tamanho da lista e retorna a direção
        int posicao = new Random().nextInt(possiveisDirecoes.size());*/
        return direcao;
    }
    
}
