package com.example.movies.service;

import com.example.movies.model.Movie;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private List<Movie> movies;

    public MovieService() {
        this.movies = new ArrayList<>();
        initializeMovies();
    }

    private void initializeMovies() {
        movies.add(new Movie(1L, "The Shawshank Redemption", 1994, "Frank Darabont",
                "Drama", "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency."));

        movies.add(new Movie(2L, "The Godfather", 1972, "Francis Ford Coppola",
                "Crime/Drama", "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant youngest son."));

        movies.add(new Movie(3L, "The Dark Knight", 2008, "Christopher Nolan",
                "Action/Crime/Drama", "When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological tests to fight injustice."));

        movies.add(new Movie(4L, "Pulp Fiction", 1994, "Quentin Tarantino",
                "Crime/Drama", "The lives of two mob hitmen, a boxer, a gangster and his wife intertwine in four tales of violence and redemption."));

        movies.add(new Movie(5L, "Inception", 2010, "Christopher Nolan",
                "Action/Sci-Fi", "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O."));
    }

    public Optional<Movie> getMovieById(Long id) {
        return movies.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst();
    }

    public List<Movie> getAllMovies() {
        return new ArrayList<>(movies);
    }

}
