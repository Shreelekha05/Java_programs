package assess1;
import java.util.Scanner;
public class colorcode {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the letter");
		char c=sc.next().charAt(0);
		sc.close();
		if(c=='r') System.out.println("red");
		else if(c=='b') System.out.println("blue");
		else if(c=='g') System.out.println("green");
		else if(c=='0') System.out.println("orange");
		else if(c=='y') System.out.println("yellow");
		else if(c=='w') System.out.println("white");
		else System.out.println("invalid code"); 
	}
}
