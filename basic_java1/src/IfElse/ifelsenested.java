package IfElse;
import java.util.Scanner;
public class ifelsenested {

	public static void main(String[] args) {
		// take 3 no. and find greater among them 
	Scanner sc = new Scanner(System.in);
	System.out.print("eneter the first no. :");
	int a = sc.nextInt();
	System.out.print("eneter the second no. :");
	int b = sc.nextInt();
	System.out.print("eneter the third no. :");
	int c = sc.nextInt();
	
	if(a>b) { // b is minimum
		if(a>c)  System.out.println("greatest no. is :"+a);
		else System.out.println("greatest no. is :"+c);
	}
	else {
		if(b>c) System.out.println("greater no. is :"+b);
		else System.out.println("greater no. is :"+c);
	}


}
	}

