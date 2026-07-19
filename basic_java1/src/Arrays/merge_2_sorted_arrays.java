 package Arrays;

public class merge_2_sorted_arrays {

	public static void main(String[] args) {
		int a[] = {2,5,6,9,20};
		int b[] = {1,3,4,7,8,90};
		int c[] = new int[a.length+b.length];
		
		for(int ele: c) {
			System.out.print(ele+" ");
		}
		System.out.println(" ");
		merge(a,b,c);
		for(int ele: c) {
			System.out.print(ele+" ");
		}

	}

	private static void merge(int[] a, int[] b, int[] c) {
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				c[k]=a[i];
				i++;
			}
			else {
				c[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<a.length) {
			c[k++]=a[i++];
		}
		while(j<b.length) {
			c[k++]=b[j++];
		}
	}

}
