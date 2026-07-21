package sorting;

public class Bubble_sorting {

	public static void main(String[] args) {
		
		 int arr[] = {3,5,1,2,4,0};
		 int n =arr.length; 
		 /* for(int i =0;i<n-1;i++) {
		 * for(int j=0;j<n-1;j++) {
		 *  if(arr[j]>arr[j+1]) {
		 *   int temp=arr[j];
		 *   arr[j]=arr[j+1];
		 *    arr[j+1]=temp;
		 */
		 
		 //better than above
			/*
			 * for(int i =0;i<n-1;i++) { 
			 * for(int j=0;j<n-1-i;j++) { 
			 * if(arr[j]>arr[j+1]) {
			 * int temp=arr[j];
			 *  arr[j]=arr[j+1]; 
			 *  arr[j+1]=temp;
			 */
		 
			/* better
			 * for(int i =0;i<n-1;i++) {
			 * boolean issorted=true; 
			 * for(int j=0;j<n-1-i;j++) {
			 * issorted=false; 
			 * break;
             } if(issorted==true)
              break; 
              for(int j=0;j<n-1-i;j++) {
			 * if(arr[j]>arr[j+1])
			 *  { int temp=arr[j]; 
			 *  arr[j]=arr[j+1]; 
			 *  arr[j+1]=temp;
			 */
		  
		 //most efficient
		 for(int i =0;i<n-1;i++) {
		 int swap=0;
		 for(int j=0;j<n-1;j++) {
			 if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swap++;
		 
			}
		 }
		 if (swap==0) break;
			}
		
		print(arr);
	}
	public static void print(int [] arr) {
		for(int ele:arr) {
		System.out.print(ele+" ");
		}
	
	}
}
