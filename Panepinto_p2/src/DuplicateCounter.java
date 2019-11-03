import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter {

    private static HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();

    public static void count(Scanner dataFile) {

        while (dataFile.hasNext()) {
            String next = dataFile.next();
            if (wordCounter.containsKey(next)) {
                wordCounter.put(next, (wordCounter.get(next) + 1));
            }
            wordCounter.putIfAbsent(next, 1);
        }
    }

    public static void write(PrintWriter outFS) {
        outFS.println(wordCounter.keySet());
        outFS.println(wordCounter.values());
    }
}