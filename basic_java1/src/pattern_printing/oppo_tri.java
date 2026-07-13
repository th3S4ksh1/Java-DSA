package pattern_printing;
import java.util.Scanner;

public class oppo_tri {

			public static void main (String []args) {
			Scanner ab = new Scanner(System.in);
			 System.out.print("enter the no.:");
			int m= ab.nextInt();

				for (int i=1;i<=m;i++) {
					for (int j=1;j<=m;j++ ) {
						if((i+j)>m)
						System.out.print("*");
						else {
							System.out.print(0);
						}
					}				
			System.out.println();
		}
			}}	
					

