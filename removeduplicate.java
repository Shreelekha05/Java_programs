package assess1;
import java.util.*;
public class removeduplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ele=arr[0];
        System.out.println(ele);
        for(int i=1;i<arr.length;i++)
        {
        	if(ele!=arr[i]) System.out.println(arr[i]);
        	ele=arr[i];
        	sc.close();
        } 
    }
}
