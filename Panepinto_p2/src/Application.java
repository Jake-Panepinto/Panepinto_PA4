import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws IOException {

        // Setting up all my tools.
        FileInputStream dataFile = new FileInputStream("problem2.txt");
        FileOutputStream outputFile = new FileOutputStream("unique_words_counts.txt");
        PrintWriter outFS = new PrintWriter(outputFile);
        Scanner inFS = new Scanner(dataFile);

        DuplicateCounter duplicateCounter = new DuplicateCounter();

        DuplicateCounter.count(inFS);
        DuplicateCounter.write(outFS);

        // Close files and stuff.
        outFS.flush();
        dataFile.close();
        outputFile.close();
    }
}
