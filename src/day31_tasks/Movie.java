package day31_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {




    //Movie Task:
    //3.1. Create a class named Movie
    //    Attributes:
    //        country (String), title (String), Genre (String),
    //releaseDate (String), director (String), casts (ArrayList<String>)

    public String country, title , genre, releaseDate ,director;
    public ArrayList <String> casts;
    //Add a constructor to set the country, title, release
    //date, and director of the Movie

    public Movie(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        casts = new ArrayList<>();
    }


    //    Actions
    //        addCast(String): adds the given string argument
    //to the arrayList casts
     public void addCast( String name){
        casts.add(name);
     }
    //        addCasts(String[]): adds the given string array

    public void addCasts(String[] names){
        casts.addAll(Arrays.asList(names));
    }


    @Override
    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", total number of casts=" + casts.size() +
                '}';
    }
}
    //argument to the arrayList casts

