import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemover {

    private static HashSet<String> uniqueWords = new HashSet<String>();

    public static void remove(Scanner dataFile) {
        while (dataFile.hasNext()) {
            uniqueWords.add(dataFile.next());
        }
    }

    public static void write(PrintWriter outFS) {
        outFS.print(uniqueWords);
    }

}
