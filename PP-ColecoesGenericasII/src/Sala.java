
public class Sala {
    int bloco;
    int sala;
    int capacidade;
    boolean acessivel;

    Sala(){
        this(0,0,0,false);
    }

    Sala(int bloco, int sala, int capacidade, boolean acessivel){
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }

    String getDescricao(){
        String descricao = "Bloco " + this.bloco + ", Sala " + this.sala + " (" + this.capacidade + " lugares, ";
        if(this.acessivel == true){
            descricao = descricao + "acessível)";
        }
        else{
            descricao = descricao + "não acessível)";
        }
        return descricao;
    }
}
