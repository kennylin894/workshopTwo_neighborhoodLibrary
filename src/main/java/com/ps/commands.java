package com.ps;

import java.util.ArrayList;
import java.util.Scanner;

public class commands {
    static Scanner scanner = new Scanner(System.in);
    static Inventory inv = new Inventory();
    public static void option1()
    {
        System.out.println("These are the available books");
        System.out.println(printAvailableBooks(availableBooks(inv)));
        if(option1B() == 1)
        {
            System.out.println("Please enter your name:");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.println("What book would you like to check out, enter the book id");
            int id = scanner.nextInt();
            chooseBook(name,id);

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

    public static void chooseBook(String name,int id)
    {
        for(Book book: availableBooks(inv))
        {
            if(book.getId() == id)
            {
                book.checkOut(name);

                //testing to see if values update
                System.out.println(book.getIsCheckedOut());
                System.out.println(book.getCheckedOutTo());

                //checking if the available books change accordingly
                //so it updates
                //Q-2 how would I keep this data permanently
                System.out.println(printAvailableBooks(availableBooks(inv)));
            }
        }
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
