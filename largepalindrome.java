package thread;
import java.util.Scanner;

public class largepalindrome {

    public static int charactersToRemove(String input1) {
        input1 = input1.toLowerCase();
        int[] freq = new int[26];

        for (char c : input1.toCharArray()) {
            freq[c - 'a']++;
        }

        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 != 0) oddCount++;
        }

        if (oddCount == input1.length()) return -1;
        if (oddCount <= 1) return 0;
        return oddCount - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.nextLine();

        int result = charactersToRemove(word);
        System.out.println("Output: " + result);
        sc.close();
    }
}
