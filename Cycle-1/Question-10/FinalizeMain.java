// Write a program to illustrate finalize() method.

class Finalize {
    private int a, b;

    public Finalize(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getProduct() {
        return a * b;
    }

    public void finalize() {
        System.out.println("Cleared memory!");
    }
}

public class FinalizeMain {
    public static void main(String[] args) {
        Finalize object1 = new Finalize(3, 4);
        Finalize object2 = new Finalize(7, 12);
        System.out.println("Object1 product : " + object1.getProduct());
        System.out.println("Object2 product : " + object2.getProduct());
        object1 = null;
        object2 = null;
        System.gc();
    }
}

/**
 * ___Output___
 * $javac FinalizeMain.java
 * $java FinalizeMain
 * Object1 product : 12
 * Object2 product : 84
 * Cleared memory!
 * Cleared memory!
 */