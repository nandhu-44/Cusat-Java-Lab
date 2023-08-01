//  Write a program to illustrate user-defined exceptions.

import java.util.Scanner;

class UnderAgeRestrictionException extends Exception {
    public UnderAgeRestrictionException() {
        super("You are under the age of 18!");
    }

    public UnderAgeRestrictionException(String message) {
        super(message);
    }
}

class DriverLisence {
    String name;
    int age;
    int lisenceNumber;

    public DriverLisence(String name, int age, int lisenceNumber) throws UnderAgeRestrictionException {
        this.name = name;
        if (age < 18) {
            throw new UnderAgeRestrictionException("You are not eligible for a driving lisence!");
        }
        this.age = age;
        this.lisenceNumber = lisenceNumber;
    }

    public String toString() {
        return "Name : " + name + "\nAge : " + age + "\nLisence Number : " + lisenceNumber;
    }
}

public class UserException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age : ");
        int age = scanner.nextInt();
        System.out.print("Enter Lisence number : ");
        int lisenceNumber = scanner.nextInt();
        try {
            DriverLisence driverLisence = new DriverLisence(name, age, lisenceNumber);
            System.out.println(driverLisence);
        } catch (UnderAgeRestrictionException exception) {
            System.out.println("Caught UnderAgeException : " + exception.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/**
 * ___Output___
 * Enter name: Nandhu
 * Enter age : 17
 * Enter Lisence number : 1234
 * Caught UnderAgeException : You are not eligible for a driving lisence!
 */