package ru.itsjava.oop.hist_library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HistoricalBook {
    private String name;
    private String author;
    private int publicationYear;
    private int numberOfPages;

    HistoricalBook() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("");
        System.out.println("Adding a new book...");
        System.out.print(" Input book name: ");
        name = reader.readLine();
        System.out.print(" Input author: ");
        author = reader.readLine();
        System.out.print(" Input year of publication: ");
        publicationYear = Integer.parseInt(reader.readLine());
        System.out.print(" Input number of pages: ");
        numberOfPages = Integer.parseInt(reader.readLine());
        System.out.println("");
        System.out.println("Book added: " + getBookName(this));
    }

    HistoricalBook(String name, String author, int publicationYear, int numberOfPages){
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
    }

    public static String getBookName(HistoricalBook hb){
        return hb.getName() + ", " + hb.getAuthor() + ": "
                + hb.getPublicationYear() + " - " + hb.getNumberOfPages() + " page(s)";
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getPublicationYear(){
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }

    public static void printAllBooks(HistoricalBook[] hba){
        System.out.println("");
        if (hba.length != 0) {
            System.out.printf("%-5s%-50s%-30s%-10s%-10s%n",
                    "#", "Book name", "Author", "Year", "Pages");
            for (int i=0; i<100; i++){
                System.out.print("_");
            }
            System.out.println("");
        } else{
            System.out.println("No books in library");
        }
        int i = 0;
        while (i < hba.length){
            System.out.printf("%-5d%-50s%-30s%-10d%-10d%n",
                    i + 1, hba[i].getName(), hba[i].getAuthor(),
                    hba[i].getPublicationYear(), hba[i].getNumberOfPages());
            i++;
        }
    }

    public static HistoricalBook[] addBook(HistoricalBook[] hba){
        HistoricalBook[] newHistBookArray = new HistoricalBook[hba.length + 1];
        for (int i=0; i<newHistBookArray.length; i++){
            if (i != newHistBookArray.length - 1){
                newHistBookArray[i] = hba[i];
            } else {
                try{
                    newHistBookArray[i] = new HistoricalBook();
                }
                catch (Exception e){
                    System.out.println("Input error! Sorry, but you have to input all fields of new book again...");
                    i--;
                }
            }
        }
        return newHistBookArray;
    }

    public static HistoricalBook[] addBook(HistoricalBook[] hba, HistoricalBook hb){
        HistoricalBook[] newHistBookArray = new HistoricalBook[hba.length + 1];
        for (int i=0; i<newHistBookArray.length; i++){
            if (i != newHistBookArray.length - 1){
                newHistBookArray[i] = hba[i];
            } else {
                newHistBookArray[i] = hb;
            }
        }
        return newHistBookArray;
    }

    public static HistoricalBook[] burnBook(HistoricalBook[] hba, int bookNumberForBurn){
        int indexForBurning = bookNumberForBurn - 1;      //index of book for burning in array
        HistoricalBook burnedBook = hba[indexForBurning];
        HistoricalBook[] newHistBookArray = new HistoricalBook[hba.length - 1];
        int j = 0;
        for (int i=0; i<hba.length; i++){
            if (i != indexForBurning){
                newHistBookArray[j] = hba[i];
                j++;
            }
        }
        System.out.println("");
        System.out.println("OMG! You really did it!");
        System.out.println("Book burned: " + HistoricalBook.getBookName(burnedBook));
        return newHistBookArray;
    }

    public static HistoricalBook[] republishBook(HistoricalBook[] hba, int bookNumberForRepublish) {
        int i = bookNumberForRepublish - 1;
        HistoricalBook republishBook = new HistoricalBook(
                hba[i].getName(), hba[i].getAuthor(), 2020, hba[i].getNumberOfPages());
        hba = addBook(hba, republishBook);
        System.out.println("");
        System.out.println("Book republished: " + HistoricalBook.getBookName(hba[i]));
        return hba;
    }

    public static HistoricalBook changeAuthor(HistoricalBook hb) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("");
        System.out.println("Changing the author to book: " + HistoricalBook.getBookName(hb));
        System.out.print(" Input new author: ");
        hb.setAuthor(reader.readLine());
        System.out.println("Author changed");
        return hb;
    }

    public static HistoricalBook removePages(HistoricalBook hb, int numberOfPages){
        hb.setNumberOfPages(hb.getNumberOfPages() - numberOfPages);
        System.out.println("");
        System.out.println(numberOfPages + " page(s) removed from " + HistoricalBook.getBookName(hb));
        return hb;
    }

    public static HistoricalBook addPages(HistoricalBook hb, int numberOfPages) {
        hb.setNumberOfPages(hb.getNumberOfPages() + numberOfPages);
        System.out.println("");
        System.out.println(numberOfPages + " page(s) added to " + HistoricalBook.getBookName(hb));
        return hb;
    }
}
