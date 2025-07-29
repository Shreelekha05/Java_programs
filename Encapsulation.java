// Author.java
class Author {
    private String name;
    private String email;
    private char gender;

    // Parameterized Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // ToString method to display Author details
    public String toString() {
        return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
    }
}



// Book.java
class Book {
    private String name;
    private Author author;  // Author object
    private double price;
    private int qtyInStock;

    // Parameterized Constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    // ToString method to display Book details
    public String toString() {
        return "Book Name: " + name + "\n" +
               author.toString() + "\n" +
               "Price: ₹" + price + ", Quantity in Stock: " + qtyInStock;
    }
}



// Main.java
public class Main {
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author("Shree Lekha", "shree@example.com", 'F');

        // Create a Book object using the Author object
        Book book = new Book("Java Basics", author, 599.99, 10);

        // Print all details of the book (including author details)
        System.out.println(book.toString());
    }
}
