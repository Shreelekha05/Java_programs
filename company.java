package assess1;
public class company {
public static void main(String[] args) {
	if (args.length != 2) {
		System.out.println("Please pass exactly two arguments.");
	return;
	}
	String companyName = args[0];
	String location = args[1];
	String output = companyName + " Technologies " + location;
	System.out.println(output);
}
}
