//  Write a program to read a number ‘n’ and a string ‘str’ as a command line argument and print ‘str’ n times.

class Str {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide a number and a string as command-line arguments.");
            return;
        }
        int number = Integer.parseInt(args[0]);
        String str = args[1];
        printString(number, str);
    }

    public static void printString(int n, String str) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }
}

/**
 * ___Output___
 * $ javac Str.java
 * $ java Str 5 Hello
 * Hello
 * Hello
 * Hello
 * Hello
 * Hello
 */
