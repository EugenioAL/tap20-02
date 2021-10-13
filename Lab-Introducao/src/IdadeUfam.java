import java.util.Scanner;
public class IdadeUfam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fundacao = 1909;
		Scanner scan = new Scanner(System.in);
		int idade = scan.nextInt() - fundacao;
		System.out.print("A UFAM tem "+ idade +" anos de fundacao");
		scan.close();
		
	}

}
