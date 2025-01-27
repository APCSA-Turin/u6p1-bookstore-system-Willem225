package com.example.project;

public class User{
   
    private String name;
    private String id;
    private Book[] books = new Book[5];
    
    //constructor
 public User(String name, String id) {
    this.name = name;
    this.id = id;
 }
      //setters and getters
     public String getName() {
        return name;
     }

     public void setName(String name) {
        this.name = name;
     }

     public String getId() {
        return id;
     }

     public void setId(String id) {
        this.id = id;
     }

     public Book[] getBooks() {
        return books;
     }

     public void setBooks(Book[] books) {
        this.books = books;
     }

     public String bookListInfo() {
      String bookList = "";
      for (Book books : books) {
          if (books == null) {
              bookList += "empty";
              bookList += "\n";
          } else {
              bookList += books.bookInfo();
              bookList += "\n";
          }
      }
      return bookList;
  }
      //returns the userinfo and book info
     public String userInfo(){
        return "Name: " + name + "\nId: " + id + "\nBooks: " + "\n" + bookListInfo();
     } 
       
}