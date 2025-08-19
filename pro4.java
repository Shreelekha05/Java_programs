package asses2;
import java.util.*;
class Result {
    int first;
    int sum;
    Result(int first, int sum) {
        this.first = first;
        this.sum = sum;
    }
}
public class pro4 {
    public static Result findOriginalFirstAndSum(int[] input1, int input2) {
        int[] original = new int[input2];
        original[input2 - 1] = input1[input2 - 1];
        for (int i = input2 - 2; i >= 0; i--) {
            original[i] = input1[i] - original[i + 1];
        }
        int sum = 0;
        for (int num : original) {
            sum += num;
        }
        return new Result(original[0], sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        Result res = findOriginalFirstAndSum(arr, n);
        System.out.println(res.first + " " + res.sum);
    }
}
