package martin_fowler;


/**
 * Write a description of class ColonMovieFinder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class ColonMovieFinder implements MovieFinder {
  private String filename;
  
  public ColonMovieFinder() {
  }
  
  public void setFilename(String filename) {
    this.filename = filename;
  }
  
  public List<Movie> findAll(){
    List<Movie> list = new ArrayList<Movie>();
    // la liste simul�e extraite d'un fichier texte
    list.add(new Movie("Dans les for�ts de Sib�rie","NEBBOU Safy"));
    list.add(new Movie("Demain","LAURENT M�lanie / DION Cyril"));
    list.add(new Movie("Once Upon a Time in the West","Sergio Leone"));
    return list;
  }
  
  public String toString(){
    return "ColonMovieFinder";
  }
}