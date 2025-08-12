package thread;
import java.util.Scanner;

public class wordfind {

    public static String identifyPossibleWords(String input1, String input2) {
        String[] candidates = input2.split(":");
        input1 = input1.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (String word : candidates) {
            String candidate = word.trim().toLowerCase();
            if (candidate.length() == input1.length()) {
                boolean match = true;
                for (int i = 0; i < candidate.length(); i++) {
                    if (input1.charAt(i) != '_' && input1.charAt(i) != candidate.charAt(i)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    if (result.length() > 0) result.append(" ");
                    result.append(candidate.toUpperCase());
                }
            }
        }

        return result.length() > 0 ? result.toString() : "ERROR-009";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the incomplete word: ");
        String input1 = sc.nextLine();

        System.out.print("Enter the candidate words (colon separated): ");
        String input2 = sc.nextLine();

        String output = identifyPossibleWords(input1, input2);
        System.out.println("Output: " + output);
        sc.close();
    }
}
