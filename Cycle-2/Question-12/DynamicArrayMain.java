/**
 * Write a program to create a class DynamicArray to implement a dynamic array. Provide
 * a. Constructor to initialize the array
 * b. Function to print array
 * c. Function to add elements to a position (if position not specified, add to end)
 * d. Function to remove elements
 * e. Function to search an element
 */

class DynamicArray<T> {
    private Object[] array;
    private int count;
    private static final int DEFAULT_CAPACITY = 1;

    public DynamicArray() {
        array = new Object[DEFAULT_CAPACITY];
        count = 0;
    }

    public void printArray() {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void add(T element) {
        if (count == array.length) {
            resizeArray();
        }
        array[count++] = element;
    }

    public void add(int index, T element) {
        if (index < 0 || index > count) {
            System.out.println("Invalid index");
            return;
        }
        if (count == array.length) {
            resizeArray();
        }
        for (int i = count; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        count++;
    }

    public void remove(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Invalid index");
            return;
        }
        for (int i = index; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    public int search(T element) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    private void resizeArray() {
        Object[] newArray = new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
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
 * 10 20 30
 * 10 15 20 30
 * 10 15 30
 * Element found at index: 1
 * A B C
 */
