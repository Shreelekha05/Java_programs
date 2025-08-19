package assess1;
import java.util.Scanner;
public class palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("number:");
		int n=sc.nextInt();
		sc.close();
		int number=0;
		int temp=n;
		while(n>0)
		{
			int t =n%10;
			number=number*10+t;
			n/=10;
		}
		if(temp==number) System.out.println("palindrome");
		else System.out.println("not palindrome"); 
		}
	}
