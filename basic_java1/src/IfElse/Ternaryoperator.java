package IfElse;
import java.util.Scanner;
public class Ternaryoperator {

	public static void main(String[] args) {
		// check no is even or odd
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no. :");
		int n = sc.nextInt();
		System.out.println(n+" "+ "is" + " " + ((n%2==0) ? "Even" : "Odd")+" " + "number");
     
		
		// ternary in variables
		Scanner sb = new Scanner(System.in);
		System.out.print("enter the no. :");
		int c = sb.nextInt();
		int sakshi;
		/*if (c>=0) sakshi = 100;
		else sakshi = 0;
		System.out.print(sakshi); */
		
		//by using ternary
		
		 sakshi = (c>=0) ? 100 : 0; 
		 System.out.print(sakshi);
	}

}
