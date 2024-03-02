package ru.muctr.Comparators;

import java.util.Arrays;
import java.util.Comparator;

public class MovieDemo {
    public static void main(String[] args) {
        new MovieDemo().go();
    }

    private void go() {
        Movie movie1 = new Movie("Matrix", 1999, "Reeves");
        Movie movie2 = new Movie("Mission Impossible", 1996, "Cruise");
        Movie movie3 = new Movie("Divergent", 2014, "Woodley");

        //********* Сортировка массива строк *****************************************
        String[] titles = new String[]{movie1.getTitle(), movie2.getTitle(), movie3.getTitle()};
        Arrays.sort(titles);
        System.out.println(Arrays.toString(titles));


        //********* Сортировка массива объектов пользовательского класса ************
        Movie[] movies = new Movie[]{movie1, movie2, movie3};
        Arrays.sort(movies);
        System.out.println(Arrays.toString(movies));


        //********* Компараторы *****************************************************
//        Comparator<Movie> byYear = Comparator.comparingInt(Movie::getYear); //компактная запись

        Comparator<Movie> byYear = new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getYear() - o2.getYear();
            }
        };

        Arrays.sort(movies, byYear);
        System.out.println(Arrays.toString(movies));

        //********** Record *********************************************************
        MovieRec movie1r = new MovieRec("Matrix", 1999, "Reeves");
        MovieRec movie2r = new MovieRec("Mission Impossible", 1996, "Cruise");
        MovieRec movie3r = new MovieRec("Divergent", 2014, "Woodley");
        MovieRec movie4r = new MovieRec("Divergent", 2014, "Woodley");
        System.out.println(movie1r);
        System.out.println(movie3r.equals(movie4r));

    }
}
