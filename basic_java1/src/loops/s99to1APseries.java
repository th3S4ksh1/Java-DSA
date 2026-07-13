package loops;
import java.util.Scanner;
public class s99to1APseries {

	public static void main(String[] args) {
		// print 99,95,91,87..... all positive numbers 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no.:");
		int n = sc.nextInt();
		
		for(int i=99;i>=n;i=i-4) {
			System.out.println(i);
			
		}
		//GP print 1,2,4,8
		//a base n=a.r^n-1
		int a=1;
		int r=2;
		System.out.print("Enter the no:");
		int nx= sc.nextInt();
		for (int i=1;i<=nx;i++) {
			System.out.println(+a);
		a*=r;
	}

}
}
