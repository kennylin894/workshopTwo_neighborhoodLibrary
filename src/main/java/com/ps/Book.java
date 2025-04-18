package com.ps;

import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private Boolean isCheckedOut;
    private String CheckedOutTo;
    private ArrayList<String> inventory;
    public Book()
    {

    }
    public void checkOut(String name)
    {
        this.CheckedOutTo = name;
        this.isCheckedOut = true;
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<String> inventory) {
        this.inventory = inventory;
    }

    public void checkIn()
    {
        this.CheckedOutTo = "";
        this.isCheckedOut = false;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(Boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return CheckedOutTo;
    }

    public void setCheckedOutTo(String isCheckedOutTo) {
        this.CheckedOutTo = isCheckedOutTo;
    }
}
