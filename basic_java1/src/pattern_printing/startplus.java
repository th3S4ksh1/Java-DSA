package pattern_printing;
import java.util.Scanner;
public class startplus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enetr the no.:");
		int n=sc.nextInt();
		int i ;
		int j;
		int mid = n/2 + 1;
		 for (i=1;i<=n;i++) {
			 for(j=1;j<=n;j++) {
				 if(i==mid || j ==mid)
				 System.out.print("*");
				 else {
					 System.out.print(" " );
				 }
			 }
			 System.out.println();
			 
		 }
		

	}

}
