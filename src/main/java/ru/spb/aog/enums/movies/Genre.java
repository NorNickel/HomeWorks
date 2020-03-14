package ru.spb.aog.enums.movies;

public enum Genre {
    // 1. Enums Передать в Жанры фильмов оценку от 1 до 5 через конструктор.
    FANTASTIC("Fantastic",4),
    FANTASY("Fantasy",3),
    ACTION("Action", 3),
    COMEDY("Comedy", 6),
    HORROR("Horror", 8),
    THRILLER("Thriller", 10);

    private String name;
    private int rating;

    Genre(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() { return name; }
    public int getRating() { return rating; }

    // И выводить сообщение в зависимости от жанра с помощью метода.
    // ("Хороший жанр", "Можно посмотреть", "Ни за что на свете")
    public String getRatingDescription(){
        if (0 <= rating && rating <= 3) {
            return "No way!";
        } else if (4 <= rating && rating <= 7) {
            return "Can see.";
        } else {
            return "Good genre!";
        }
    }
}
