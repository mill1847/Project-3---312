/**
 * Episode Comparator  Class (Uses code from project 2)
 * @author David Milligan II
 *
 */
import java.util.Comparator;
public class EpisodeSortYear implements Comparator<Episode>{
	
	/**
	 * compare 2 Episode object's year value and sort them base on the Episode
	 * @param a Episode object #1
	 * @param b Episode object #2
	 */
	public int compare(Episode a, Episode b){
		
		int episodeOne = 0;
		int episodeTwo = 0;
		
		if (a.yearGetValue().equals("UNSPECIFIED") ){
			episodeOne = 9999;
		}
		else{
			episodeOne = Integer.parseInt(a.yearGetValue());
		}
		
		if (b.yearGetValue().equals("UNSPECIFIED")){
			episodeTwo = 9999;
		}
		else{
			episodeTwo = Integer.parseInt(b.yearGetValue());
		}
	
		if (episodeOne > episodeTwo)
		{
			return 1;
		}
		else if (episodeOne == episodeTwo)
		{
			return 0;
		}
		return -1;
				
	}
	
}
