package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Welcome to Library HomeScreen, Choose your option:");
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
            //shows the user what books are checked in
            //displays all the books in a list
        else if(userInput == 2)
        {
           commands.showAllCheckedOutBooks();
        }
        else if(userInput == 0)
        {
            System.out.println("Good Bye. Thanks for using our application.");
        }
        else
        {
            System.out.println("Error, invalid input");
        }
    }
}