package com.ps;

import java.util.ArrayList;
import java.util.Scanner;

public class commands {
    public static void option1()
    {
        System.out.println("These are the available books");
        System.out.println(avaiableBooks());

    }

    public static ArrayList<Book> avaiableBooks()
    {

        for(Book item: Inventory)
        {
            if(get)
            {
                available.add(item);
            }
        }
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
