
/**
 * Write a program to create a class DynamicArray to implement a dynamic array. Provide
 * a. Constructor to initialize the array
 * b. Function to print array
 * c. Function to add elements to a position (if position not specified, add to end)
 * d. Function to remove elements
 * e. Function to search an element
 */

import java.util.ArrayList;

class DynamicArray<T> {
    private ArrayList<T> arrayList;

    public DynamicArray() {
        arrayList = new ArrayList<>();
    }

    public void printArray() {
        System.out.println(arrayList);
    }

    public void add(T element) {
        arrayList.add(element);
    }

    public void add(int index, T element) {
        if (index < 0 || index > arrayList.size()) {
            System.out.println("Invalid index");
            return;
        }
        arrayList.add(index, element);
    }

    public void remove(int index) {
        if (index < 0 || index >= arrayList.size()) {
            System.out.println("Invalid index");
        }
        arrayList.remove(index);
    }

    public int search(T element) {
        return arrayList.indexOf(element);
    }
}

public class DynamicArrayMain {
    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>();
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.printArray();

        dynamicArray.add(1, 15);
        dynamicArray.printArray();

        dynamicArray.remove(2);
        dynamicArray.printArray();

        int index = dynamicArray.search(15);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        DynamicArray<String> stringArray = new DynamicArray<>();
        stringArray.add("A");
        stringArray.add("B");
        stringArray.add("C");
        stringArray.printArray();
    }
}

/**
 * ___Output___
 * [10, 20, 30]
 * [10, 15, 20, 30]
 * [10, 15, 30]
 * Element found at index: 1
 * [A, B, C]
 */
