package com.example.project;

public class BookStore{
    //creating the 2 arrays
    User[] users = new User[10];
    Book[] books = new Book[5];
   //setters and getters
    public BookStore() {
    }

     public User[] getUsers(){
        return users;
     }

     public void setUsers(User[] users){
        this.users = users;
     }

     public Book[] getBooks(){
        return books;
     }
     //add a user
     public void addUser(User user){
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            } 
        }
     } 
     //allows you to remove a user
     public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].equals(user)) {
                users[i] = null;
                break;
            }
        }
        consolidateUsers();
    }
    //fill out the empty spots in the userlist
     public void consolidateUsers(){
        User[] newUser = new User[users.length];
        int nextspot=0;
        for (User nextUser : users) {
            if (nextUser != null) {
                newUser[nextspot] = nextUser;
                nextspot++;
            }
        }
        users = newUser;
    }
    //allows you to add a book to the bookstore
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }

    // Insert a book at a specific index in the books array
    public void insertBook(Book book, int index) {
        if (index < 0 || index >= books.length) {
            throw new IndexOutOfBoundsException("Index out of bounds.");
        }


        if (books[index] == null) {
            books[index] = book;
        } else {
            for (int i = books.length - 1; i > index; i--) {
                books[i] = books[i - 1];
            }
            books[index] = book;
        }
    }



    // Remove a book from the books array
    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                books[i].setQuantity(books[i].getQuantity() - 1);
                if (books[i].getQuantity() == 0) {
                    books[i] = null;
                    consolidateBooks();
                }
            }
        }
    }
    //fill in the empty spots of the book array
        public void consolidateBooks() {
            int bookCount = 0;
            for (Book book : books) {
                if (book != null) {
                    bookCount++;
                }
            }
            Book[] tempBooks = new Book[bookCount];
            int index = 0;
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null) {
                    tempBooks[index] = books[i];
                    index++;
                }
            }
            books = tempBooks;
        }
    }
       