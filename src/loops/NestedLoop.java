package loops;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        /* Nested loop - a loop inside a loop */

        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        String symbol = "";

        System.out.print("Enter # of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter # of cols: ");
        cols = scanner.nextInt();

        System.out.print("Enter symbol to use: ");
        symbol = scanner.next();

        for (int i = 1; i<=rows; i++) {
            System.out.println();
            for (int j = 1; j<=cols; j++) {
                System.out.print(symbol);
            }
        }

    }
}
