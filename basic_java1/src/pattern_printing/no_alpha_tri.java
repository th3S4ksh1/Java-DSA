package pattern_printing;

import java.util.Scanner;

public class no_alpha_tri {

	public static void main(String[] args) {
			Scanner ab = new Scanner(System.in);
			 System.out.print("enter the no.:");
			int m= ab.nextInt();
				for (int i=1;i<=m;i++) {
					for (int j=1;j<=i;j++ ) {
						if (i%2 !=0)
						System.out.print(j+" ");
						else {
							System.out.print((char)(j+64)+" ");
						}
				
			}
			System.out.println();
	}
				Scanner a = new Scanner(System.in);
				 System.out.print("enter the no.:");
				int k= a.nextInt();
					for (int i=1;i<=m;i++) {
						for (int j=1;j<=k+1-i;j++) {
							System.out.print("* ");
					
				}
				System.out.println();
			}

}
}


