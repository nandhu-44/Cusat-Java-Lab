/* Write a program to create a class Box with data members length, breadth, height, area and 
* volume. Provide 3 constructors having one parameter (for cube), two parameters (for 
* square prism) three parameters (rectangular prism). Also provide functions to calculate area 
* and volume.
*/

import java.util.Scanner;

public class Box {
    private int length;
    private int breadth;
    private int height;
    private double area;
    private double volume;

    Box(int side1) {
        this.length = this.breadth = this.height = side1;
    }

    Box(int side1, int side2) {
        this.length = this.breadth = side1;
        this.height = side2;
    }

    Box(int side1, int side2, int side3) {
        this.length = side1;
        this.breadth = side2;
        this.height = side3;
    }

    public void calcArea() {
        this.area = 2 * (this.length * this.breadth + this.breadth * this.height + this.height * this.length);
    }

    public void calcVolume() {
        this.volume = this.length * this.breadth * this.height;
    }

    public double getArea() {
        return this.area;
    }

    public double getVolume() {
        return this.volume;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the cube: ");
        Box cube = new Box(scanner.nextInt());
        System.out.print("Enter the length and height of the square prism : ");
        Box squarePrism = new Box(scanner.nextInt(), scanner.nextInt());
        System.out.print("Enter the length, breadth and height of the rectangular prism : ");
        Box rectangularPrism = new Box(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.close();
        cube.calcArea();
        cube.calcVolume();
        squarePrism.calcArea();
        squarePrism.calcVolume();
        rectangularPrism.calcArea();
        rectangularPrism.calcVolume();
        System.out.println("\n-----Cube-----\n" + "Area : " + cube.getArea() + ", Volume : " + cube.getVolume()
                + "\n\n-----Square Prism-----\n" + "Area : " + squarePrism.getArea() + ", Volume : "
                + squarePrism.getVolume() + "\n\n-----Rectangular Prism-----\n" + "Area : " + rectangularPrism.getArea()
                + ", Volume : " + rectangularPrism.getVolume());
    }
}

/**
 * ___Output___
 * $ javac Box.java
 * $ java Box
 * Enter the length of the cube: 10
 * Enter the length and height of the square prism : 5 6
 * Enter the length, breadth and height of the rectangular prism : 7 8 9
 * 
 * -----Cube-----
 * Area : 600.0, Volume : 1000.0
 * 
 * -----Square Prism-----
 * Area : 170.0, Volume : 150.0
 * 
 * -----Rectangular Prism-----
 * Area : 382.0, Volume : 504.0
 */