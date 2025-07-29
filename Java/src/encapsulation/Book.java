package encapsulation;

//Book.java
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