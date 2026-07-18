package Arrays;

public class missing_in_array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5};
		System.out.print(missingNum(arr));
	}
	
		 static int missingNum(int arr[]) {
		        long n=arr.length+1;
		        long sum=n*(n+1)/2;
		        long arrsum=0;
		        for(int ele : arr){
		            arrsum +=ele;
		        }
		        return (int)(sum-arrsum);
		    }
}
