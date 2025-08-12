package logicalbuilt;
import java.util.Scanner;

public class Jumble {
    public static String jumbleWord(String word, int method) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (i % 2 == 0) {
                odd.append(word.charAt(i));
            } else {
                even.append(word.charAt(i));
            }
        }

        if (method == 1) {
            even.reverse();
        }
        return odd.toString() + even.toString();
    }

    public static String jumbledWords(String sentence, int method) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            result.append(jumbleWord(words[i], method));
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();  
        int method = sc.nextInt();        

        System.out.println(jumbledWords(sentence, method));
        
        sc.close();
    }
}
