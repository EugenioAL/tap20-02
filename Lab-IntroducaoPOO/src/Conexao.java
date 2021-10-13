
public class Conexao {
    String tipoPorta;
    int idProtocolo;
    int taxaTransmissao;

    Conexao(){
        this("",0,0);
    }

    Conexao(String tipoPorta, int idProtocolo, int taxaTransmissao){
        this.tipoPorta = tipoPorta;
        this.idProtocolo = idProtocolo;
        this.taxaTransmissao = taxaTransmissao;
    }

    String getProtocoloString(){
        String desProt;
        if(this.idProtocolo == 1){
            desProt = "Rotoscope";
        }
        else if(this.idProtocolo == 2){
            desProt = "Acustico";
        }
        else if(this.idProtocolo == 3){
            desProt = "Radio";
        }
        else {
            desProt = "Outros";
        }
        return desProt;
    }

    double getTaxaMBps(){
        double tMBps = (this.taxaTransmissao/1024);
        return tMBps;
    }

    String getDescricao(){
        String descricao = "Conexao: tipoPorta=" + this.tipoPorta + ", protocolo=" + this.getProtocoloString() + ", taxaTransmissao=" + this.getTaxaMBps() + "MBps.";
        return descricao;
    }
}