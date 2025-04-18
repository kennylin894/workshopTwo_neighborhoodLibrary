package com.ps;

import java.util.ArrayList;
import java.util.Scanner;

public class commands {
    static Scanner scanner = new Scanner(System.in);
    public static void option1()
    {
        Inventory inv = new Inventory();
        System.out.println("These are the available books");
        System.out.println(printAvailableBooks(availableBooks(inv)));
        if(option1B() == 1)
        {

        }
    }

    public static ArrayList<Book> availableBooks(Inventory inventory)
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
        return available;
    }

    public static StringBuilder printAvailableBooks(ArrayList<Book> available)
    {
        StringBuilder string = new StringBuilder();
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


    public static int option1B()
    {
        System.out.println("Would you like to:");
        System.out.println("1) Select a book to check out");
        System.out.println("2) Exit the application");
        int input = scanner.nextInt();
        return input;
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
