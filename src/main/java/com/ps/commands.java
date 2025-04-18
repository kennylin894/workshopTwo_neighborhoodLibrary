package com.ps;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Scanner;

public class commands {
    static Scanner scanner = new Scanner(System.in);
    static Inventory inv = new Inventory();

    //user chooses option 1 - These are the available books
    public static void option1()
    {
        System.out.println("These are the available books.");
        System.out.println(printAvailableBooks(availableBooks(inv)));
        //user chooses to check out
        String input = option1B();
        if(input.equals("c"))
        {
            System.out.println("Please enter your name:");
            String name = scanner.nextLine();
            System.out.println("What book would you like to check out, enter the book id:");
            int id = scanner.nextInt();
            chooseBook(name,id);
        }
        else if(input.equals("x"))
        {
            System.out.println("Good Bye. Thanks for using our application.");
        }
        else
        {
            System.out.println("Error, bad input. Please try again.");
        }
    }

    //user chooses to check out the books
    public static String option1B()
    {
        System.out.println("Would you like to:");
        System.out.println("C) Select a book to check out.");
        System.out.println("X) Exit the application.");
        String input  = scanner.nextLine().toLowerCase();
        return input;
    }

    //checks what books are available in the inventory
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

    //printer method to print all the books
    public static StringBuilder printAvailableBooks(ArrayList<Book> available)
    {
        StringBuilder string = new StringBuilder();
        if(available.isEmpty())
        {
            System.out.println("Sorry, there are no available books.");
        }
        System.out.println("These are all the available books.");
        for(Book book: available)
        {
            string.append("ID: ").append(book.getId()).append(" ISBN: ").append(book.getIsbn()).append(" Title: ").append(book.getTitle());
            string.append("\n");
        }
        return string;
    }


    //used when the user wants to select a book
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
                System.out.println(printCheckOutBooks(notAvailableBooks(inv)));
                System.out.println(printAvailableBooks(availableBooks(inv)));
            }
        }
    }


    //user chooses to show the books that are checked out
    public static void option2()
    {
        System.out.println(printCheckOutBooks(notAvailableBooks(inv)));
        //user wants to check in a book
        String input = option2B();
        if(input.equals("c"))
        {
            System.out.println("What book would you like to check in, enter the book id:");
            int id = scanner.nextInt();
            chooseCheckIn(id);
        }
        //user chooses to exit the application
        else if(input.equals("x"))
        {
            System.out.println("Good Bye. Thanks for using our application.");
        }
        else
        {
            System.out.println("Error, bad input. Please try again.");
        }
    }

    //lets user choose the
    public static String option2B()
    {
        System.out.println("Choose an option:");
        System.out.println("C) to check in a book");
        System.out.println("X) go back to home screen");
        String input = scanner.nextLine().toLowerCase();
        return input;
    }


    public static StringBuilder printCheckOutBooks(ArrayList<Book> notAvailable)
    {
        StringBuilder string = new StringBuilder();
        if(notAvailable.isEmpty())
        {
            System.out.println("Sorry, there are no books that are checked out.");
        }
        System.out.println("These are all the checked out books.");
        for(Book book: notAvailable)
        {
            //rn when its being printed the name is empty
            //made a temp fix in inventory
            string.append("ID: ").append(book.getId()).append(" ISBN: ").append(book.getIsbn()).append(" Name: ").append(book.getCheckedOutTo());
            string.append("\n");
        }
        return string;
    }

    public static ArrayList<Book> notAvailableBooks(Inventory inventory)
    {
        StringBuilder string = new StringBuilder();
        ArrayList<Book> notAvailable = new ArrayList<>();
        for(Book item: inventory.getAllBooks())
        {
            if(item.getIsCheckedOut())
            {
                notAvailable.add(item);
            }
        }
        return notAvailable;
    }

    public static void chooseCheckIn(int id)
    {
        for(Book book: notAvailableBooks(inv))
        {
            if(book.getId() == id)
            {
                book.checkIn();
                //testing to see if values update
                System.out.println(book.getIsCheckedOut());
                System.out.println(book.getCheckedOutTo());

                //checking if the available books change accordingly
                //so it updates
                //Q-2 how would I keep this data permanently
                System.out.println(printCheckOutBooks(notAvailableBooks(inv)));
                System.out.println(printAvailableBooks(availableBooks(inv)));
            }
        }
    }
}
