package com.ps;

import java.util.ArrayList;
import java.util.Arrays;
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
            ArrayList<Book> total = new ArrayList<>();
            Book book1 = new Book(1,"1243","Apple",false);
            Book book2 = new Book(2,"2222","Orange",true);
            total.add(book1);
            total.add(book2);
            for(int i = 0; i < total.size();i++)
            {
                if(!total.get(i).getIsCheckedOut())
                {
                    StringBuilder book = new StringBuilder();
                    book.append("ID: ").append(String.valueOf(total.get(i).getId())).append(", ");
                    book.append("ISBN: ").append(total.get(i).getIsbn()).append(",");
                    book.append("Title: ").append(total.get(i).getTitle());
                    System.out.println(book);
                }
            }
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