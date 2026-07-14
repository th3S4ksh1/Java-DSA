package Arrays;

public class passing_array_to_methods {

	/*
	 * public static void main(String[] args) { 
	 * int x=10;
	 * change(x);
	 * System.out.println(x); } 
	 * public static void change(int x) {
	 * x =20;
	 * 
	 * }
	 */
	public static void main(String[] args) {
		int [] x= {1,2,3,4};
		System.out.println(x[2]);
		change(x);
		System.out.print(x[2]);
	}
	 public static void change(int[] y) {    //take x instead of y then it also show correct output
		 y[2]=78;
		 
	 }
}
