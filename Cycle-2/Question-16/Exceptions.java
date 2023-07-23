/*
 * Write a program to illustrate exception handling in Java for the following exception.
 * a. Number format exception
 * b. Null point exception
 */

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println("You entered: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number!");
        }

        try {
            int arr[] = null;
            System.out.println(arr.length);
        } catch (NullPointerException e) {
            System.out.println("Error: Null pointer exception!");
        }

        scanner.close();
    }
}

/**
 *___Output___
 * Enter a number: abc
 * Error: Invalid number!
 * Error: Null pointer exception!
 */