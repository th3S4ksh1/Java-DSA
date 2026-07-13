package basic_java1;
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		/* int r = 3;
		System.out.println(3.14*r*r);
		*/
		
		 /* int r = 3;
		int area = 3.14*r*r;
		System.out.println(area);
		*/  
		//this shows error bcoz of decimal so use double
		
		/*double r = 3.8;
		double a = 3.141592*r*r;
		System.out.println(a);
		*/
		
		//volume of sphere 
		/*double R= 3;
		double v = 4/3 * 3.14 *R *R *R;
		System.out.println(v);
		*/
		
		//user input
		System.out.println("enter the radius");
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		double a = 3.141592 * r *r;
		System.out.println("Area is :\n" +a);
		
		System.out.print("eneter the value to do the square:");
		int x = sc.nextInt();
		int y = x*x;
		System.out.println("suare is:"+y);
	}

}

