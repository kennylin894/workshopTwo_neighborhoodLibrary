package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("******************************************");
        System.out.println("*          Welcome to the Library!       *");
        System.out.println("*      Choose an option to continue.     *");
        System.out.println("******************************************");
        System.out.println("1) Show available books");
        System.out.println("2) Show checked out books");
        System.out.println("0) Exit application");
        int userInput = scanner.nextInt();

        if(userInput == 1)
        {
            //shows the user what books you can check out
            //displays all the books in a list
            commands.showAllBooksYouCanCheckOut();
        }

        else if(userInput == 2)
        {
            //shows the user what books are checked in
            //displays all the books in a list
           commands.showAllCheckedOutBooks();
        }
        else if(userInput == 0)
        {
            commands.printGoodbyeMessage();
        }
        else
        {
            commands.printErrorMessage();
        }
    }
}