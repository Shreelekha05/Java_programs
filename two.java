package assess1;
public class two {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please pass exactly one argument.");
            return;
        }
        System.out.println("Welcome " + args[0]);
    }
}
