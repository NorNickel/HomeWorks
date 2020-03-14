package ru.spb.aog.oop.hist_library;

public class HistLibrary {
    public static void main(String[] args) {
        HistoricalBook[] histBookArray = TestDataContainer.getHistoricalBooksArray();
        MenuProcessing.launchLibraryMainMenu(histBookArray);
    }
}
