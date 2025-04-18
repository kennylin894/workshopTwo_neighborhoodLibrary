package com.ps;

import java.util.ArrayList;
import java.util.Scanner;

public class commands {
    public static void option1()
    {
        Inventory inv = new Inventory();
        System.out.println("These are the available books");
        System.out.println(availableBooks(inv));
    }

    public static StringBuilder availableBooks(Inventory inventory)
    {
        StringBuilder string = new StringBuilder();
        ArrayList<Book> available = new ArrayList<>();
        for(Book item: inventory.getAllBooks())
        {
            if(!item.getIsCheckedOut())
            {
                available.add(item);
            }
        }
        if(available.isEmpty())
        {
            System.out.println("Sorry, there are no available books");
        }
        System.out.println("These are all the available books");
        for(Book book: available)
        {
            string.append("ID: ").append(book.getId()).append(" ISBN: ").append(book.getIsbn()).append(" Title: ").append(book.getTitle());
            string.append("\n");
        }
        return string;
    }


    public static void option2()
    {
        System.out.println("Choose an option");
        System.out.println("C) to check in a book");
        System.out.println("X) go back to home screen");
    }

    public static void option3()
    {

    }
}
