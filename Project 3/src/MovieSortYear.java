/**
 * Movie Comparator Class (Uses code from project 2)
 * @author David Milligan II
 *
 */
import java.util.Comparator;
public class MovieSortYear implements Comparator<Movie>{
	
	/**
	 * compare 2 Movie object's year value and sort them base on the result
	 * @param a Movie object #1
	 * @param b Movie object #2
	 */
	public int compare(Movie a, Movie b){
		
		int movieOne = 0;
		int movieTwo = 0;
		if (a.yearGetValue().equals("UNSPECIFIED")){
			movieOne = 9999;
		}
		else{
			movieOne = Integer.parseInt(a.yearGetValue());
		}
		
		if (b.yearGetValue().equals("UNSPECIFIED")){
			movieTwo = 9999;
		}
		else{
			movieTwo = Integer.parseInt(b.yearGetValue());
		}
		
			if (movieOne > movieTwo)
			{
				return 1;
			}
			else if (movieOne == movieTwo)
			{
				return 0;
			}
			return -1;
	}
}
