package strings.practice;

import java.util.Scanner;
public class Practice2 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    boolean isPangram = isPangram(input);
    System.out.println("Is Pangram: " + isPangram);
}

public static boolean isPangram(String input) {
    if (input == null || input.isEmpty()) {
        return false;
    }
    input = input.toLowerCase();
    for (char ch = 'a'; ch <= 'z'; ch++) {
        if (input.indexOf(ch) < 0) {
            return false;
        }
    }
    return true;
}
}