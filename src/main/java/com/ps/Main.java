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
            commands.option1();
        }
        else if(input == 2)
        {
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