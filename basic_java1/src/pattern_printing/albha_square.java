package pattern_printing;

import java.util.Scanner;

public class albha_square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no.:");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
			System.out.print((char) ( j+64 )+" ");
			
		}
		System.out.println();
	}
		Scanner ab = new Scanner(System.in);
		System.out.print("enter the no.:");
		int m = sc.nextInt();
		for (int i=1;i<=m;i++) {
			for (int j=1;j<=m;j++) {
			System.out.print((char) ( j+96 )+" ");
			
		}
		System.out.println();
	}

}
}