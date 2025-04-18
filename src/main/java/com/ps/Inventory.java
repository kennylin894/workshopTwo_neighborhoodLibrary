package com.ps;

import java.util.ArrayList;
import java.util.Arrays;

public class Inventory {
    private ArrayList<Book> allBooks = new ArrayList<>();

    public Inventory()
    {
        allBooks.add(new Book(1003, "ISBN-2371", "The Lost World", false));
        allBooks.add(new Book(1027, "ISBN-8742", "Ocean Deep", false));
        allBooks.add(new Book(1098, "ISBN-5566", "Skyward Bound", false));
        allBooks.add(new Book(1045, "ISBN-9811", "Mountain Echoes", false));
        allBooks.add(new Book(1172, "ISBN-4421", "Hidden Secrets", true));
        allBooks.add(new Book(1206, "ISBN-7319", "Desert Mirage", false));
        allBooks.add(new Book(1133, "ISBN-6604", "Frozen Truth", false));
        allBooks.add(new Book(1089, "ISBN-3399", "Midnight Flame", true));
        allBooks.add(new Book(1251, "ISBN-8833", "Silent Storm", false));
        allBooks.add(new Book(1322, "ISBN-2244", "Echoes of Time", true));
        allBooks.add(new Book(1450, "ISBN-9900", "Broken Compass", false));
        allBooks.add(new Book(1532, "ISBN-1155", "Golden Horizon", true));
        allBooks.add(new Book(1641, "ISBN-4488", "Crimson Snow", false));
        allBooks.add(new Book(1723, "ISBN-6677", "Shadows Rising", false));
        allBooks.add(new Book(1809, "ISBN-3344", "Fading Light", false));
        allBooks.add(new Book(1922, "ISBN-7788", "Whispering Wind", false));
        allBooks.add(new Book(2056, "ISBN-9922", "Ancient Code", true));
        allBooks.add(new Book(2133, "ISBN-5533", "Mirror Maze", false));
        allBooks.add(new Book(2244, "ISBN-4466", "Last Ember", false));
        allBooks.add(new Book(2377, "ISBN-8800", "Frostbite", false));
        allBooks.add(new Book(2401, "ISBN-3003", "Vanishing Point", false));
        allBooks.add(new Book(2510, "ISBN-4120", "Grave Secrets", false));
        allBooks.add(new Book(2634, "ISBN-7731", "Nightwatch", true));
        allBooks.add(new Book(2789, "ISBN-1616", "Twilight Pact", false));
        allBooks.add(new Book(2820, "ISBN-6262", "Phoenix Feather", false));
        allBooks.add(new Book(2955, "ISBN-4949", "Iron Vow", false));
        allBooks.add(new Book(3090, "ISBN-8181", "Crystal Flame", false));
        allBooks.add(new Book(3157, "ISBN-9999", "Violet Skies", false));
        allBooks.add(new Book(3280, "ISBN-7575", "Hollow Crown", true));
        allBooks.add(new Book(3399, "ISBN-3232", "Burning Truths", false));

        ArrayList<String> randomNames = new ArrayList<>(Arrays.asList(
                "Alice", "Bob", "Charlie", "Diana", "Ethan",
                "Fiona", "George", "Hannah", "Isaac", "Julia",
                "Kevin", "Luna", "Mason", "Nina", "Oscar",
                "Paige", "Quinn", "Ryan", "Sophia", "Tyler"));

        int index = 0;
        for(Book book: allBooks)
        {
            if(book.getIsCheckedOut())
            {
                //we just gonna reuse names for now
                //if the index uses all 20 names, its gonna reuse from the start again
                if(index >= randomNames.size())
                {
                    index = 0;
                }
                book.setCheckedOutTo(randomNames.get(index));
                index++;
            }
        }
    }

    public ArrayList<Book> getAllBooks() {
        return allBooks;
    }

    public void setAllBooks(ArrayList<Book> allBooks) {
        this.allBooks = allBooks;
    }

    public void addBooks(Book book)
    {
        this.allBooks.add(book);
    }
}
