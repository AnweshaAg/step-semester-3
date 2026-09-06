//question 5
import java.util.*;

public class WordFinder {

    static String[] findShortestAndLongestWord(String text) {

        // Remove punctuation
        text = text.replaceAll("[^a-zA-Z ]", "");

        // Split into words
        String[] words = text.trim().split("\\s+");

        String shortest = words[0];
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }

            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] result = findShortestAndLongestWord(text);

        String shortest = result[0];
        String longest = result[1];

        System.out.println(
            "Shortest: \"" + shortest + "\" (" +
            shortest.length() + ")"
        );

        System.out.println(
            "Longest: \"" + longest + "\" (" +
            longest.length() + ")"
        );

        sc.close();
    }
}