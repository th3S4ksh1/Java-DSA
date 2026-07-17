package Arrays;

public class mutiply_add_odd_even {

	public static void main(String[] args) {
	 int i=0;
	 int[] arr= {10,20,30,40,50,60};
	 int n= arr.length;
	  for( i =0;i<n;i++) {
		if(i%2==0) {
			System.out.print(arr[i]+10+" ");
		}
		else {
			System.out.print(arr[i]*2+" ");
		}
	}
	
	}
}	
