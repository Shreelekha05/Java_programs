package asses2;
import java.util.*;
class PartsResult {
    String part1;
    String part2;
    String part3;
    PartsResult(String part1, String part2, String part3) {
        this.part1 = part1;
        this.part2 = part2;
        this.part3 = part3;
    }
}
public class pro10 {
    public static PartsResult processStrings(String input1, String input2, String input3) {
        String[] parts1 = splitIntoThreeParts(input1);
        String[] parts2 = splitIntoThreeParts(input2);
        String[] parts3 = splitIntoThreeParts(input3);
        String out1 = parts1[0] + parts2[0] + parts3[0];
        String out2 = parts1[1] + parts2[1] + parts3[1];
        String out3 = parts1[2] + parts2[2] + parts3[2];
        StringBuilder toggled = new StringBuilder();
        for (char ch : out3.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else {
                toggled.append(Character.toUpperCase(ch));
            }
        }
        return new PartsResult(out1, out2, toggled.toString());
    }
    private static String[] splitIntoThreeParts(String str) {
        int len = str.length();
        int rem = len % 3;
        int part = len / 3;
        String front, middle, end;
        if (rem == 0) {
            front = str.substring(0, part);
            middle = str.substring(part, 2 * part);
            end = str.substring(2 * part);
        } else if (rem == 1) {
            front = str.substring(0, part);
            middle = str.substring(part, part + part + 1);
            end = str.substring(part + part + 1);
        } else {
            front = str.substring(0, part + 1);
            middle = str.substring(part + 1, part + 1 + part);
            end = str.substring(part + 1 + part);
        }
        return new String[]{front, middle, end};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        sc.close();
        PartsResult res = processStrings(s1, s2, s3);
        System.out.println(res.part1);
        System.out.println(res.part2);
        System.out.println(res.part3);
    }
}
