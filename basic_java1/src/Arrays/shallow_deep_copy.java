package Arrays;
import java.util.Arrays;
public class shallow_deep_copy {

	public static void main(String[] args) {
		int []arr= {1, 2 ,3,4};
		int []shallow = arr;
		shallow[2]=-1;
			System.out.println(arr[2]);  //shallow copy
			System.out.println(shallow[2]);
			
		int []arrr= {11, 22 ,33,44};
		int []deep = Arrays.copyOf(arrr,arrr.length);
		deep[0]=100;
			System.out.println(arrr[0]);  //deep copy
			System.out.println(deep[0]);
			}
		}
	


