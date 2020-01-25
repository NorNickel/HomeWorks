package ru.itsjava.HistLibrary;

public class HistLibrary {
    public static void main(String[] args) {
        HistoricalBook[] histBookArray = TestDataContainer.getHistoricalBooksArray();
        MenuProcessing.launchLibraryMainMenu(histBookArray);
    }
}
