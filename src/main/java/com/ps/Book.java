package com.ps;

import java.util.ArrayList;
import java.util.Arrays;

public class Book {
    private int id;
    private String isbn;
    private String title;
    //not sure if this should be false
    private Boolean isCheckedOut = false;
    private String CheckedOutTo = "";

    public Book(int id,String isbn,String title, Boolean isCheckedOut)
    {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
    }
    public void checkOut(String name)
    {
        this.CheckedOutTo = name;
        this.isCheckedOut = true;
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

    public Boolean getIsCheckedOut() {
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
