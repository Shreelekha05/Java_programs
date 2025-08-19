package assess1;
public class gender{
	public static void main(String args[]) {
		String s1;
		s1=args[0];
		int age; 
		age=Integer.parseInt(args[1]);
		if(s1.equals("female") && age>=1 && age<=58)
			System.out.println("poi is 8.2%");
		if(s1.equals("female") && age>=59 && age<=100)
			System.out.println("poi is 9.2%");
		if(s1.equals("male") && age>=1 && age<=58)
				System.out.println("poi is 8.4%");
		if(s1.equals("male") && age>=59 && age<=100)
			System.out.println("poi is 10.5%");
	}
} 
