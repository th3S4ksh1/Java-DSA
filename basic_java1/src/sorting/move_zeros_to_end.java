package sorting;
import java.util.ArrayList;
import java.util.Scanner;

public class move_zeros_to_end {

    public static void pushZerosToEnd(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();

        // Store all non-zero elements
        for (int ele : arr) {
            if (ele != 0) {
                list.add(ele);
            }
        }

        // Add zeros at the end
        while (list.size() < arr.length) {
            list.add(0);
        }

        // Copy ArrayList back to array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        
        System.out.println("Array after moving zeros to the end:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    
		    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        pushZerosToEnd(arr);

    }
}
