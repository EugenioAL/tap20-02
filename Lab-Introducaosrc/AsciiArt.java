
public class AsciiArt {
	public static void main(String[] args) {
		int i=5,s,c;
		
		for(s=0;s<i;s++) {
			for(c=0;c<i;c++) {
				if(c<i-s) {
					System.out.print('*');
				}
				else {
					System.out.print(' ');
				}
			}
			for(c=0;c<i;c++) {
				if(c<s) {
					System.out.print(' ');
				}
				else {
					System.out.print('*');
				}
			}
			System.out.println();
		}
		
	}	
}
