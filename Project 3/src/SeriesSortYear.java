/**
 * Series Comparator Class (Uses code from project 2)
 * @author David Milligan II
 *
 */
import java.util.Comparator;
public class SeriesSortYear implements Comparator<Series>{
	
	/**
	 * compare 2 Series object's year value and sort them base on the result
	 * @param a Series object #1
	 * @param b Series object #2
	 */
	public int compare(Series a, Series b){
		int seriesOne = 0;
		int seriesTwo = 0;
		if (a.yearGetValue().equals("UNSPECIFIED")){
			seriesOne = 9999;
		}
		else{
			seriesOne = Integer.parseInt(a.yearGetValue());
		}
		
		if (b.yearGetValue().equals("UNSPECIFIED")){
			seriesTwo = 9999;
		}
		else{
			seriesTwo = Integer.parseInt(b.yearGetValue());
		}
		
			if (seriesOne > seriesTwo)
			{
				return 1;
			}
			else if (seriesOne == seriesTwo)
			{
				return 0;
			}
			return -1;
	}
}
