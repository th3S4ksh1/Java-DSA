package Arrays;
import java.util.Scanner;
public class user_input_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//creating array
		int[] arr=new int[7];
		System.out .print("enter the 7 input:");
		//input
		for(int i =0;i<7;i++) {
			arr[i]=sc.nextInt();
		}
		//output
		System.out.print("");

		for(int i=0;i<7;i++) {
			System.out.print(arr[i]+" ");
		}
}
}