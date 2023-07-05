/*
 * Write a program to create an interface, 3DShapes with methods printVolume()
 * and printArea(), which prints the Volume and Area respectively.
 * Create classes Cylinder and Sphere by implementing 3DShapes interface.
 * Using these child classes calculate the print volume and area of a cylinder and sphere.
 */

import java.util.Scanner;

interface __3DShapes__ {
    void printVolume();

    void printArea();
}

class Cylinder implements __3DShapes__ {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public void printVolume() {
        System.out.println("Volume of Cylinder: " + Math.PI * radius * radius * height);
    }

    @Override
    public void printArea() {
        System.out.println("Area of Cylinder: " + 2 * Math.PI * radius * (radius + height));
    }
}

class Sphere implements __3DShapes__ {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void printVolume() {
        System.out.println("Volume of Sphere: " + 4 * Math.PI * radius * radius * radius / 3);
    }

    @Override
    public void printArea() {
        System.out.println("Area of Sphere: " + 4 * Math.PI * radius * radius);
    }
}

public class ThreeDShapesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double height = scanner.nextDouble();
        System.out.print("Enter radius of sphere: ");
        double radius2 = scanner.nextDouble();
        scanner.close();

        Cylinder cylinder = new Cylinder(radius, height);
        Sphere sphere = new Sphere(radius2);

        System.out.println("\nCylinder: ");
        cylinder.printVolume();
        cylinder.printArea();
        System.out.println("\nSphere: ");
        sphere.printVolume();
        sphere.printArea();
    }
}
/**
 * ___Output___
 * $ javac ThreeDShapesMain.java
 * $ java ThreeDShapesMain
 * Enter radius of cylinder: 12
 * Enter height of cylinder: 5
 * Enter radius of sphere: 6
 * 
 * Cylinder:
 * Volume of Cylinder: 2261.946710584651
 * Area of Cylinder: 1281.7698026646356
 * 
 * Sphere:
 * Volume of Sphere: 904.7786842338604
 * Area of Sphere: 452.3893421169302
 */