package ru.muctr.Comparators;

/**
 * @author Evgenia Skichko
 */
public record MovieRec(String title, int year, String starring) implements Comparable<MovieRec>{
    @Override
    public int compareTo(MovieRec o) {
        return title.compareTo(o.title());
    }

    public MovieRec {
        if (year < 1895) throw new IllegalArgumentException("Year must be > 1895");
    }


    public MovieRec(String title, int year, String surname, String name) {
        this(title, year, surname + name);
    }
}
