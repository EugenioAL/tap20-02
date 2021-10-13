import java.util.*;
public class ListaInvertida {
	private Hashtable<String,LinkedList<String>> tabela;
	
	public ListaInvertida(){
		this.tabela = new Hashtable<String,LinkedList<String>>();
	}


    public boolean insere(String palavra, String documento){

        LinkedList<String> documents;
        if(this.tabela.get(palavra) != null){
            if(this.tabela.get(palavra).contains(documento)){
                return false;
            }
            else{
                this.tabela.get(palavra).add(documento);
                return true;
            }
        }
        else {
            documents = new LinkedList<String>();
            this.tabela.put(palavra, documents);
            this.tabela.get(palavra).add(documento);
            return true;
        }
    }

    public LinkedList<String> busca(String palavra){
            LinkedList<String> aux = this.tabela.get(palavra);
            return aux;
    }
    public String toString(){
        String descricao = this.tabela.toString();

        return descricao;
    }
}
