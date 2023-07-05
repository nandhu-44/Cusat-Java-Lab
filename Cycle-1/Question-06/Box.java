/*
 * Write a program to create a class called Rectangle with members length, breadth and area.
 * Provide functions to find area and get back the area. Create a new class Box by extending
 * Rectangle class add two new members, height and volume and also new functions to calculate and get back the volume.
 */

import java.util.Scanner;

class Rectangle {
    protected int length;
    protected int breadth;
    protected float area;

    Rectangle() {
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calcArea() {
        this.area = this.length * this.breadth;
    }

    public float getArea() {
        return this.area;
    }
}

class Box extends Rectangle {
    private int height;
    private float volume;

    Box() {
    }

    Box(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    public void calcArea() {
        this.area = 2 * (this.length * this.breadth + this.breadth * this.height + this.height * this.length);
    }

    public float getArea() {
        return this.area;
    }

    public void calcVolume() {
        this.volume = this.length * this.breadth * this.height;
    }

    public float getVolume() {
        return this.volume;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length, breadth and height of the box : ");
        Box box = new Box(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        scanner.close();
        box.calcArea();
        box.calcVolume();
        System.out.println("Area of the box is " + box.getArea());
        System.out.println("Volume of the box is " + box.getVolume());
    }
}

/**
 * ___Output___
 * $ javac Box.java
 * $ java Box
 * Enter the length, breadth and height of the box : 10 20 30
 * Area of the box is 2200.0
 * Volume of the box is 6000.0
 */