package martin_fowler;


/**
 * Write a description of class MovieLister here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class MovieLister{
  private MovieFinder finder;   

  
  public MovieLister() {
  }
  
  public void setFinder(MovieFinder finder) {
    this.finder = finder;
  }
  
  public List<Movie> moviesDirectedBy(String arg) {
    List<Movie> allMovies = finder.findAll();
    for (Iterator<Movie> it = allMovies.iterator(); it.hasNext();) {
        Movie movie = it.next();
        if (!movie.getDirector().equals(arg)) it.remove();
    }
    return allMovies;
  }
}
