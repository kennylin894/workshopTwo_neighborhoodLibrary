package com.ps;

import java.util.ArrayList;
import java.util.Scanner;

public class commands {
    static Scanner scanner = new Scanner(System.in);
    static Inventory inv = new Inventory();

    public static void printGoodbyeMessage() {
        System.out.println("******************************");
        System.out.println("*    Thank you for using     *");
        System.out.println("*      the Library App!      *");
        System.out.println("*      Goodbye and take      *");
        System.out.println("*     care! See you soon!    *");
        System.out.println("******************************");
    }

    public static void printErrorMessage()
    {
        System.out.println("******************************");
        System.out.println("*           ERROR!           *");
        System.out.println("*   Something went wrong...  *");
        System.out.println("*      Please try again.     *");
        System.out.println("******************************");
    }

    public static void printSuccess()
    {
        System.out.println("*************************************");
        System.out.println("*   Success! Book Checked In/Out    *");
        System.out.println("*   Your action was completed       *");
        System.out.println("*   successfully. Thank you!        *");
        System.out.println("*************************************");
    }

    //user chooses option 1 - These are the available books
    public static void showAllBooksYouCanCheckOut()
    {
        System.out.println(printAvailableBooks(availableBooks()));
        //user chooses to check out
        String input = selectABookToCheckOut();
        if(input.equals("c"))
        {
            System.out.println("Please enter your name:");
            String name = scanner.nextLine();
            System.out.println("What book would you like to check out, enter the book id:");
            int id = scanner.nextInt();
            chooseBookToCheckOut(name,id);
        }
        //user wants to exit application
        else if(input.equals("x"))
        {
            printGoodbyeMessage();
        }
        else
        {
            printErrorMessage();
        }
    }

    //user chooses to check out a book
    //user just enters the string id of the book they want
    public static String selectABookToCheckOut()
    {
        System.out.println("Would you like to:");
        System.out.println("C) Select a book to check out.");
        System.out.println("X) Exit the application.");
        String input  = scanner.nextLine().toLowerCase();
        return input;
    }

    //retruns an arraylist of books are available in the inventory
    public static ArrayList<Book> availableBooks()
    {
        ArrayList<Book> available = new ArrayList<>();
        for(Book item: inv.getAllBooks())
        {
            if(!item.getIsCheckedOut())
            {
                available.add(item);
            }
        }
        return available;
    }

    //printer method to print all the books that are available
    public static StringBuilder printAvailableBooks(ArrayList<Book> available)
    {
        StringBuilder string = new StringBuilder();
        if(available.isEmpty())
        {
            System.out.println("Sorry, there are no available books.");
        }
        System.out.println("======== Available Books ========");
        for(Book book: available)
        {
            string.append("ID: ").append(book.getId()).append(" ISBN: ").append(book.getIsbn()).append(" Title: ").append(book.getTitle());
            string.append("\n");
        }
        return string;
    }

    //takes the id of the user input
    //the id is the book the user wants to check out
    //takes the id, finds it and then updates its values
    public static void chooseBookToCheckOut(String name, int id)
    {
        boolean found = false;
        for(Book book: availableBooks())
        {
            if(book.getId() == id)
            {
                found = true;
                book.checkOut(name);
                printSuccess();
                printGoodbyeMessage();
//                //testing to see if values update
//                System.out.println(book.getIsCheckedOut());
//                System.out.println(book.getCheckedOutTo());
//
//                //checking if the available books change accordingly
//                //so it updates
//                //Q-2 how would I keep this data permanently
//                System.out.println(printCheckOutBooks(notAvailableBooks()));
//                System.out.println(printAvailableBooks(availableBooks()));
            }
        }
        if(!found)
        {
            System.out.println("No ID exists. Please try again.");
        }
    }

    //user chooses to show the books that are checked out
    public static void showAllCheckedOutBooks()
    {
        System.out.println(printCheckOutBooks(notAvailableBooks()));
        //user wants to check in a book
        String input = selectABookToCheckIn();
        if(input.equals("c"))
        {
            System.out.println("What book would you like to check in, enter the book id:");
            int id = scanner.nextInt();
            chooseBookToCheckIn(id);
        }
        //user chooses to exit the application
        else if(input.equals("x"))
        {
            printGoodbyeMessage();
        }
        else
        {
            printErrorMessage();
        }
    }

    //lets user choose the option to check in a book
    public static String selectABookToCheckIn()
    {
        System.out.println("Choose an option:");
        System.out.println("C) to check in a book");
        System.out.println("X) exit the application");
        String input = scanner.nextLine().toLowerCase();
        return input;
    }

    //prints all the books that are currently checked out
    //shows who it is checked out by
    public static StringBuilder printCheckOutBooks(ArrayList<Book> notAvailable)
    {
        StringBuilder string = new StringBuilder();
        if(notAvailable.isEmpty())
        {
            System.out.println("Sorry, there are no books that are checked out.");
        }
        System.out.println("======= All Checked Out Books =======");
        for(Book book: notAvailable)
        {
            //rn when its being printed the name is empty
            //made a temp fix in inventory
            string.append("ID: ").append(book.getId()).append(" ISBN: ").append(book.getIsbn()).append(" Name: ").append(book.getCheckedOutTo());
            string.append("\n");
        }
        return string;
    }

    //finds all the books that are checked out by other ppl
    //otherwords not available
    public static ArrayList<Book> notAvailableBooks()
    {
        ArrayList<Book> notAvailable = new ArrayList<>();
        for(Book item: inv.getAllBooks())
        {
            if(item.getIsCheckedOut())
            {
                notAvailable.add(item);
            }
        }
        return notAvailable;
    }

    //takes the id of the user input
    //the id is the book the user wants to check in
    //takes the id, finds it and then updates its values
    public static void chooseBookToCheckIn(int id)
    {
        boolean found = false;
        for(Book book: notAvailableBooks())
        {
            if(book.getId() == id)
            {
                found = true;
                book.checkIn();
                printSuccess();
                printGoodbyeMessage();
                //testing to see if values update
//                System.out.println(book.getIsCheckedOut());
//                System.out.println(book.getCheckedOutTo());
//
//                //checking if the available books change accordingly
//                //so it updates
//                System.out.println(printCheckOutBooks(notAvailableBooks()));
//                System.out.println(printAvailableBooks(availableBooks()));
            }
        }
        if(!found)
        {
            System.out.println("No ID exists. Please try again.");
        }
    }
}
