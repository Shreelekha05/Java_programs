package logicalbuilt;
import java.util.*;

public class Password_finder {
	    static int findPassword(int... nums) {
	        int stable = 0, unstable = 0;
	        List<Integer> stableList = new ArrayList<>();
	        List<Integer> unstableList = new ArrayList<>();
	        for (int num : nums) {
	            String s = String.valueOf(num);
	            int[] freq = new int[10];
	            for (char c : s.toCharArray()) freq[c - '0']++;
	            int count = 0;
	            boolean isUnstable = false;
	            for (int f : freq) if (f > 0) {
	                if (count == 0) count = f;
	                else if (count != f) { isUnstable = true; break; }
	            }
	            if (isUnstable) {
	                unstable++;
	                unstableList.add(num);
	            } else {
	                stable++;
	                stableList.add(num);
	            }
	        }
	        System.out.println("Stable Numbers: " + stableList + " (Count: " + stable + ")");
	        System.out.println("Unstable Numbers: " + unstableList + " (Count: " + unstable + ")");
	        return unstable * 10 + stable;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] nums = new int[5];
	        System.out.println("Enter 5 numbers:");
	        for (int i = 0; i < 5; i++) nums[i] = sc.nextInt();
	        System.out.println("Password: " + findPassword(nums));
	        sc.close();
	    }
	}
