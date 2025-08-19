package assess1;
import java.util.Scanner;
public class year {
	public static void main(String args[]) {
		int number;
		Scanner sc=new Scanner(System.in);
		String[] months={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		System.out.print("Enter the month number (1-12): ");
		number=sc.nextInt();
		sc.close();
		System.out.println(months[number-1]);
		}
	} 
