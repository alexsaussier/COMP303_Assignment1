 import java.util.*;


class Library{

    // A library is a list of movies.
    private List<Movie> movies = new ArrayList<>();
    // A library can also contain watchlists.
    private List<Watchlist> watchlists = new ArrayList<>();



    //Add a movie to the library
    public void addMovie(Movie aMovie){
        movies.add(aMovie);
    }
    //Add a watchlist to the library
    public void addWatchlist(Watchlist aWatchlist){
        watchlists.add(aWatchlist);
    }

}
