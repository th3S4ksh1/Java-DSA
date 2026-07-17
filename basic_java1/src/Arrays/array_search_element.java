package Arrays;
import java.util.Scanner;
public class array_search_element {

	public static void main(String[] args) {
		/*
		 * int[] arr= {10,20,30,40};
		 *  for(int i=0;i<arr.length;i++) { 
		 *  if(arr[i]==20) {
		 * System.out.println("found");
		 *  return; //current program exit here 
		 *  }
		 *   }
		 * System.out.println("not found");
		 */
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the size of element:");
		int n=sc.nextInt();		
		int[]arr= new int[ n];
		System.out.print("eneter the array elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		System.out.println("enter the no. want to traverse:");
		int t=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==t) {
				System.out.print("found");
				return;	
			}
	    }
		System.out.print("not found");
    }
}

