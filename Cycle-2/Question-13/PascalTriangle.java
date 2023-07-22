// Write a program to Pascal triangle.

import java.util.Scanner;

public class PascalTriangle {

    private static long ncr(int n, int r) {
        long fact = 1;
        r = Math.min(r, n - r);
        for (int i = 0; i < r; i++) {
            fact *= (n - i);
            fact /= (i + 1);
        }
        return fact;
    }

    private static void generatePascalTriangle(int rows) {
        for (int n = 0; n < rows; n++) {
            for (int r = 0; r <= n; r++) {
                System.out.print(ncr(n, r) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();
        scanner.close();

        generatePascalTriangle(rows);
    }
}

/**
 * ___Output___
 * Enter the number of rows for Pascal's Triangle: 8
 * 1 
 * 1 1 
 * 1 2 1 
 * 1 3 3 1 
 * 1 4 6 4 1 
 * 1 5 10 10 5 1
 * 1 6 15 20 15 6 1
 * 1 7 21 35 35 21 7 1
 */