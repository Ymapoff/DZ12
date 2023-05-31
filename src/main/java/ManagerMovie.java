class MovieManager {
    private int limitManager = 5;

    private Movie[] movies = new Movie[0];

    public MovieManager() {
    }

    public MovieManager(int limitManager) {
        this.limitManager = limitManager;
    }

    public int getLimitManager() {
        return limitManager;
    }


    public void addNewMovie(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        return movies;
    }


    public Movie[] findLast() {
        int resultLenght;
        if (limitManager > movies.length) {
            resultLenght = movies.length;
        } else {
            resultLenght = limitManager;
        }
        Movie[] result = new Movie[resultLenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}