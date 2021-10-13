import java.util.Scanner;
public class Xadrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int loop = scan.nextInt();
		for(int i = 0; i < loop;i++){
			for(int j = 0; j < loop;j++){
				if(i % 2 == 0) {
					System.out.print("* ");
				}
				else{
					System.out.print(" *");
				}
			}
			System.out.print("\n");
		}
	scan.close();
	}

}
