package assess1;
import java.util.*;
public class sumofele{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int left=6,right=7;
        int lindex=-1,rindex=-1;
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]==left) lindex=i;
        	if(arr[i]==right) rindex=i;
        }
        int sum=0;
        if(lindex<rindex)
        {
        	for(int i=lindex;i<=rindex;i++) { 
        		arr[i]=0;
        }
        	for(int i:arr) sum+=i;
        }
        else
        {
        for(int i:arr)
        {
        	sum+=i;
        }
       }
        System.out.println(sum);
        sc.close();
    }
    } 
