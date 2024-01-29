package strings.practice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] frequency = findFrequency(input);
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + " " + frequency[i]);
            }
        }
    }

    private static int[] findFrequency(String input) {
        int[] frequency = new int[256];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            frequency[ch]++;
        }
        return frequency;
    }
}