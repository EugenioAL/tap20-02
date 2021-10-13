import java.util.ArrayList;
import java.util.Iterator;

public class Ensalamento {
    ArrayList<Sala> salas;
    ArrayList<Turma> turmas;
    ArrayList<TurmaEmSala> ensalamento;

    Ensalamento(){
        this.salas = new ArrayList<Sala>();
        this.turmas = new ArrayList<Turma>();
        this.ensalamento = new ArrayList<TurmaEmSala>();        
    }

    void addSala(Sala sala){
        this.salas.add(sala);
    }

    void addTurma(Turma turma){
        this.turmas.add(turma);
    }

    Sala getSala(Turma turma){
        TurmaEmSala temp = new TurmaEmSala();
        Sala aux = null;
        Iterator<TurmaEmSala> iterator = ensalamento.iterator();
        while(iterator.hasNext() ){
            temp = iterator.next();
            if(temp.turma.nome == turma.nome && temp.turma.professor == turma.professor){
                aux = temp.sala;
                return aux;
            }
        }
        return aux;
    }

    boolean salaDisponivel(Sala sala, int horario){
        
        Iterator<TurmaEmSala> iterator = ensalamento.iterator();
        TurmaEmSala temp;
        Integer aux = horario;
        while(iterator.hasNext()){
            temp = iterator.next();
            if(temp.sala.bloco == sala.bloco && temp.sala.sala == sala.sala){
                if(temp.turma.horarios.contains(aux)){     
                    return false;
                }
             }
        }
        return true;
    }

    boolean salaDisponivel(Sala sala, ArrayList<Integer> horario){
        Iterator<Integer> iterator = horario.iterator();
        
        Integer aux;
        while(iterator.hasNext()){
            aux = iterator.next();
            if(salaDisponivel(sala, aux)){
                return true;
            }
        }
        return false;
    }


    boolean alocar(Turma turma, Sala sala){
        TurmaEmSala tmp = new TurmaEmSala(turma,sala);
        if(turma.acessivel == true && sala.acessivel == true){
            if(turma.numAlunos <= sala.capacidade){
                if(this.salaDisponivel(sala, turma.horarios)){
                    this.ensalamento.add(tmp);
                    return true;
                }
            }
        }

        return false;
    }

    void alocarTodas(){
        Iterator<Turma> iteratorTurma = turmas.iterator();
        Turma tmpTurma;
        Sala tmpSala;
        Iterator<Sala> iteratorSala;
        while(iteratorTurma.hasNext()){
            tmpTurma = iteratorTurma.next();
            iteratorSala = salas.iterator();
            while(iteratorSala.hasNext()){
                tmpSala = iteratorSala.next();
                if(salaDisponivel(tmpSala, tmpTurma.horarios)){
                    alocar(tmpTurma, tmpSala);
                }
                else{
                    alocar(tmpTurma, null);
                }
            }

        }

    }

    int getTotalTurmasAlocadas(){
        int cont=0;
        TurmaEmSala tmp;
        Iterator<TurmaEmSala> iterator = ensalamento.iterator();
        while(iterator.hasNext()){
            tmp = iterator.next();
            if(tmp.sala != null){
                cont+=1;
            }
        }

        return cont;
    }

    int getTotalEspacoLivre(){
        Iterator<TurmaEmSala> iterator = ensalamento.iterator();
        int cont = 0;
        TurmaEmSala tmp;
        while(iterator.hasNext()){
            tmp = iterator.next();
            if(tmp.sala != null){
                cont = tmp.sala.capacidade - tmp.turma.numAlunos;
            }
        }

        return cont;
    }


    String relatorioResumoEnsalamento(){
        String descricao = "";
        descricao = descricao + "Total de Salas: " + salas.size() + "\nTotal de Turmas: "+ turmas.size() + "\nTurmas Alocadas: " + getTotalTurmasAlocadas() + "\nEspaços Livres: " + getTotalEspacoLivre() + "\n";

        return descricao;
    }

    String relatorioTurmasPorSala(){
        String descricao = relatorioResumoEnsalamento();
        TurmaEmSala tmp;
        Sala tmpSala;
        int i,j;
        for(j = 0; j < salas.size() ; j++){
            tmpSala = salas.get(j);
            descricao = descricao + "--- " + tmpSala.getDescricao() + " ---\n";
            for(i = 0; i < ensalamento.size(); i++){
                tmp = ensalamento.get(i);
                if(tmpSala.bloco == tmp.sala.bloco && tmpSala.sala == tmp.sala.sala){
                    descricao = descricao + tmp.turma.getDescricao();
                }
            }
        }
        return descricao;
    }

    String relatorioSalasPorTurma(){
        String descricao = relatorioResumoEnsalamento();
        TurmaEmSala tmp;
        Turma tmpTurmas;
        int i,j,flag = 0,index=0;
        for(j = 0; j < turmas.size() ; j++){
            tmpTurmas = turmas.get(j);
            descricao = descricao + "\n"+tmpTurmas.getDescricao();
            for(i = 0; i < ensalamento.size(); i++){
                tmp = ensalamento.get(i);
                if(tmpTurmas.nome == tmp.turma.nome){
                    flag = 1;
                    index = i;

                }
            }
            if(flag == 0){
                descricao = descricao + "\nSala: SEM SALA\n";
            }
            else{
                tmp = ensalamento.get(index);
                descricao = descricao + "\nSala: " + tmp.sala.getDescricao() + "\n";
            }
        }
        return descricao;
    }






}
