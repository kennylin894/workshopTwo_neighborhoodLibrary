package com.ps;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Welcome to Library HomeScreen");
        System.out.println("1) Show available books");
        System.out.println("2) Show checked out books");
        System.out.println("3) Exit application");
        int input = scanner.nextInt();


        if(input == 1)
        {
            System.out.println("These are the available books");

        }
        else if(input == 2)
        {
            System.out.println("Choose an option");
            System.out.println("C) to check in a book");
            System.out.println("X) go back to home screen");
        }
        else if(input == 3)
        {
            System.out.println("Good bye.");
        }
        else
        {
            System.out.println("Error, invalid input");
        }


    }
}