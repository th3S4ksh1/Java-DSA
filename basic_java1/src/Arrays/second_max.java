package Arrays;

public class second_max {

	public static void main(String[] args) {
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		int arr[] = { 1,2 ,3 ,4, 5};
		int n =arr.length;
		for(int i =0;i<n;i++) {
			if(arr[i]>max) 
				max = arr[i];
		}
		for(int i =0;i<n;i++) {
			if(arr[i]>smax && arr[i]!=max) 
				smax = arr[i];
		}
		System.out.println(max);
		System.out.println(smax);
	}

}
