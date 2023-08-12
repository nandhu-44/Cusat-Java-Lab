import java.io.*;

public class OddThread extends Thread {

    private int number;
    private String fileName;

    public OddThread(int number, String fileName) {
        this.number = number;
        this.fileName = fileName;
    }

    public void run() {
        File OddFile = new File(fileName);
        if (!OddFile.exists()) {
            try {
                OddFile.createNewFile();
            } catch (IOException e) {
                System.out.println("Error creating file.");
                return;
            }
        }
        try {
            PrintWriter writer = new PrintWriter(OddFile);
            int j = 0;
            for (int i = 1; i < number; i += 2) {
                writer.print(i);
                boolean commaCondition = number % 2 == 0 ? (i != number - 1) : (i != number - 2);
                if (commaCondition) {
                    writer.print(", ");
                }
                if (j == 9) {
                    writer.println();
                    j = 0;
                } else {
                    j++;
                }
            }
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error writing to file.");
            return;
        }
    }
}
