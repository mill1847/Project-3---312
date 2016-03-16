/**
 * Episode Maker Class (Uses code from project 2)
 * @author David Milligan II
 *
 */
import java.util.ArrayList;

public class Maker implements Comparable<Maker>{

	private String title;
	private ArrayList<Series> appearanceSeries;
	private ArrayList<Movie> appearanceMovies;
	private ArrayList<Episode> appearanceEpisodes;
	private ArrayList<String> appearanceYears;
	
	/**
	 * default constructor for Maker (used in searching)
	 */
	public Maker ()
	{
		title = "";
		appearanceSeries = new ArrayList <Series>();
		appearanceMovies = new ArrayList <Movie>();
		appearanceEpisodes = new ArrayList <Episode>();
		appearanceYears = new ArrayList <String>();
	}
	
	/**
	 * parsing constructor (takes in a String
	 *  and puts information into the fields above)
	 * @param s - input string to be parsed into fields
	 */
	public Maker (String s)
	{
		
	}
	/**
	 * name of the Maker
	 * @return String title 
	 */
	public String titleGetValue() 
	{
		return null;
	}
	/**
	 * returns a List of all Movies that this Maker worked on
	 * @return ArrayList appearanceMovies  
	 */
	public ArrayList<Movie> appearanceMoviesGetValue()
	{
		return null;
	}
	/**
	 * returns a List of all Series that this Maker worked on
	 * @return ArrayList appearanceSeries  
	 */
	public ArrayList<Series> appearanceSeriesGetValue()
	{
		return null;
	}
	/**
	 * returns a List of all Episodes that this Maker worked on
	 * @return ArrayList appearanceEpisodes  
	 */
	public ArrayList<Episode> appearanceEpisodesGetValue()
	{
		return null;
	}
	/**
	 * returns a List of all years that this Maker worked
	 * @return ArrayList appearanceYears  
	 */
	public ArrayList<String> appearanceYearsGetValue()
	{
		return null;
	}
	/**
	 * adds an Episode to appearanceEpisode
	 * @param s - String to be parsed in via the Episode constructor
	 */
	public void addEpisode(String s)
	{
		
	}
	/**
	 * adds an Series to appearanceSeries
	 * @param s - String to be parsed in via the Series constructor
	 */
	public void addSeries(String s)
	{
		
	}
	/**
	 * adds an Movie to appearanceMovies
	 * @param s - String to be parsed in via the Movie constructor
	 */
	public void addMovie(String s)
	{
		
	}
	/**
	 * inputs a constructed Episode into appearanceEpisodes
	 * @param e - Episode to input
	 */
	public void addEpisode(Episode e)
	{
		
	}
	/**
	 * inputs a constructed Series into appearanceSeries
	 * @param s - Series to input
	 */
	public void addSeries(Series s)
	{
		
	}
	/**
	 * inputs a constructed Movie into appearanceMovie
	 * @param m - Movie to input
	 */
	public void addMovie(Movie m)
	{
		
	}
	/**
	 * @param m - Maker to compare (title)
	 * @return int [-1,0,1] used for sorting and comparing
	 */
	public int compareTo(Maker m)
	{
		return 0;
	}
}
