package com.ps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Welcome to Library HomeScreen, Choose your option:");
        System.out.println("1) Show available books");
        System.out.println("2) Show checked out books");
        System.out.println("3) Exit application");
        int input = scanner.nextInt();


        if(input == 1)
        {
            //what books you can check out
            commands.option1();
        }
        else if(input == 2)
        {
            //what books are checked out
            //Q1 - if the book is not checked out, what is the book.isCheckOutTo value?
            //should I use a constructor to have a default value of "" for name of the person
            //is there a way to make it so I can assign a name to the book if is only checked out?
           commands.option2();
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