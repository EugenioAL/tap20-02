import java.util.ArrayList;
import java.util.Iterator;

public class Turma {
    String nome;
    String professor;
    int numAlunos;
    boolean acessivel;
    ArrayList<Integer> horarios;

    Turma(){
        this("","",0,false);
    }

    Turma(String nome, String professor, int numAlunos, boolean acessivel){
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
        this.horarios = new ArrayList<Integer>();
    }

    void addHorario(int horario){
        Integer horarioTMP = Integer.valueOf(horario);
        this.horarios.add(horarioTMP);
    }

    String getHorariosString(){
        String descricao = "";
        int tmp;
        Iterator<Integer> iterator = horarios.iterator();
        while(iterator.hasNext()){
            tmp = iterator.next();
            if(tmp <= 7){
                descricao = descricao + "segunda ";
            }
            else if(tmp <= 14){
                descricao = descricao + "terça ";
            }
            else if(tmp <= 21){
                descricao = descricao + "quarta ";
            }
            else if(tmp <= 28){
                descricao = descricao + "quinta ";
            }
            else{
                descricao = descricao + "sexta ";
            }
            if((tmp % 7) == 0){
                descricao = descricao + "20hs";
            }
            else if((tmp % 7) == 1){
                descricao = descricao + "8hs";
            }
            else if((tmp % 7) == 2){
                descricao = descricao + "10hs";
            }
            else if((tmp % 7) == 3){
                descricao = descricao + "12hs";
            }
            else if((tmp % 7) == 4){
                descricao = descricao + "14hs";
            }
            else if((tmp % 7) == 5){
                descricao = descricao + "16hs";
            }
            else if((tmp % 7) == 6){
                descricao = descricao + "18hs";
            }
            if(iterator.hasNext() == true){
                descricao = descricao + ", ";
            }
        }      

        return descricao;
    }

    String getDescricao(){
        String descricao = "";
        descricao = "Turma: " + this.nome + "\nProfessor: " + this.professor + "\nNúmero de Alunos: "
        + this.numAlunos + "\nHorário: " + this.getHorariosString() + "\nAcessível: ";
        if(this.acessivel == true){
            descricao = descricao + "sim";
        }
        else{
            descricao = descricao + "não";
        }
        
        return descricao;
    }


}
