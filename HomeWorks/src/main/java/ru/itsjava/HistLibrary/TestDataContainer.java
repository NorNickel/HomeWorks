package ru.itsjava.HistLibrary;

public class TestDataContainer {
    static HistoricalBook[] getHistoricalBooksArray(){
        HistoricalBook[] histBooksArray = new HistoricalBook[10];
        histBooksArray[0] = new HistoricalBook(
                "My name is Dracula","Vlad Cepesh", 1462, 666);
        histBooksArray[1] = new HistoricalBook(
                "History textbook 11 grade","Fedor Fedorov", 1990, 450);
        histBooksArray[2] = new HistoricalBook(
                "History textbook 10 grade","Alexey Alexeev", 1991, 160);
        histBooksArray[3] = new HistoricalBook(
                "History textbook 9 grade","Foma Fomin", 1993, 285);
        histBooksArray[4] = new HistoricalBook(
                "History textbook 8 grade","Alexey Alexeev", 1992, 190);
        histBooksArray[5] = new HistoricalBook(
                "History textbook 7 grade","Unknown author", 1990, 350);
        histBooksArray[6] = new HistoricalBook(
                "New Russian history","Putin", 2000, 17777);
        histBooksArray[7] = new HistoricalBook(
                "Window to Europe","Peter the Great", 1716, 789);
        histBooksArray[8] = new HistoricalBook(
                "How to do several things at once","Caesar", -100, 980);
        histBooksArray[9] = new HistoricalBook(
                "American real history","Christopher Columbus", 1492, 99);
        return histBooksArray;
    }
}
