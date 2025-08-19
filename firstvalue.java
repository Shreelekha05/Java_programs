package assess1;
import java.util.Scanner;
public class firstvalue {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer and a character (e.g. 42 @): ");         
        char c = sc.next().charAt(0); 
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
			System.out.println("alphabet");
		else if(Character.isDigit(c)) System.out.println("number");
		else System.out.println("special char");
		sc.close();
		}
	} 
