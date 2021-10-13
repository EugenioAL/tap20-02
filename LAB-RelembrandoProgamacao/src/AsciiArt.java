import java.util.Scanner;

public class AsciiArt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		scan.close();
		int count;
		int cAst;
		for(count = 0 ; count < val; count++){
			cAst = 0;
			while(cAst < 2* val){
				if(cAst == 2*val -1){
					System.out.print("*\n");
				}
				else if(cAst >= val - count && cAst < val + count){
					System.out.print(" ");
				}
				else{
					System.out.print("*");
				}
			cAst++;
			}
		}
	}

}
