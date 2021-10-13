package br.edu.ufam.icomp.lab_encapsulamento;
import java.util.*;

public class CarroLuxuoso extends Carro implements Localizavel{
	public CarroLuxuoso(String placa){
		super(placa);
		this.placa = placa;
	}

    public Posicao getPosicao(){
        Random r = new Random();
        double latitude = (-3.160000 + (-2.960000 -(-3.160000))*r.nextDouble());


        r = new Random();
        double longitude = (-60.120000 + (-59.820000 - (-60.120000))*r.nextDouble());

        r = new Random();
        double altitude = (15.0 + (100.0 - (15.0))*r.nextDouble());
        //double latitude = valorMinimo + (valorMaximo - valorMinimo) * r.nextDouble();
        Posicao atual = new Posicao(latitude, longitude, altitude);
        return atual;
    }

    public double getErroLocalizacao(){
        return 15.0;
    }
}
