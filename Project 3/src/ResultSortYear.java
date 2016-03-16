/**
 * Result Comparator Class (Uses code from project 2)
 * @author David Milligan II
 *
 */
import java.util.Comparator;
public class ResultSortYear implements Comparator<Result> {
	
	/**
	 * compare 2 Result object's year value and sort them base on the result
	 * @param a Result object #1
	 * @param b Result object #2
	 */
	public int compare(Result a, Result b) {
		int resultOne = 0;
		int resultTwo = 0;
		if (a.yearGetValue().equals("UNSPECIFIED")){
			resultOne = 9999;
		}
		else{
			resultOne = Integer.parseInt(a.yearGetValue());
		}
		
		if (b.yearGetValue().equals("UNSPECIFIED")){
			resultTwo = 9999;
		}
		else{
			resultTwo = Integer.parseInt(b.yearGetValue());
		}
		
			if (resultOne > resultTwo)
			{
				return 1;
			}
			else if (resultOne == resultTwo)
			{
				return 0;
			}
			return -1;
	}

}
