import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float val = scan.nextFloat();
		float val2 = scan.nextFloat();
		float val3 = scan.nextFloat();		
		scan.close();
		float media = (val + val2 + val3)/3;
		System.out.printf("%.2f", media);
	}

}
