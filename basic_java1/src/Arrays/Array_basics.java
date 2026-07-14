package Arrays;

public class Array_basics {

	public static void main(String[] args) {
		int[] x = {6,19,7,69,9 ,171,5};
		System.out.println(x);    // [I@5ca881b5 shows this output
		// because Java prints the array object's reference (memory representation),
		// not its contents.
		
		System.out.println(x[0]);   //6
		
		x[5]=62;     //updating the element
		System.out.println(x[5]);
		
		int [] arr = new int [4]; //creating the new array whose size is 4
		arr[0]=1;
		arr[1]=11;
		arr[2]=111;
		arr[3]=1111;
		
        System.out.println(arr[1]);
	}

}
