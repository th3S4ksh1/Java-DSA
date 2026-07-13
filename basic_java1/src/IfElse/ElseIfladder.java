package IfElse;
import java.util.Scanner;
public class ElseIfladder {

	public static void main(String[] args) {
	System.out.print("enter the no.:");
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	/*if (x%3!=0 && x%5==0) {
	    System.out.println("no. is divisible by 5");
	}
	else if(x%3==0 && x%5!=0) {
	    System.out.println("no. is divisible by 3");
	}
	else if (x%3==0 && x%5==0) {
		System.out.println("no.is divisible by 3 and 5 both");
	}
	else if (x%3!=0 && x%5!=0)
		System.out.println("not divisible by 3 or 5");
	*/
    
	
	if (x%3==0 && x%5==0) {
	    System.out.println("no. is divisible by 5 and 3 both");
	}
	else if(x%3==0 ) {
	    System.out.println("no. is divisible by 3");
	}
	else if (x%5==0) {
		System.out.println("no.is divisible by 5");
	}
	else 
		System.out.println("not divisible by 3 or 5");
}
	
}
