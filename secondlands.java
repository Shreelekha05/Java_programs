package assess1;
import java.util.*;
public class secondlands{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int flarge=Integer.MIN_VALUE,slarge=Integer.MIN_VALUE;
        int fsmall=Integer.MAX_VALUE,ssmall=Integer.MAX_VALUE;
        for(int i:arr) if(i>flarge) flarge=i;
        for(int i:arr) if(i>slarge && i!=flarge) slarge=i;
        for(int i:arr) if(i<fsmall) fsmall=i;
        for(int i:arr) if(i<ssmall && i!=fsmall) ssmall=i;
        System.out.println("first large = "+flarge);
        System.out.println("second large = "+slarge);
        System.out.println("first small = "+fsmall);
        System.out.println("second small = "+ssmall);
        sc.close();
    }
}
