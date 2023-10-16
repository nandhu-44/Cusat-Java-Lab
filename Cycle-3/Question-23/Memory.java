// Write a program to find out total memory, free memory and free memory after executing garbage Collector (gc).

public class Memory {
    public static void displayMemoryDetails() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory: " + convert((long) runtime.totalMemory()));
        System.out.println("Free Memory: " + convert((long) runtime.freeMemory()));
    }

    private static String convert(long memoryinBytes) {
        return String.valueOf(memoryinBytes / 1024 / 1024) + " MB";
    }

    public static void main(String[] args) {
        System.out.println("-----Before Garbage Collection-----");
        Memory.displayMemoryDetails();
        System.gc();
        System.out.println("\n-----After Garbage Collection-----");
        Memory.displayMemoryDetails();
    }
}