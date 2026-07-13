package loops;
import java.util.Scanner;
public class AP {

	public static void main(String[] args) {
		// display AP 2,5,8.. take n input
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the no.:");
	int n = sc.nextInt();
	//AP =a+(n-1)d	
      //=2+(n-1)3
	//=2+3n-3
	//3n-1  -------- condition
	
	for(int i=2;i<=3*n-1;i+=3) {
		System.out.println(i);
	}
	
	// here we depend on the formula but without formula we can try by initializing another variables
	
	//print AP 4,10,16,22.... as difference of 6
	int a =4;
	int d = 6;
	for (int i=1;i<=n;i++) {
		System.out.println(a);
		a+=d;
	}
	}

}
