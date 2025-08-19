
package asses2;
import java.util.*;
public class pro6 {
    public static int mostFrequentlyOccurringDigit(int[] input1, int input2) {
        int[] freq = new int[10];
        for (int i = 0; i < input2; i++) {
            int num = input1[i];
            if (num == 0) {
                freq[0]++;
            }
            while (num > 0) {
                int digit = num % 10;
                freq[digit]++;
                num /= 10;
            }
        }
        int maxFreq = -1;
        int resultDigit = -1;
        for (int d = 0; d <= 9; d++) {
            if (freq[d] > maxFreq || (freq[d] == maxFreq && d > resultDigit)) {
                maxFreq = freq[d];
                resultDigit = d;
            }
        }
        return resultDigit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        System.out.println(mostFrequentlyOccurringDigit(arr, n));
    }
}
