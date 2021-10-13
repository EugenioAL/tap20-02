
public class Astromech {
    String modelo;
    Mestre mestre;
    Sensor sensor;
    Conexao conexao;

    Astromech(String modelo, Mestre mestre, Sensor sensor, Conexao conexao){
        this.modelo = modelo;
        this.mestre = mestre;
        this.sensor = sensor;
        this.conexao = conexao;
    }

    String getDescricao(){
        String descricao;
        descricao = "Astromech modelo "+ this.modelo + ". " + this.mestre.getDescricao() + this.sensor.getDescricao() + this.conexao.getDescricao();
        return descricao;
    }
}
