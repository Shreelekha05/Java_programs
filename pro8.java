package asses2;
import java.util.*;
public class pro8 {
    public static int sumOfSumsOfDigits(int input1) {
        String numStr = String.valueOf(input1);
        int totalSum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int sum = 0;
            for (int j = i; j < numStr.length(); j++) {
                sum += numStr.charAt(j) - '0';
            }
            totalSum += sum;
        }
        return totalSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(sumOfSumsOfDigits(num));
    }
}
