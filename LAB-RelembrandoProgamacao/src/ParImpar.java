import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		while(val != -1) {
			if(val % 2 == 1) {
				System.out.print("IMPAR\n");
			}
			else{
				System.out.print("PAR\n");
			}
			val = scan.nextInt();
		}
		
		
		scan.close();

	}

}
