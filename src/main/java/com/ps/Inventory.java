package com.ps;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Book> allBooks = new ArrayList<>();

    public Inventory()
    {
        allBooks.add(new Book(1,"1","one",false));
        allBooks.add(new Book(3,"3","three",false));
        allBooks.add(new Book(4,"4","four",false));
        allBooks.add(new Book(4,"4","four",false));
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
