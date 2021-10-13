import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float val = scan.nextFloat();
		scan.close();
		float tempF = 32 + (9*val)/5;
		System.out.printf("%.1f",tempF);
				

	}

}
