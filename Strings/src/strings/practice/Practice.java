package strings.practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Find and display the longest word in the input string
        String longestWord = findLongestWord(input);
        System.out.println("Longest Word: " + longestWord);

    }

    // Your code to find the longest word in a string
    public static String findLongestWord(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        String[] words = input.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}