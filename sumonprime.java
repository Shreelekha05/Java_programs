package assess3;
import java.util.Scanner;
public class sumnonprime {
    public static int calculateSum(int[] input1, int input2) {
        int count = 0, sum = 0;
        for (int i = 0; i < input2; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++;
            }
            if (count != 2 || count == 0) {
                sum = sum + input1[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = calculateSum(arr, n);
        System.out.println("Sum of elements at non-prime indexes: " + result);
        sc.close();
    }
}
