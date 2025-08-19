package asses2;
import java.util.*;
public class pro2 {
    public static int getCodeThroughStrings(String input1) {
        String[] words = input1.trim().split("\\s+");
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        while (totalLength > 9) {
            int sum = 0;
            while (totalLength > 0) {
                sum += totalLength % 10;
                totalLength /= 10;
            }
            totalLength = sum;
        }
        return totalLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        sc.close();
        System.out.println(getCodeThroughStrings(input1));
    }
}
