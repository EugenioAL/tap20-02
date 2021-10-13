import java.util.Scanner;
public class ContaEnergia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float uso = scan.nextFloat();
		String tipo = scan.next();
		
		float conta;
		
		
		if(tipo.equals("R") && uso >= 0) {
			if(uso <= 500) {
				conta = uso * 40/100;
			}
			else {
				conta = uso * 65/100;
			}
		}
		else if(tipo.equals("C") && uso >= 0){
			if(uso <= 1000) {
				conta = uso * 55/100;
			}
			else {
				conta = uso * 60/100;
			}
		}
		else if(tipo.equals("I") && uso >= 0){
			if(uso <= 5000) {
				conta = uso * 55/100;
			}
			else {
				conta = uso * 65/100;
			}
		}
		else {
			conta = -1;
		}
		System.out.printf("%.2f",conta);
		scan.close();
	}

}
