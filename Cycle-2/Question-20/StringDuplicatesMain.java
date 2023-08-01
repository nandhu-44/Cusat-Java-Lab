//  Write a program to remove duplicate elements from a string array using tree set collection.

import java.util.TreeSet;

public class StringDuplicatesMain {
    public static void main(String[] args) {
        String[] stringArray = { "A", "B", "C", "A", "B", "C", "D", "E", "H", "F", "G", "H", "E", "D", "F" };
        TreeSet<String> treeSet = new TreeSet<>();
        for (String string : stringArray) {
            if (!treeSet.contains(string)) {
                treeSet.add(string);
            }
        }
        System.out.println(treeSet);
        System.out.println("Removed " + (stringArray.length - treeSet.size()) + " duplicate elements.");
    }
}

/*
 * ___Output___
 * [A, B, C, D, E, F, G, H]
 * Removed 7 duplicate elements.
 */