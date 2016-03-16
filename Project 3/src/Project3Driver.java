/**
 * main class (Uses code from project 2)
 * @author David Milligan II
 *
 */
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Project3Driver {
	public LinkedHashMap results;
	
	public static void main(String[] args) {
		

	}
	/**
	 * 
	 * @param f - file to be input (text)
	 * @return An ArrayList of Results that were input into the program
	 */
	public ArrayList <Result> readFileByLine(File f)
	{
		return null;
	}
	
	/**
	 * 
	 * @param f - file to be input (binary)
	 * @return An ArrayList of Results that were input into the program
	 */
	public ArrayList <Result> readFileBinary(File f)
	{
		return null;
	}
/**
 * 
 * @param m - List of Makers to look through
 * @param searchinput - Maker to look for (by title)
 * @param r3 - Click input (partial or full search)
 * @return An ArrrayList of Results found
 */
	public ArrayList <Result> searchMaker(ArrayList<Maker> m, String searchinput, int r3)
	{
		return null;
	}
/**
 * 
 * @param m - List of Maker to look through
 * @param sYears - ArrayList of years to look for
 * @return An ArrrayList of Results found
 */
	public ArrayList <Result> searchMakerYear(ArrayList <Maker> m, ArrayList <String> sYears)
	{
		return null;
	}
	/**
	 * 
	 * @param m - List of Movies to look through
	 * @param inputsearch - Movie to look for (by title)
	 * @param r3 - Click input (partial or full search)
	 * @return An ArrrayList of Results found
	 */
	public ArrayList <Result> searchMovie(ArrayList <Movie> m, String inputsearch, int r3)
	{
		return null;
	}
	/**
	 * 
	 * @param m - List of Movies to look through
	 * @param sYears - ArrayList of years to look for
	 * @return An ArrrayList of Results found
	 */
	public ArrayList <Result> searchMovieYear(ArrayList <Movie> m, ArrayList <String> sYears)
	{
		return null;
	}
/**
 * 
 * @param s - List of Series to look through
 * @param searchinput - title to find (String)
 * @param r3 - int to determine whether it is a partial or complete search
 * @return An ArrrayList of Results found
 */
	public ArrayList <Result> searchSeries(ArrayList <Series> s, String searchinput, int r3)
	{
		return null;
	}
	/**
	 * 
	 * @param s - List of Series to look through
	 * @param sYears - ArrayList of years to look for
	 * @return An ArrrayList of Results found
	 */
	public ArrayList <Result> searchYearSeries(ArrayList <Series> s, ArrayList <String> sYears)
	{
		return null;
	}
	/**
	 * 
	 * @param e - List of Episodes to look through
	 * @param searchinput - title to find (String)
	 * @param r3 - int to determine whether it is a partial or complete search
	 * @return An ArrrayList of Results found
	 */
	public ArrayList <Result> searchEpisode(ArrayList <Episode> e, String searchinput, int r3)
	{
		return null;
	}
	/**
	 * 
	 * @param e - List of Episodes to look through
	 * @param sYears - ArrayList of years to look for
	 * @return An ArrrayList of Results found
	 */
	public ArrayList <Result> searchYearEpisode(ArrayList <Episode> e, ArrayList <String> sYears)
	{
		return null;
	}
/**
 * 
 * @param input - a String to check if it's an int
 * @return True if int, False if not
 */
	public boolean isInteger (String input)
	{
		return false;
	}
}
