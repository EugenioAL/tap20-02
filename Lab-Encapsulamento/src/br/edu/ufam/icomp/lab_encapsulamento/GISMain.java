package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Celular cel = new Celular(23,24,123123123);
		CarroLuxuoso car = new CarroLuxuoso("3ph4");
		Localizavel [] vet = new Localizavel[3];
		vet[0] = cel;
		vet[1] = car;

		for(int i = 0; i < vet.length ; i++){
			System.out.println(vet[i].toString());
		}
		

	}

}
