package asses2;
import java.util.*;
class SeqResult {
    int countSeq;
    int maxLen;
    SeqResult(int countSeq, int maxLen) {
        this.countSeq = countSeq;
        this.maxLen = maxLen;
    }
}
public class pro5 {
    public static SeqResult decreasingSeq(int[] input1, int input2) {
        int countSeq = 0;
        int maxLen = 0;
        int i = 0;
        while (i < input2 - 1) {
            if (input1[i] > input1[i + 1]) {
                countSeq++;
                int len = 2;
                i++;
                while (i < input2 - 1 && input1[i] > input1[i + 1]) {
                    len++;
                    i++;
                }
                if (len > maxLen) {
                    maxLen = len;
                }
            } else {
                i++;
            }
        }
        return new SeqResult(countSeq, maxLen);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        SeqResult res = decreasingSeq(arr, n);
        System.out.println(res.countSeq + " " + res.maxLen);
    }
}
