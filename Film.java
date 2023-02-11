package netflixapp;

public class Film {
    // 1 to 1 connection 
    private FilmFile filmdata;
    private String filmName;
    private int rating;

    public Film(String filmName, int rating) {
        this.filmName = filmName;
        this.rating = rating;
    }

    public String getFilmName() {
        return filmName;
    }

    public int getRating() {
        return rating;
    }
}
