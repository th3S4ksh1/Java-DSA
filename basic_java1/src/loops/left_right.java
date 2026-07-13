package loops;
import java.util.Scanner;
public class left_right {

	public static void main(String[] args) {
	//print patter like 1 n 2 n-1 3 n-2......
		System.out.print("Enter the no:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 int left =1;
		 int right =n;
		 
		 for(left=1,right=n;left<=right;left++,right--) {
			 if(left==right) {
				 System.out.print(left+" ");
			 }
			 else {
				 System.out.print(left + " "+ right+ " ");
			 }
			 
		 }
	}

}
