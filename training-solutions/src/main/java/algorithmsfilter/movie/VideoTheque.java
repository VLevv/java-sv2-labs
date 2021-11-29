package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {
    private List<Movie> movies = new ArrayList<>();

    public List<Movie> getMovies() {
        return movies;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category){
        List<Movie> results = new ArrayList<>();
        for (Movie m :
                movies) {
            if (m.getCategory().equals(category)){
                if(m.getRating()>3){
                    results.add(m);
                }
            }
        }
        return results;
    }
}
