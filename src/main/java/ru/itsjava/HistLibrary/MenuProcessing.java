package ru.itsjava.HistLibrary;

import java.util.Scanner;

public class MenuProcessing {
    static void exitMainMenu(){
        System.out.println("");
        System.out.println("You are leaving the library...");
        System.exit(0);
    }

    static void printMainMenu(int totalBooks){
        System.out.println("");
        System.out.println("Main menu:");
        System.out.println(" 1 - Show all books (total: " + totalBooks + ")");
        System.out.println(" 2 - Add a book");
        System.out.println(" 3 - Burn a book");
        System.out.println(" 4 - Remove a page/pages from book");
        System.out.println(" 5 - Add a page/pages to book");
        System.out.println(" 6 - Republish a book");
        System.out.println(" 7 - Change an author");
        System.out.println(" 0 - Exit library");
        //System.out.print("Input mode (0 - 7): ");
    }

    static int chooseMode(Scanner scan, String message, int minPossibleMode, int maxPossibleMode){
        int chosenMode = -1;
        do {
            System.out.print(message);
            if(scan.hasNextInt()){
                chosenMode = scan.nextInt();
                if ((chosenMode >= minPossibleMode) & (chosenMode <= maxPossibleMode) | (chosenMode==0)){
                    return chosenMode;
                }
            }else{
                scan.nextLine();
            }
        } while (true);
    }

    static int chooseBookNumber(Scanner scan, String message, int booksArrayLength){
        int bookNumber = 0;
        if (booksArrayLength != 0) {
            System.out.println("");
            System.out.println(message);
            String tempString = "Input #number of book " + "1 - " + booksArrayLength + " or 0 to CANCEL: ";
            bookNumber = chooseMode(scan, tempString, 1, booksArrayLength);
        }
        return bookNumber;
    }

    static void printPressEnterMessage(){
        System.out.println("");
        System.out.print("Press Enter to return to menu...");
        try {
            System.in.read();
        }
        catch (Exception e){}
    }

    static void launchLibraryMainMenu(HistoricalBook[] hba){
        Scanner scan = new Scanner(System.in);
        String tempString;
        int bookNumber;
        int chosenMode = -1;
        while (chosenMode != 0){
            printMainMenu(hba.length);
            chosenMode = chooseMode(scan, "Input mode 0 - 7: ", 0, 7);
            switch (chosenMode){
                case 0: exitMainMenu();
                case 1: {
                    HistoricalBook.printAllBooks(hba);
                    break;
                }
                case 2:{
                    hba = HistoricalBook.addBook(hba);
                    break;
                }
                case 3:{
                    HistoricalBook.printAllBooks(hba);
                    tempString = "Choose book you want to burn...";
                    bookNumber = chooseBookNumber(scan, tempString, hba.length);
                    if (bookNumber != 0) {
                        hba = HistoricalBook.burnBook(hba, bookNumber);
                    }
                    break;
                }
                case 4:{
                    HistoricalBook.printAllBooks(hba);
                    tempString = "Choose book you want to remove pages...";
                    bookNumber = chooseBookNumber(scan, tempString, hba.length);
                    if (bookNumber != 0) {
                        tempString = "How many pages do you want to remove? " +
                                "1 - " + (hba[bookNumber - 1].getNumberOfPages() - 2) + ": ";
                        int numberOfPages = chooseMode(scan, tempString, 1,
                                hba[bookNumber - 1].getNumberOfPages() - 2);
                        if (numberOfPages != 0){
                            hba[bookNumber - 1] = HistoricalBook.removePages(hba[bookNumber - 1], numberOfPages);
                        }
                    }
                    break;
                }
                case 5:
                    HistoricalBook.printAllBooks(hba);
                    tempString = "Choose book you want to add pages...";
                    bookNumber = chooseBookNumber(scan, tempString, hba.length);
                    if (bookNumber != 0) {
                        tempString = "How many pages do you want to add? Input 1 - 10000 or 0 to CANCEL:  ";
                        int numberOfPages = chooseMode(scan, tempString, 1, 10000);
                        if (numberOfPages != 0){
                            hba[bookNumber - 1] = HistoricalBook.addPages(hba[bookNumber - 1], numberOfPages);
                        }
                    }
                    break;
                case 6:{
                    HistoricalBook.printAllBooks(hba);
                    tempString = "Choose book you want to republish...";
                    bookNumber = chooseBookNumber(scan, tempString, hba.length);
                    if (bookNumber != 0) {
                        hba = HistoricalBook.republishBook(hba, bookNumber);
                    }
                    break;
                }
                case 7:{
                    HistoricalBook.printAllBooks(hba);
                    tempString = "Choose book you want to change the author...";
                    bookNumber = chooseBookNumber(scan, tempString, hba.length);
                    if (bookNumber != 0) {
                        try {
                            hba[bookNumber - 1] = HistoricalBook.changeAuthor(hba[bookNumber - 1]);
                        }
                        catch (Exception e){}
                    }
                    break;
                }
            }
            printPressEnterMessage();
        }
    }
}
