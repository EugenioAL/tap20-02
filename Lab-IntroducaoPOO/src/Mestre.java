public class Mestre {

	String nome;
	int anoNascimento;
	String afiliacao;
	String posto;
    Mestre(){
        this("",0,"","");
    }
	
	Mestre(String nome, int anoNascimento, String afiliacao, String posto) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.afiliacao = afiliacao;
		this.posto = posto;	
	}

    int getIdade(int anoReferencia){
        int idade;
        if(anoReferencia < 0){
           idade = anoReferencia + (this.anoNascimento)*(-1);
        }
        else {
            idade = anoReferencia - this.anoNascimento;
        }
        return idade;
    }

    String getAnoNascimentoString(){
        String nasciFrase;
        if(this.anoNascimento < 0){
            nasciFrase = (this.anoNascimento*(-1)) + "ABY";
        }
        else {
            nasciFrase = (this.anoNascimento) + "DBY";
        }
        return nasciFrase;
    }

    boolean possuiForca(){
        if(this.posto.equals("Sith") || this.posto.equals("Jedi")){
            return true;
        }
        else {
            return false;
        }
    }

    String getDescricao(){
        String descricao = "Mestre: nome="+ this.nome +", anoNascimento=" + this.getAnoNascimentoString() + ", afiliacao="+ this.afiliacao +", posto=" + this.posto + ", possuiForca=" + this.possuiForca() + ".";
        return descricao;
    }

}