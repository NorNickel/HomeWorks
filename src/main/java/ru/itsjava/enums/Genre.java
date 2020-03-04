package ru.itsjava.enums;

public enum Genre {
    FANTASTIC("Interesting"),
    ACTION("More fighting"),
    COMEDY("Funny"),
    HORROR("Scaring"),
    THRILLER("Good");

    private String description;

    Genre(String description) {
        this.description = description;
    }
}
