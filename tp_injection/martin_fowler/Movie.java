package martin_fowler;


/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie{
    private String title;
    private String director;

  public Movie(String title, String director){
    this.title = title;
    this.director = director;
  }
  
  public String getTitle(){
    return title;
  }
  
  public String getDirector(){
    return director;
  }
}