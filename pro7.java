package asses2;
import java.util.*;
public class pro7 {
    public static int sumOfPowerOfDigits(int input1) {
        String numStr = String.valueOf(input1);
        int total = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int base = numStr.charAt(i) - '0';
            int exponent;
            if (i == numStr.length() - 1) {
                exponent = 0;
            } else {
                exponent = numStr.charAt(i + 1) - '0';
            }
            total += (int) Math.pow(base, exponent);
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(sumOfPowerOfDigits(num));
    }
}
