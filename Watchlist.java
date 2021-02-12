import java.io.*;
import java.util.*;

public class Watchlist{
    //A watchlist is a list of movies.
    private List<Movie> aWatchlist = new ArrayList<>();
    private String aName;

    //Constructor
    public Watchlist(String pName){
        this.aName = aName;
    }

    //Setter method for name
    public void setName(String pName){
        aName = pName;
    }
    public String getName(){
        return aName;
    }

    //Method to add a movie to the watchlist
    public void addMovie(Movie aMovie){
        aWatchlist.add(aMovie);
    }


    //Method to remove the first movie from the watchlist
    public Movie removeFirst(){
        return aWatchlist.remove(0);

    }



    //Access all the movies in the watchlist:
        //Method that returns the title and filepath of each movie in the watchlist
        //Returns a copy of the list to prevent memory leak
    public List<Movie> getMovies(){
        List<Movie> watchlistCopy = new ArrayList<>();
        for(Movie element : aWatchlist) {
            watchlistCopy.add(element);
            System.out.println("Title: " + element.getTitle() + " | Location: " + element.getPath());
        }
        return watchlistCopy;
    }

    //Method that returns the number of valid movies in the watchlist
    public int validMovies(){
        int count = 0;
        for (Movie element : aWatchlist){
            if(element.isValid()) {
                count++;
            }
        }
        System.out.println("Number of valid movies in " + this.aName + ": " + count);
        return count;
    }

    //Method that returns a new list with all the publishing studios in "this" Watchlist object without duplicates.
    public List<String> allStudios(){
        List<String> studios = new ArrayList<>();

        for(Movie element : aWatchlist){
            if (!studios.contains(element.getStudio())){
                studios.add(element.getStudio());
            }
        }
        return studios;
    }


    //Method that returns a new List of all languages in "this" Watchlist object without duplicates.
    public List<String> allLanguages(){
        List<String> languages = new ArrayList<>();

        for(Movie element : aWatchlist){
            if (!languages.contains(element.getLanguage())){
                languages.add(element.getLanguage());
            }
        }
        return languages;
    }

    public void printGeneralInfo(){
        System.out.println("Watchlist name: " + this.aName);

        System.out.println("Movies in the " + this.aName + " watchlist:");
        this.getMovies();

        System.out.println("---------");
        this.validMovies();
        System.out.println("---------");

        System.out.println("Publishing studios: " + allStudios().toString());
        System.out.println("---------");

        System.out.println("Languages: " + allLanguages());

    }
}