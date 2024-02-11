package com.company;
import java.util.ArrayList;
import java.util.Scanner;


class Library {
    Books book = new Books();
    Scanner scan = new Scanner(System.in);
    ArrayList<Books> booksList = new ArrayList<>();

    void addBook() {
        Scanner scan = new Scanner(System.in);
        Books book = new Books();
        System.out.println("Enter book's Title : ");
        book.bookName = scan.nextLine();
        System.out.println("Enter book's Author's name : ");
        book.bookAuthor = scan.nextLine();
        System.out.println("Enter book's ISBN : ");
        book.ISBN = scan.nextLong();
        System.out.println("Enter book's publish date : ");
        book.publishDate = scan.nextInt();
        booksList.add(book);
    }

// Display Book Function :

    void Display() {
        for (Books books : booksList) {
            System.out.println("__________________________");
            System.out.println("Book's Title : " + books.bookName);
            System.out.println("Book's Author : " + books.bookAuthor);
            System.out.println("Book's ISBN : " + books.ISBN);
            System.out.println("Book's Publish Date : " + books.publishDate);
            System.out.println("__________________________");
        }
    }

    // Modify Book Function :
    void Modify() {
        Scanner title = new Scanner(System.in);
        System.out.println("Which book would you like to Modify ?");
        System.out.println("Enter book's name : ");
        String booktoModify = title.nextLine();
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).bookName.equals((booktoModify))) {
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter the new details : ");
                System.out.println("Enter the new Title : ");
                String Name = scan.nextLine();
                System.out.println("Enter book's Author's Name : ");
                String Author = scan.nextLine();
                System.out.println("Enter book's ISBN : ");
                long ISBN = scan.nextLong();
                System.out.println("Enter book's publish date : ");
                int date = scan.nextInt();
                booksList.get(i).ModifyBook(Name, Author, ISBN, date);
            }
        }
    }

    // Delete Book Function :
    void Delete() {
        System.out.println("which book would you like to delete ?");
        String bookDelete = new Scanner(System.in).nextLine();
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).bookName.equals(bookDelete)) {
                booksList.remove(i);
            }
        }
    }

    // Reserve Book :
    void Reserve() {
        Scanner scan = new Scanner(System.in);
        Students student = new Students();
        System.out.println("Enter your Name : ");
        student.studentsName = scan.nextLine();
        System.out.println("Enter your Address : ");
        student.Address = scan.nextLine();
        System.out.println("Enter your identification number : ");
        student.identificationNumber = scan.nextInt();
        System.out.println("Which book would you like to reserve ?");
        Display();
        System.out.println("Enter your choice : ");
        String bookReserve = new Scanner(System.in).nextLine();
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).bookName.equals(bookReserve)) {
                student.bookReserved = scan.nextLine();
                Students.borrowBooksList.add(book);
                System.out.println("book has been successfully reserved!");
            } else System.out.println("The book you want do not exist");
        }
    }

    // Search Book
    void Search() {
        System.out.println("Enter the name of the book you want to find : ");
        String findBook = new Scanner(System.in).nextLine();
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).bookName.equals(findBook)) {
                System.out.println("The book " + findBook + " is in the library");
            } else {
                System.out.println("The book you entered do no exist");
            }
        }
    }
}