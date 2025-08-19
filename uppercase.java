package assess1;
import java.util.Scanner;
public class uppercase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a character: ");
	     char c = sc.next().charAt(0);
		if(Character.isLowerCase(c))
			System.out.println(Character.toUpperCase(c));
		else
			System.out.println(Character.toLowerCase(c));	
		sc.close();
}
}
