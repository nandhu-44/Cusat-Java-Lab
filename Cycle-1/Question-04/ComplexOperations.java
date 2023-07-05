
/*
 * Write a program to create a class Complex have two members, real and imaginary and methods to initialize and print the complex number.
 * Create another class ComplexOperations and provide static methods to add, multiply and get the modulus.
 */

import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    Complex() {
    }

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void initialize(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void printComplex() {
        System.out.println(this.real + (this.imaginary > 0 ? " + " : " - ") + Math.abs(this.imaginary) + "i");
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }
}

class ComplexOperations {
    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.getReal() + c2.getReal(), c1.getImaginary() + c2.getImaginary());
    }

    public static Complex multiply(Complex c1, Complex c2) {
        return new Complex(c1.getReal() * c2.getReal() - c1.getImaginary() * c2.getImaginary(),
                c1.getReal() * c2.getImaginary() + c1.getImaginary() * c2.getReal());
    }

    public static double getModulus(Complex c) {
        return Math.sqrt(c.getReal() * c.getReal() + c.getImaginary() * c.getImaginary());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        System.out.print("Enter the real and imaginary parts of the first complex number : ");
        c1.initialize(scanner.nextDouble(), scanner.nextDouble());
        System.out.print("Enter the real and imaginary parts of the second complex number : ");
        c2.initialize(scanner.nextDouble(), scanner.nextDouble());
        scanner.close();
        System.out.print("The first complex number is : ");
        c1.printComplex();
        System.out.print("The second complex number is : ");
        c2.printComplex();
        System.out.print("The sum of the two complex numbers is : ");
        add(c1, c2).printComplex();
        System.out.print("The product of the two complex numbers is : ");
        multiply(c1, c2).printComplex();
        System.out.print("The modulus of the first complex number is : ");
        System.out.println(getModulus(c1));
        System.out.print("The modulus of the second complex number is : ");
        System.out.println(getModulus(c2));
    }
}

/**
 * ___Output___
 * $ javac Complex.java
 * $ java Complex
 * Enter the real and imaginary parts of the first complex number : 12 -13
 * Enter the real and imaginary parts of the second complex number : 3 4
 * The first complex number is : 12.0 - 13.0i
 * The second complex number is : 3.0 + 4.0i
 * The sum of the two complex numbers is : 15.0 - 9.0i
 * The product of the two complex numbers is : 88.0 + 9.0i
 * The modulus of the first complex number is : 17.69180601295413
 * The modulus of the second complex number is : 5.0
 */