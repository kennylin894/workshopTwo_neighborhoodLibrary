package com.ps;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Book> allBooks;

    public Inventory()
    {
        Book book1 = new Book(1,"1","one",false);
        Book book2 = new Book(2,"2","two",false);
        Book book3 = new Book(3,"3","three",false);
        Book book4 = new Book(4,"4","four",false);
        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
    }

    public ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(ArrayList<Book> allBooks) {
        this.allBooks = allBooks;
    }

    public void addBooks(Book book)
    {
        this.allBooks.add(book);
    }
}
