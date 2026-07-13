package loops;
import java.util.Scanner;

public class decreasing_loop {

	public static void main(String[] args) {
		// print n to 1
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number:");
	int n = sc.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}

	}

}
