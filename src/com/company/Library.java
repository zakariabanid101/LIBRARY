package com.company;
import java.util.ArrayList;
import java.util.Scanner;


class Library {

    ArrayList<Books> bookslist = new ArrayList<Books>();
    void addBook(){
        Books book = new Books();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter book's name : ");
        book.bookName = scan.nextLine();
        System.out.println("Enter book's Author's name : ");
        book.bookAuthor = scan.nextLine();
        System.out.println("Enter book's ISBN : ");
        book.ISBN = scan.nextLong();
        System.out.println("Enter book's publish date : ");
        book.publishDate = scan.nextInt();

    }
    void Display(){
        for (Books Book : bookslist ){
            System.out.println("Book's Title : "+Book.bookName);
            System.out.println("Book's Author : "+Book.bookAuthor);
            System.out.println("Book's ISBN : "+Book.ISBN);
            System.out.println("Book's Publish Date : "+Book.publishDate);
            System.out.println("__________________________");
        }


    }
}
