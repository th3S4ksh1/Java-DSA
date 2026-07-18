package Arrays;

public class segregate_0_1 {

	public static void main(String[] args) {
		int[] arr= {1,0,0,0,1,1,1,0};
		segregate0and1(arr);
	}
    public static void segregate0and1(int[] arr) {
		        int n=arr.length;
		        int i=0;
		        int j=n-1;
		        while(i<j){
		            if (arr[i] == 0) {
		                i++;
		            } 
		            else if (arr[j] == 1) {
		                j--;
		            }
		            else{
		            int temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		            i++;
		            j--;
		            }
		        }
		        for (int ele : arr) {
		            System.out.print(ele + " ");
		        }
		    }
		}


