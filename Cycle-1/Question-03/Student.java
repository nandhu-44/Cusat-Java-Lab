
/**
 * Write a program to write a class Student having members ‘name’, ‘roll
 * number’, ‘5 subject marks’ and ‘total’. Provide methods for
 * a) Initializing name, roll number and marks.
 * b) Calculate the total
 * c) Get back the total
 * d) Print the details
 * Create 2 Student objects and print the details of the student with a greater total.
 */
import java.util.Arrays;

class Student {
    private String name;
    private int rollNumber;
    private int[] marks = new int[5];
    private int total;

    Student() {
    }

    Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }

    public void initialize(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }

    public void calculateTotal() {
        int sum = 0;
        for (int i : this.marks) {
            sum += i;
        }
        this.total = sum;
    }

    public int getTotal() {
        return this.total;
    }

    public void printDetails() {
        System.out.println(
                "\n-----Student Details-----\nName : " + this.name + "\nRoll Number : " + this.rollNumber + "\nMarks : "
                        + Arrays.toString(this.marks) + "\nTotal : " + this.total);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        int[] marks1 = { 90, 95, 80, 70, 100 };
        int[] marks2 = { 80, 85, 90, 95, 100 };
        student1.initialize("Adam", 1, marks1);
        student2.initialize("Eve", 2, marks2);
        student1.calculateTotal();
        student2.calculateTotal();
        student1.printDetails();
        student2.printDetails();
        if (student1.getTotal() > student2.getTotal()) {
            System.out.println("\nTotal marks of student 1 : " + student1.getTotal());
        } else {
            System.out.println("\nTotal marks of student 2 : " + student2.getTotal());
        }
    }
}

/**
 * ___Output___
 * $javac Student.java
 * $java Student
 * 
 * -----Student Details-----
 * Name : Adam
 * Roll Number : 1
 * Marks : [90, 95, 80, 70, 100]
 * Total : 435
 * 
 * -----Student Details-----
 * Name : Eve
 * Roll Number : 2
 * Marks : [80, 85, 90, 95, 100]
 * Total : 450
 * 
 * Total marks of student 2 : 450
 */