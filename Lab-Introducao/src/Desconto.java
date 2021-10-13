import java.util.Scanner;
public class Desconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float total = (float) scan.nextFloat();
		float desconto;
		if(total > 200) {
			desconto = (float) total - (float) (total* 5/100);
			System.out.printf("%.2f", (float)desconto);
		}
		else {
			desconto = total;
			System.out.printf("%.2f", (float)desconto);
			
		}
		scan.close();
	}

}
