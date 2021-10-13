package br.edu.icomp.ufam.lab_heranca;

public class FormasMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormaGeometrica vet[] = new FormaGeometrica[3];
		Circulo c1 = new Circulo(4,5,8);
		Quadrado q1 = new Quadrado(4,5,7);
		Retangulo r1 = new Retangulo(4,5,7,9);
		vet[0] = c1;
		vet[1] = q1;
		vet[2] = r1;
		for(int a = 0 ; a < vet.length; a++) {
			System.out.println(vet[a].toString());
		}
	}

}
