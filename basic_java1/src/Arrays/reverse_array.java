package Arrays;

public class reverse_array {

	public static void main(String[] args) {
		int []arr= {6,1,2,9,7,10};
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			}
		for(int element:arr) {
			System.out.print(element+" ");
		}
	}

}
