package assignment16;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class passwordfinder {
    public static boolean isStable(int number) {
        String numStr = String.valueOf(number);
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char digit : numStr.toCharArray()) {
            frequencyMap.put(digit, frequencyMap.getOrDefault(digit, 0) + 1);
        }
        if (frequencyMap.isEmpty()) {
            return false;
        }
        int firstFrequency = frequencyMap.get(numStr.charAt(0));
        for (int freq : frequencyMap.values()) {
            if (freq != firstFrequency) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers separated by spaces:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        scanner.close();
        int password = 0;
        if (isStable(num1)) {
            password += num1;
        }
        if (isStable(num2)) {
            password += num2;
        }
        if (isStable(num3)) {
            password += num3;
        }
        if (isStable(num4)) {
            password += num4;
        }
        if (isStable(num5)) {
            password += num5;
        }
        System.out.println("The password is: " + password);
    }
}
