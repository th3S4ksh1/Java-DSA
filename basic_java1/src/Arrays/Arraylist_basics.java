package Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Arraylist_basics {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();
		arr.add(25);
		arr.add(21);
		arr.add(18);
		arr.add(5);
		arr.add(10);
		
		System.out.println(arr.get(2));
		
		arr.set(3, 100);
		System.out.println(arr);
		
		
		/*
		 * for(int i=0;i<arr.size();i++) 
		 * { System.out.print(arr);// it print whole array
		 * to the lengt as 5 times
		 */
		int n=arr.size();
		for(int i=0;i<n;i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println(" ");
		for(int ele:arr) {
			System.out.print(ele+" ");	
		}
		
		System.out.println(" ");
		arr.add(2,200);
		System.out.print(arr);
		
        System.out.println(" ");
		arr.add(69);
		System.out.print(arr);
		
//		System.out.println(" ");
//		arr.remove(2);
//		System.out.print(arr);
//		
		
//      here we not mention the arr size after adding so dont remove last ele
//      System.out.println(" ");
//		arr.remove(n-1); //remove last element
//		System.out.print(arr);
//		
		n=arr.size();
		System.out.println(" ");
		arr.remove(n-1); //remove last element
		System.out.print(arr);
		
		System.out.println(" ");
		Collections.reverse(arr); //reversing the array
		System.out.print(arr);
		
		//reverse array by using the swap
		int i =0;
		int j=arr.size()-1;
		while(i<j) {
			int temp=arr.get(i);
			arr.set(i,arr.get(j));
			arr.set(j,temp);
			i++;
			j--;
		}
		System.out.println(" ");
		for(int ele:arr) {
			System.out.print(ele+" ");	
		}
		
		
	}

}
