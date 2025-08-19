
package assess3;
import java.util.*;
public class NambiarNumber {
    
    public int nnGenerator(String input1) {
        boolean process = false, isOdd = false;
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < input1.length(); i++) {
            int n = Integer.parseInt(String.valueOf(input1.charAt(i)));

            if (!process) {
                if (n % 2 == 0) {
                    isOdd = false;
                } else {
                    isOdd = true;
                }
                process = true;
            }

            sum += n;

            if (isOdd) {
                if (sum % 2 == 0) {
                    arr.add(sum);
                    sum = 0;
                    process = false;
                }
            } else {
                if (sum % 2 != 0) {
                    arr.add(sum);
                    sum = 0;
                    process = false;
                }
            }
        }

        if (process) {
            arr.add(sum);
        }

        String result = "";
        for (int i : arr) {
            result += String.valueOf(i);
        }

        return Integer.parseInt(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NambiarNumber obj = new NambiarNumber();

        System.out.print("Enter a number string: ");
        String input = sc.nextLine();

        int output = obj.nnGenerator(input);
        System.out.println("Generated number: " + output);

        sc.close();
    }
}
