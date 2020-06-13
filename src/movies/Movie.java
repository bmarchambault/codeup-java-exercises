package movies;

public class Movie {
    private String movieName;
    private String movieCategory;

    public Movie(String movieName, String movieCategory) {
        this.movieName = movieName;
        this.movieCategory = movieCategory;
    }

//================setters=======================
    public void setMovieCategory(java.lang.String movieCategory) {
        this.movieCategory = movieCategory;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
//    ==========================================
//******************setters******************
    public String getMovieCategory() {
        return movieCategory;
    }

    public String getMovieName() {
        return movieName;
    }
//   *****************************************

}
