package com.company;
import java.util.Scanner;

class Books {
    int publishDate;
    long ISBN;
    String bookName;
    String bookAuthor;

    void ModifyBook(String Name, String Author, long ISBN, int date){
        this.bookName = Name;
        this.bookAuthor = Author;
        this.ISBN = ISBN;
        this.publishDate = date;
    }

}
