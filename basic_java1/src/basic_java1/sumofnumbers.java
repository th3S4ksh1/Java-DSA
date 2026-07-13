package basic_java1;
import java.util.Scanner;
public class sumofnumbers {

	public static void main(String[] args) {
		Scanner sakshi = new Scanner(System.in);
		System.out.print("enter the 1st no:");
		int x = sakshi.nextInt();
		System.out.print("enter the 2nd no:");
		int y = sakshi.nextInt();
		System.out.print("enter the 3rd no:");
		int z = sakshi.nextInt();
		System.out.print("SUM OF THREE NUMBERS:");
        System.out.println(x+y+z);
        System.out.print("modulus function:");
        System.out.println(x%y);
	}

}
