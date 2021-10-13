
public class TurmaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno();
		Professor professor1 = new Professor();
		Turma turma1 = new Turma("Matematica",2010,2,professor1);
		turma1.addAluno(aluno1);

	}

}
