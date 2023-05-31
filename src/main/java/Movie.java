public class Movie {
    private int id;
    private String nameFilm;
    private String genreFilm;


    public Movie(int id, String nameFilm, String genreFilm) {
        this.id = id;
        this.nameFilm = nameFilm;
        this.genreFilm = genreFilm;


    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm() {
        this.genreFilm = genreFilm;
    }

}