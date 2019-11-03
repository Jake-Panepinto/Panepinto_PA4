import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws IOException {

        // Setting up all my tools.
        FileInputStream dataFile = new FileInputStream("problem1.txt");
        FileOutputStream outputFile = new FileOutputStream("unique_words.txt");
        PrintWriter outFS = new PrintWriter(outputFile);
        Scanner inFS = new Scanner(dataFile);

        DuplicateRemover testP1 = new DuplicateRemover();

        testP1.remove(inFS);
        testP1.write(outFS);

        // Close files and stuff.
        outFS.flush();
        dataFile.close();
        outputFile.close();
    }
}
