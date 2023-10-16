// Write a program to implement the Tower of Hanoi problem using recursion.

import java.util.Scanner;

public class TowerOfHanoi {

    private static void solveTowerOfHanoi(int disk, char start, char mid, char end) {

        if (disk == 1) {
            System.out.println("Move disk " + disk + " ; " + start + " => " + end);
            return;
        }

        solveTowerOfHanoi(disk - 1, start, end, mid);
        System.out.println("Move disk " + disk + " ; " + start + " => " + end);
        solveTowerOfHanoi(disk - 1, mid, start, end);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int disk = scanner.nextInt();
        scanner.close();

        System.out.println("No. of moves required: " + ((int) Math.pow(2, disk) - 1));
        solveTowerOfHanoi(disk, 'A', 'B', 'C');
    }
}

/**
 *___Output___
 * Enter the number of disks: 3
 * No. of moves required: 7
 * Move disk 1 ; A => C
 * Move disk 2 ; A => B
 * Move disk 1 ; C => B
 * Move disk 3 ; A => C
 * Move disk 1 ; B => A
 * Move disk 2 ; B => C
 * Move disk 1 ; A => C
 */