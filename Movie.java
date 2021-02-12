import java.io.File;
import java.util.*;

public class Movie{
    private String filePath;
    private File movieFile;
    private final MovieFormat format;

    //A variable that determines whether the filepath exists.
    //Private so client can't manually change it.
    private boolean valid;

    //Required information.
    private String title;
    private String language;
    private String publishingStudio;

    //Custom information. I used a Hashmap to store the information with key-value pairs.
    //Client can modify it with methods provided (line 50).
    private Map<String, String> customInformation = new HashMap<>();

    //Constructor.
    //Once created, the information about a movie will not be modifiable (except for custom info) as fields are private.
    //The movie format is parsed from the path (lines 33-36)
    /**
     * @pre path != null
     */
    public Movie(String path, String title, String language, String publishingStudio){
        assert path != null && title != null && language != null && publishingStudio != null;
        this.filePath = path;
        this.movieFile = new File(path);

        //Get the last three characters of the path
        String extension = path.substring(path.length() - 3).toUpperCase(Locale.ROOT);
        //Convert the String extension to ENUM type
        //If the format is different from our enums, program will send an error.
        this.format = MovieFormat.valueOf(extension);
        assert format != null;

        this.title = title;
        this.language = language;
        this.publishingStudio = publishingStudio;

        if(this.movieFile.exists()){
            this.valid = true;}
        else{
            this.valid = false;}
    }

    //Methods to add and remove custom information about the movie.
    public void addCustomInfo(String title, String info){
        this.customInformation.put(title, info);
    }
    public void removeCustomInfo(String title){
        this.customInformation.remove(title);
    }

    //Client method to check if the filePath exists.
    public boolean isValid(){
        if(this.movieFile.exists()){
            this.valid = true;}
        else{
            this.valid = false;}

        return this.valid;
    }

    //Method to get the video format
    public MovieFormat getFormat(){
        return this.format;
    }

    //Method to get title (used in Watchlist.getMovies())
    public String getTitle(){
        return this.title;
    }

    //Method to get file path (used in Watchlist.getMovies())
    //Returns a copy so the client can't modify the path
    public String getPath(){
        return this.filePath;
    }

    //Method to get publishing Studio (used in Watchlist.allStudios())
    public String getStudio(){
        return this.publishingStudio;
    }

    //Method to get language (used in Watchlist.allLanguages())
    public String getLanguage(){
        return this.language;
    }
}