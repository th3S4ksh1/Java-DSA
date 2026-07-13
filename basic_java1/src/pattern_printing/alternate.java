package pattern_printing;

import java.util.Scanner;

public class alternate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i % 2 != 0)   // odd row -> lowercase
                    System.out.print((char)(96 + i) + " ");
                else              // even row -> uppercase
                    System.out.print((char)(64 + i) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}