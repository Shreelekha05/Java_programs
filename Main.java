
package assignment4;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter Author Name: ");
        String authorName = sc.nextLine();
        System.out.print("Enter Author Email: ");
        String authorEmail = sc.nextLine();
        System.out.print("Enter Author Gender (M/F/O): ");
        char authorGender = sc.next().charAt(0);
        Author author = new Author(authorName, authorEmail, authorGender);
        sc.nextLine(); 
        System.out.print("Enter Book Name: ");
        String bookName = sc.nextLine();
        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity in Stock: ");
        int qty = sc.nextInt();
        Book book = new Book(bookName, author, price, qty);
        System.out.println("\n--- Book Details ---");
        System.out.println(book);
        sc.close();
    }
}

