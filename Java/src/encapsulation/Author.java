package encapsulation;
//Author.java
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