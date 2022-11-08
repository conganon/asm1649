/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asm1.minh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BookManagement {
    ArrayList<Book> book = new ArrayList<Book>();
    
    public void addBook()
    {
        Scanner c = new Scanner(System.in);
        System.out.print("Input ID: ");
        int id = c.nextInt();
        System.out.print("Input Name: ");
        c.nextLine();
        String name = c.nextLine();
        System.out.print("Input Author: ");
        String author = c.nextLine();
        System.out.print("Input Price: ");
        int price = c.nextInt();
        c.nextLine();
        System.out.print("Input borrower: ");
        String borrower = c.nextLine();

        book.add(new Book(id, name, author, price, borrower));
    }

    public void Remove(int i)
    {
        if(book.contains(i) == true){
            book.remove(i);
        }
        else{
            System.out.println("Don't have a book to remove.");
        }
            
    }

    public void viewBook()
    {
        for(Book a:book)
        {
            System.out.println(a.toString());
        }
    }

}
