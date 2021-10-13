import java.util.Scanner;

public class PinturaMuro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float valorM = scan.nextFloat();
		scan.close();
		float ladoA = 12;
		float ladoB = 3;
		float valorMat = 100;
		float valorF = valorMat + (ladoA*ladoB)*valorM;
		System.out.printf("%.1f",valorF);

	}

}
