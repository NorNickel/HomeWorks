package ru.itsjava.enums;

import java.util.Set;

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

    public static void main(String[] args) {
        Movie movie = new Movie("Terminator", Genre.FANTASTIC);
        System.out.println(movie);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                '}';
    }
}
