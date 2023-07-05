
/**
 * Write a program to create a class Employee with data members name, code and basic pay
 * and with functions to initialize and print information. Create an interface Salary with a
 * function salary calculation. By inheriting the Employee class and Salary Interface create a
 * new class SalarySlip which override the salary calculation method to calculate the net salary
 * of an employee from basic pay. Provide a function to print the Salary Slip of the employee in SalarySlip class.
 */

import java.util.Scanner;

interface Salary {
    public void calculateSalary();
}

class Employee {
    String name;
    int code;
    double basicPay;

    Employee() {
    }

    public void initialize(String name, int code, double basicPay) {
        this.name = name;
        this.code = code;
        this.basicPay = basicPay;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Code: " + code);
        System.out.println("Basic Pay: " + basicPay);
    }
}

class SalarySlip extends Employee implements Salary {
    double netSalary;

    SalarySlip() {
    }

    public void calculateSalary() {
        netSalary = basicPay * 1.2;
    }

    public void printSalarySlip() {
        System.out.println("Net Salary: " + netSalary);
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter code: ");
        int code = scanner.nextInt();
        System.out.print("Enter basic pay: ");
        double basicPay = scanner.nextDouble();

        SalarySlip salarySlip = new SalarySlip();
        salarySlip.initialize(name, code, basicPay);
        salarySlip.calculateSalary();

        System.out.println("\n-----Employee Information-----");
        salarySlip.printInfo();

        System.out.println("\n-----Salary Slip-----");
        salarySlip.printSalarySlip();

        scanner.close();
    }
}

/**
 * ___Output___
 * $ javac EmployeeMain.java
 * $ java EmployeeMain
 * Enter name: Nandhu
 * Enter code: 123
 * Enter basic pay: 50000
 * 
 * -----Employee Information-----
 * Name: Nandhu
 * Code: 123
 * Basic Pay: 50000.0
 * 
 * -----Salary Slip-----
 * Net Salary: 60000.0
 */