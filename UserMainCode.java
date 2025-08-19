package assess3;
import java.util.*;
public class UserMainCode {
    public int digitRemove_Palin(int input1) {
        String n = String.valueOf(input1);
        if (isPalindrome(n)) {
            return -1;
        }
        char[] c = n.toCharArray();
        int temp = -1;
        for (int i = 0; i < c.length; i++) {
            String m = makeString(c, i);
            if (isPalindrome(m)) {
                temp = Integer.parseInt(String.valueOf(c[i]));
                break;
            }
        }
        return temp;
    }
    static String makeString(char[] arr, int p) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == p || arr[i] == '-') {
                continue;
            }
            str.append(arr[i]);
        }
        return str.toString();
    }
    static boolean isPalindrome(String n) {
        String reversed = new StringBuilder(n).reverse().toString();
        return n.equals(reversed);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserMainCode obj = new UserMainCode();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = obj.digitRemove_Palin(num);
        System.out.println("Output: " + result);
        sc.close();
    }
}
