package assess3;
import java.util.Scanner;
public class alternatesum {
    public static int calculateSum(int input1, int input2) {
        int sum = input1;
        boolean isPlus;
        if (input2 == 2) {
            isPlus = true;
        } else {
            isPlus = false;
        }
        for (int i = input1 - 1; i >= 1; i--) {
            if (isPlus) {
                sum += i;
                isPlus = false;
            } else {
                sum -= i;
                isPlus = true;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input1 (starting number): ");
        int input1 = sc.nextInt();
        System.out.print("Enter input2 (1 for start with minus, 2 for start with plus): ");
        int input2 = sc.nextInt();
        int result = calculateSum(input1, input2);
        System.out.println("Result: " + result);
        sc.close();
    }
}
