import java.io.File;

public class ClientCode{
    public static void main (String[] args){

        Library myLibrary = new Library();
        Watchlist favoriteMovies = new Watchlist("Favorite Movies");
        Movie DjangoUnchained = new Movie(
                "a/movie/path/DjangoUnchained.mp4",
                "Django Unchained",
                "English",
                "Warner Bros");

        myLibrary.addWatchlist(favoriteMovies);
        favoriteMovies.addMovie(DjangoUnchained);

        favoriteMovies.setName("My movies");
        favoriteMovies.printGeneralInfo();

    }
}