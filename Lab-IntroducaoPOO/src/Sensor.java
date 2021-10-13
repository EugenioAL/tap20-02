
public class Sensor {
    String cor;
    double resolucao;
    int framesPorSegundo;
    Sensor(){
        this("",0,0);
    }

    Sensor (String cor,double resolucao,int framesPorSegundo){
        this.cor = cor;
        this.resolucao = resolucao;
        this.framesPorSegundo = framesPorSegundo;
    }

    double getMPixelsPorSegundo(){
        double pseg = this.resolucao * this.framesPorSegundo;
        return pseg;

    }

    String getDescricao() {
        String descricao;
        descricao = "Sensor: cor=" + this.cor + ", resolucao=" + this.resolucao + "Mp, framesPorSegundo="+ this.framesPorSegundo +"fps, mPixelsPorSegundo=" + this.getMPixelsPorSegundo() + "Mpps.";
        return descricao;
    }
}
