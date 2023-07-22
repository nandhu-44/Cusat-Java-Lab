/**
 * Write a program to create a class employee having members Employee id, Employee name, date 
 * of birth, date of joining, and salary. Read the details of n employees, sort the employee list in the 
 * descending order of salary, and print it. (Note use nested class for date of birth and date of joining).
 */

import java.util.Scanner;

class Employee {
    private int employeeId;
    private String employeeName;
    private Date dateOfBirth;
    private Date dateOfJoining;
    private double salary;

    public Employee(int employeeId, String employeeName, Date dateOfBirth, Date dateOfJoining,
            double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
    }

    public static class Date {
        private int day;
        private int month;
        private int year;

        public Date(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        @Override
        public String toString() {
            return day + "/" + month + "/" + year;
        }
    }

    public void print() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public double getSalary() {
        return salary;
    }

}

class EmployeeList {
    int count;
    Employee[] employees;

    public EmployeeList(int count) {
        this.count = count;
        employees = new Employee[count];
    }

    public void print() {
        System.out.println("-----Sorted List-----\n");
        for (int i = 0; i < count; i++) {
            employees[i].print();
        }
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < count; i++) {
            System.out.println("\n-----Employee " + (i + 1) + "-----");
            int employeeId = i + 1;
            System.out.print("Employee Name: ");
            String employeeName = scanner.next();
            System.out.print("Enter date of birth (dd mm yyyy): ");
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();
            Employee.Date dateOfBirth = new Employee.Date(day, month, year);
            System.out.print("Enter date of joining (dd mm yyyy): ");
            day = scanner.nextInt();
            month = scanner.nextInt();
            year = scanner.nextInt();
            Employee.Date dateOfJoining = new Employee.Date(day, month, year);
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            employees[i] = new Employee(employeeId, employeeName, dateOfBirth, dateOfJoining,
                    salary);
            scanner.nextLine();
        }
        scanner.close();

    }

    public void sort() {
        for (int i = 1; i < count; i++) {
            Employee current = employees[i];
            int j = i - 1;
            while (j >= 0 && current.getSalary() > employees[j].getSalary()) {
                employees[j + 1] = employees[j];
                j--;
            }
            employees[j + 1] = current;
        }
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int count = scanner.nextInt();
        EmployeeList employeeList = new EmployeeList(count);
        employeeList.read();
        employeeList.sort();
        employeeList.print();
        scanner.close();
    }
}

/**
 * ___Output___
 * Enter number of employees: 3
 * 
 * -----Employee 1-----
 * Employee Name: A
 * Enter date of birth (dd mm yyyy): 1 1 2000
 * Enter date of joining (dd mm yyyy): 1 1 2020
 * Salary: 10000
 * 
 * -----Employee 2-----
 * Employee Name: B
 * Enter date of birth (dd mm yyyy): 1 1 2000
 * Enter date of joining (dd mm yyyy): 1 1 2020
 * Salary: 20000
 * 
 * -----Employee 3-----
 * Employee Name: C
 * Enter date of birth (dd mm yyyy): 1 1 2000
 * Enter date of joining (dd mm yyyy): 1 1 2020
 * Salary: 15000
 * 
 * -----Sorted List-----
 * 
 * Employee ID: 2
 * Employee Name: B
 * Date of Birth: 1/1/2000
 * Date of Joining: 1/1/2020
 * Salary: 20000.0
 * 
 * Employee ID: 3
 * Employee Name: C
 * Date of Birth: 1/1/2000
 * Date of Joining: 1/1/2020
 * Salary: 15000.0
 * 
 * Employee ID: 1
 * Employee Name: A
 * Date of Birth: 1/1/2000
 * Date of Joining: 1/1/2020
 * Salary: 10000.0
 */