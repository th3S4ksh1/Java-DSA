package pattern_printing;
import java.util.Scanner;

public class flipp_tri {

			public static void main (String []args) {
			Scanner ab = new Scanner(System.in);
			 System.out.print("enter the no.:");
			int m= ab.nextInt();

				for (int i=1;i<=m;i++) {
					for (int j=1;j<=m-i;j++ ) {
						System.out.print("+ ");	
					}
					for (int j=1;j<=i;j++ ) {
							System.out.print(j+" ");
							
						}	
			System.out.println();
		}
			}}	
					

