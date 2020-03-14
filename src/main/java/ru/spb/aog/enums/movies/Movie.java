package ru.spb.aog.enums.movies;

public class Movie {
    private String name;
    private Genre genre;

    public Movie(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Genre getGenre() { return genre; }

    public void setGenre(Genre genre) { this.genre = genre; }

    @Override
    public String toString() {
        return "Movie{" +
                '\'' + name + '\'' +
                ", " + genre.getName() +
                ", " + genre.getRatingDescription() +
                '}';
    }
}
