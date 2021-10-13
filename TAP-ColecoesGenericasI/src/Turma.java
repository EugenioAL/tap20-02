import java.util.ArrayList;
import java.util.Iterator;

public class Turma {

    String disciplina;
    int ano;
    int semestre;
    Professor professor;
    ArrayList <Aluno> alunos;

    Turma(String disciplina, int ano, int semestre, Professor professor){
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.professor = professor;
        this.alunos = new ArrayList<Aluno>();
    }

    void addAluno(Aluno aluno){
        int flag = 0;
        Iterator<Aluno> iterator = alunos.iterator();
        while(iterator.hasNext() && flag != 1) {
            Aluno alunoAtual = iterator.next();
            if(alunoAtual.matricula == aluno.matricula){
                flag = 1;
            }
        }

        if(flag == 0){
            this.alunos.add(aluno);
        }
    }

    Aluno getAluno(int matricula){
        Aluno subject = new Aluno();
        int flag = 0;
        Iterator<Aluno> iterator = alunos.iterator();
        while(iterator.hasNext() && flag != 1) {
            Aluno alunoAtual = iterator.next();
            if(alunoAtual.matricula == matricula){
                subject = alunoAtual;
                flag = 1;
            }
        }
        return subject;
    }

    double getMediaIdade(){
        double mIdade = 0;
        int tAlunos = 0;
        double tIdade = 0;
        Iterator<Aluno> iterator = alunos.iterator();
        while(iterator.hasNext()) {
            Aluno alunoAtual = iterator.next();
            tAlunos = tAlunos + 1;
            tIdade = tIdade + alunoAtual.getIdade();
        }
        mIdade = tIdade/tAlunos;
        return mIdade;
    }

    String getDescricao(){
        String descricao = "";
        int contador = 0;
        descricao = "Turma " + this.disciplina + " - " + this.ano + "/"+ this.semestre + " (" + this.professor.getDescricao() + "):\n";
        Iterator<Aluno> iterator = alunos.iterator();
        while(iterator.hasNext()) {
            contador = contador + 1;
            Aluno alunoAtual = iterator.next();
            descricao = descricao + "  - Aluno " + contador + ": " + alunoAtual.getDescricao() + "\n";
        }
        return descricao;
    }
}
