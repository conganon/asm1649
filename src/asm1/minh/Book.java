/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm1.minh;

/**
 *
 * @author ASUS
 */
public class Book {
    int id;
    String name;
    String author;
    int price;
    String borrower;

    public Book() {
        this.id = 00;
        this.name = "default";
        this.author = "default";
        this.price = 1;
        this.borrower = "default";
    }

    public Book(int id, String name, String author, int price, String borrower) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.borrower = borrower;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public String getBorrower() {
        return borrower;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }
    
    @Override
    public String toString() {
        return "Book: \n"
                + "ID: " + id 
                + "\nName: " + name 
                + "\nAuthor: " +author
                + "\nPrice: " +price+"$"
                + "\nBorrower: " +borrower;
    }
    
}
