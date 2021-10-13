import java.util.Scanner;

public class ArteAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		scan.close();
		int count;
		int cAst;
			for(count = val; count > 0 ; count--){
			cAst = count;
			while(cAst > 0){
				if(cAst == 1){
					System.out.print("*\n");
				}
				else{
					System.out.print("*");
				}
				cAst--;
			}
		}
		for(count = 1; count <= val ; count++){
			cAst = 0;
			while(cAst < count){
				if(cAst == count -1){
					System.out.print("*\n");
				}
				else{
					System.out.print("*");
				}
				cAst++;
			}
		}
	}

}
