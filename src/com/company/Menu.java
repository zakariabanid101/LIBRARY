package com.company;
import java.awt.print.Book;
import java.util.Scanner;


public class Menu{
        Library enaa = new Library();
        void menu() {
                int choice;
                do {
                        System.out.println("\n****************** WELCOME TO ENAA LIBRARY ******************");
                        System.out.println("\t\t**********MENU**********");
                        System.out.println("1-Add Book.");
                        System.out.println("2-Display books.");
                        System.out.println("3-Modify an existent book.");
                        System.out.println("4-Delete an existent book.");
                        System.out.println("5-Search for a book.");
                        System.out.println("6-Borrow a book.");

                        System.out.println("0-Exit.");

                        do {
                                Scanner scan = new Scanner(System.in);
                                System.out.println("Enter your choice : ");
                                choice = scan.nextInt();
                                if (choice < 0 || choice > 7) {
                                        System.out.println("Enter a number between 0 and 4 : ");
                                }
                        } while (choice < 0 || choice > 7);

                        switch (choice) {
                                case 1:
                                        enaa.addBook();
                                        break;
                                case 2:
                                        enaa.Display();
                                        break;
                                case 3:
                                        enaa.Modify();
                                        break;
                                case 4:
                                        enaa.Delete();
                                        break;
                                case 5:
                                        enaa.Search();
                                        break;
                                case 6:
                                        enaa.Reserve();
                                        break;
                        }
                }while (choice != 0);

        }
}