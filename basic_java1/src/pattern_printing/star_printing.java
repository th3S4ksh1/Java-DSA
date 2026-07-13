package pattern_printing;
import java.util.Scanner ;

public class star_printing {

	public static void main(String[] args) {
		System.out.print("Enter the no. of rows:");
		Scanner sc =new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.print("enter the no. of columns:");
		int cols = sc.nextInt();
		for (int i=1; i<=rows;i++) {
			for(int j=1;j<=cols;j++){
				System.out.print( " * ");
				
			}
			System.out.println();
		}
				
	}

}
