package assess3;
import java.util.Scanner;
public class SequenceCalculator {
    public static int calculateValue(int input1, int input2, int input3, int input4) {
        int diff1 = input2 - input1;
        int diff2 = input3 - input2;
        int current = input1;
        for (int i = 1; i < input4; i++) {
            if (i % 2 != 0)
                current += diff1;
            else
                current += diff2;
        }
        return current;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input1: ");
        int input1 = sc.nextInt();
        System.out.print("Enter input2: ");
        int input2 = sc.nextInt();
        System.out.print("Enter input3: ");
        int input3 = sc.nextInt();
        System.out.print("Enter input4 (position to find): ");
        int input4 = sc.nextInt();
        int result = calculateValue(input1, input2, input3, input4);
        System.out.println("Value at position " + input4 + " is: " + result);
        sc.close();
    }
}
