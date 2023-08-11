// Write a program to find out total memory, free memory and free memory after executing garbage Collector (gc).

public class Memory {
    public static void displayMemoryDetails() {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory: " + convert("mb", (long) runtime.totalMemory()));
        System.out.println("Free Memory: " + convert("mb", (long) runtime.freeMemory()));
    }

    private static String convert(String type, long memoryinBytes) {
        if (type == "kb") {
            return String.valueOf(memoryinBytes / 1024) + " KB";
        } else if (type == "mb") {
            return String.valueOf(memoryinBytes / 1024 / 1024) + " MB";
        } else if (type == "gb") {
            return String.valueOf(memoryinBytes / 1024 / 1024 / 1024) + " GB";
        } else {
            return String.valueOf(memoryinBytes);
        }
    }

    public static void main(String[] args) {
        System.out.println("-----Before Garbage Collection-----");
        Memory.displayMemoryDetails();

        System.gc();

        System.out.println("\n-----After Garbage Collection-----");
        Memory.displayMemoryDetails();
    }
}