package com.ps;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Book> allBooks = new ArrayList<>();

    public Inventory()
    {
        allBooks.add(new Book(1,"1","one",false));
        allBooks.add(new Book(2,"2","two",false));
        allBooks.add(new Book(3,"3","three",false));
        allBooks.add(new Book(4,"4","four",false));
        allBooks.add(new Book(5,"5","five",true));
        allBooks.add(new Book(6,"6","six",true));
        allBooks.add(new Book(7,"7","seven",true));
        allBooks.add(new Book(8,"8","eight",true));


        for(Book book: allBooks)
        {
            if(book.getIsCheckedOut())
            {
                book.setCheckedOutTo("Kenny");
            }
        }
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
