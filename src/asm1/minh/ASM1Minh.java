/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm1.minh;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;


/**
 *
 * @author ASUS
 */
public class ASM1Minh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BookManagement book = new BookManagement();
        int choice;
        do{
        Scanner sc = new Scanner(System.in);
        System.out.println("*****MENU*****");
        System.out.println("1. Add new Book");
        System.out.println("2. View all Book");
        System.out.println("3. Remove Book");
        System.out.println("4. Find Book");
        System.out.println("5. Quit");
        System.out.println("---------------");
        System.out.println("Choose Option: ");
        choice = sc.nextInt();
        
        switch(choice)
        {
            case 1:
                book.addBook();
                break;
            case 2:
                book.viewBook();
                break;
            case 3:
                System.out.println("Which Book you want to delete?: ");
                int pos = sc.nextInt();
                book.Remove(pos);
                break;
            case 4:
                break;
            default:
                break;
        }
    }while(choice!=4);
    }
    
}