package Arrays;

public class rotate_array {
	public static void main(String[] args) {
		int[]arr1= {1,2,3,4,5};
		int d=2;
		rotateArr(arr1,d);
	
		for(int ele : arr1) {
			System.out.print(ele+" ");
		}
	}
	public static void rotateArr(int arr1[], int d) {
		int n = arr1.length;
		d= d%n;
		reverse(arr1,0,d-1);
		reverse(arr1,d,n-1);
		reverse(arr1,0,n-1);     
		    }
		    
	public static void reverse(int []arr1,int i,int j){
		        while(i<j){
		            int temp=arr1[i];
		            arr1[i]=arr1[j];
		            arr1[j]=temp;
		            i++;
		            j--;
		        }
		    }
		    
		}


