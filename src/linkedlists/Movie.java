/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlists;

/**
 *
 * @author Harish Bondalapati
 */
public class Movie implements Comparable<Movie>{
    private String name;
    private String director;
    private int year;

    public Movie(String name, String director, int year) {
        this.name = name;
        this.director = director;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    
    
    @Override
    public String toString() {
        return  name + " (" + year + ")" 
                + " directed by " + director;
    }

    @Override
    public int compareTo(Movie o) {
        return new Integer(year).compareTo(o.getYear());
    }
    
}
