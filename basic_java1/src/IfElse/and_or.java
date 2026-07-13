package IfElse;
import java.util.Scanner;
public class and_or {

	public static void main(String[] args) {
		//check no is 4 digit or not
	System.out.println("Enter the no:");
	Scanner sc = new Scanner(System.in);	
	int n = sc.nextInt();
	if(n>999 && n<10000)
		System.out.println("no. is 4 digit");
	else 
		System.out.print("no. is not 4 digit");
	
	// take input and check no is divisible by 3 or 5
	System.out.print("Enter the no:");
	Scanner sa = new Scanner(System.in);	
	int x = sa.nextInt();
	
	if(x%3==0 || x%5==0)
		System.out.println("no.is divisible by 3 or 5");
	else System.out.println("no. is not divisible by 3 or 5");
	}

}
