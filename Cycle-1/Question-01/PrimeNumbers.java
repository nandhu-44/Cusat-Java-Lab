// Write a program to print first ‘n’ prime numbers (read ‘n’ as a command line argument).

class PrimeNumbers {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }
        int number = Integer.parseInt(args[0]);
        printPrimeNumbers(number);
    }

    public static void printPrimeNumbers(int n) {
        System.out.print("First " + n + " prime numbers : ");
        int count = 0;
        for (int number = 2; count < n; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/**
 * ___Output___
 * $ javac PrimeNumbers.java
 * $ java PrimeNumbers 10
 * First 10 prime numbers : 2 3 5 7 11 13 17 19 23 29
 */