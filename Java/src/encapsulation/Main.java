package encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Shree Lekha", 5000);

        // Accessing data through methods
        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        System.out.println("Initial Balance: ₹" + myAccount.getBalance());

        myAccount.deposit(1500);
        System.out.println("After deposit: ₹" + myAccount.getBalance());

        myAccount.withdraw(2000);
        System.out.println("After withdrawal: ₹" + myAccount.getBalance());

        //myAccount.withdraw(10000);  // Should trigger validation
    }
}
