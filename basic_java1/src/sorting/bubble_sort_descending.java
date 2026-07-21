package sorting;

public class bubble_sort_descending {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		for(int i =0;i<n-1;i++) {
			 int swap=0;
			 for(int j=0;j<n-1;j++) {
				 if(arr[j]<arr[j+1]) {
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


