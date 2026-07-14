package Arrays;
import java.util.Scanner;
public class sum_of_elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("sum of array elements:");
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];				
			}
		System.out.print(sum);
	}

}

