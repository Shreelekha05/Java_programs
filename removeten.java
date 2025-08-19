package assess1;
import java.util.*;
public class removeten { 
    public static int[] RemoveTen(int[] nums) {
        int[] copy = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                copy[j] = nums[i];
                j++;
            }
        }
        return Arrays.copyOf(copy, j);
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
        sc.close();
        int[] result = RemoveTen(arr);
        System.out.print("Array after removing 10s: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
