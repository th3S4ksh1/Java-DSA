package Arrays;

public class product_of_array {

	public static void main(String[] args) {
		int []arr= { 3,7,3};
		int product=1;
		for(int i=0;i<arr.length;i++) {
			product*=arr[i];
		}
		System.out.println(product);
		
	}

}
