package ru.itsjava.enums.movies;

import java.util.ArrayList;

public class MyMovieListRunner {

    public static void main(String[] args) {
        // Создать список из 10 фильмов.
        ArrayList<Movie> myMovies = new ArrayList<>();
        myMovies.add(new Movie("Terminator", Genre.FANTASTIC));
        myMovies.add(new Movie("Home alone", Genre.COMEDY));
        myMovies.add(new Movie("The Texas Chainsaw Massacre", Genre.HORROR));
        myMovies.add(new Movie("Toy Story", Genre.COMEDY));
        myMovies.add(new Movie("Nightmare on Elm Street", Genre.HORROR));
        myMovies.add(new Movie("Matrix", Genre.FANTASTIC));
        myMovies.add(new Movie("The Terminal", Genre.THRILLER));
        myMovies.add(new Movie("Pulp Fiction", Genre.ACTION));
        myMovies.add(new Movie("One Flew Over the Cuckoo’s Nest", Genre.THRILLER));
        myMovies.add(new Movie("Harry Potter and the Chamber of Secrets", Genre.FANTASY));

        // И вывести только те фильмы, оценка жанров которых больше 5.
        System.out.println("Movies with rating more than 5:");
        for (Movie movie : myMovies) {
            if (movie.getGenre().getRating() > 5) {
                System.out.println(movie);
            }
        }
    }
}
