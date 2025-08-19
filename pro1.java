package asses2;
import java.util.*;
public class pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        sc.close();
        String[] words = input1.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            word = word.toUpperCase();
            int sum = 0;
            int left = 0;
            int right = word.length() - 1;
            while (left < right) {
                int valleft = word.charAt(left) - 'A' + 1;
                int valright = word.charAt(right) - 'A' + 1;
                sum += Math.abs(valleft - valright);
                left++;
                right--;
            }
            if (left == right) {
                sum += (word.charAt(left) - 'A' + 1);
            }
            result.append(sum);
        }
        System.out.println(Integer.parseInt(result.toString()));
    }
}
