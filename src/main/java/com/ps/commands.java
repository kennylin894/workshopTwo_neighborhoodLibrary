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

    public static ArrayList<Book> availableBooks(Inventory inventory)
    {
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
        return available;
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
