package com.gla.streamApi;

import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " | Rating: " + rating + " | Year: " + year;
    }
}


public class TopMovies {
    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("Movie A", 8.5, 2023),
                new Movie("Movie B", 9.0, 2024),
                new Movie("Movie C", 7.8, 2022),
                new Movie("Movie D", 8.9, 2024),
                new Movie("Movie E", 9.2, 2023),
                new Movie("Movie F", 8.0, 2021),
                new Movie("Movie G", 9.1, 2024)
        );

        List<Movie> top5 = movies.stream()
                // Filter: movies after 2022 (example condition)
                .filter(m -> m.year >= 2022)

                // Sort: by rating (desc), then by year (desc)
                .sorted(Comparator
                        .comparingDouble((Movie m) -> m.rating).reversed()
                        .thenComparing((Movie m) -> m.year, Comparator.reverseOrder())
                )

                // Limit to top 5
                .limit(5)

                // Collect result
                .collect(Collectors.toList());

        // Display result
        top5.forEach(System.out::println);
    }
}