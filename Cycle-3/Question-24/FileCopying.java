
/**
 * Write a program to copy a file to another file using Java to package classes.
 * Get the file names at run time and if the target file exists,
 * then ask for confirmation to overwrite and take necessary actions.
 */

import java.util.Scanner;
import java.io.*;

public class FileCopying {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source file name: ");
        String source = scanner.nextLine();
        System.out.print("Enter destination file name: ");
        String destination = scanner.nextLine();
        copyFile(source, destination);
        scanner.close();
    }

    public static void copyFile(String source, String destination) {
        File sourceFile = new File(source);
        File destinationFile = new File(destination);

        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        if (destinationFile.exists()) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Destination file already exists.");
            System.out.print("Do you want to overwrite? (y/n) : ");
            String choice = scanner.nextLine();
            if (choice.equals("n")) {
                System.out.println("File not overwritten.");
                scanner.close();
                return;
            }
            scanner.close();
        }

        try {
            destinationFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Error creating destination file.");
            return;
        }

        try {
            Scanner sourceScanner = new Scanner(sourceFile);
            PrintWriter destinationWriter = new PrintWriter(destinationFile);
            while (sourceScanner.hasNextLine()) {
                destinationWriter.println(sourceScanner.nextLine());
            }
            sourceScanner.close();
            destinationWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading source file.");
            return;
        }
    }
}
