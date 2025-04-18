package com.ps;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private Boolean isCheckedOut;
    private String isCheckedOutTo;


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

    public String getIsCheckedOutTo() {
        return isCheckedOutTo;
    }

    public void setIsCheckedOutTo(String isCheckedOutTo) {
        this.isCheckedOutTo = isCheckedOutTo;
    }
}
