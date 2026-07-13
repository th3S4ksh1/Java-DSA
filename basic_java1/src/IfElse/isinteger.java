package IfElse;
import java.util.Scanner;

public class isinteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number:");
		double x = sc.nextDouble(); //-8.9
		 int y =(int)x;             //-8
		 if(x-y==0) System.out.println("it is integer");
		 else System.out.println("not integer");
		
	}
	
	}


//logic 2
/*if(x % 1 == 0)
System.out.println("it is integer");
else
System.out.println("not integer");*/ 