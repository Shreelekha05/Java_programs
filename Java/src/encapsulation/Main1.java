package encapsulation;
//Main.java
public class Main1{
 public static void main(String[] args) {
     // Create an Author object
     Author author = new Author("Shree Lekha", "shree@example.com", 'F');

     // Create a Book object using the Author object
     Book book = new Book("Java Basics", author, 599.99, 10);

     // Print all details of the book (including author details)
     System.out.println(book.toString());
 }
}