/**
 * Result Object Class (Uses code from project 2)
 * @author David Milligan II
 *
 */

public class Result implements Comparable<Result>{

	private String title;
	private String year;
	private String media;
	private String epTitle;
	private String yearHigh;
	private String yearRN;
	private String mediaType;
	private String isSuspended;
	private String seasonEpNo;
	private String seriesYear;
	
	/**
	 * default constructor for sorting 
	 */
	public Result (){
	 title="";
	 year="????";
	 media="UNSPECIFIED";
	 epTitle="";
	 yearHigh="????";
	 yearRN="????";
	 mediaType="";
	 isSuspended="";
	 seasonEpNo="";
	 seriesYear="????";
	}
	/**
	 * Constructor that take a Movie object and convert it into a Result object
	 * @param m - a Movie object
	 */	
	public Result(Movie m){
		this.title = m.titleGetValue();
		this.year = m.yearGetValue();
		this.media = m.mediaGetValue();
		this.yearRN = m.yearRNGetValue();
		this.mediaType = "MOVIE";
	}
	
	/**
	 * Constructor that take a Series object and convert it into a Result object
	 * @param s - a Series object
	 */
	public Result(Series s) {
		this.title = s.titleGetValue();
		this.year = s.yearGetValue();
		this.yearHigh = s.yearHighGetValue();
		this.isSuspended = s.isSuspendedGetValue();
		this.mediaType = "SERIES";
	}
	
	/**
	 * Constructor that take a Episode object and convert it into a Result object
	 * @param e - an Episode object
	 */
	public Result(Episode e) {
		this.title = e.titleGetValue();
		this.epTitle = e.epTitleGetValue();
		this.year = e.yearGetValue();
		this.seriesYear = e.seriesYearGetValue();
		this.seasonEpNo = e.seasonEpNoGetValue();
		this.isSuspended = e.isSuspendedGetValue();
		this.mediaType = "EPISODE";
	}
	
	/**
	 * return the string value stored in the title component in each Result object
	 * @return - String title
	 */
	public String titleGetValue(){
		
		return title;
	}
	
	/**
	 * return the string value stored in the year component in each Result object
	 * @return - String year
	 */
	public String yearGetValue(){
		
		return year;
	}
	
	/**
	 * return the string value stored in the media component in each Result object
	 * @return - String media
	 */
	public String mediaGetValue(){
		
		return media;
	}
	
	/**
	 * return the string value stored in the epTitle component in each Result object
	 * @return - String epTitle;
	 */
	public String epTitleGetValue(){
		
		return epTitle;
	}	
	
	/**
	 * return the string value stored in the yearHigh component in each Result Object
	 * @return - String yearHigh
	 */
	public String yearHighGetValue(){
		
		return yearHigh;
	}

	/**
	 * return the string value stored in the yearRN component in each Result Object
	 * @return String yearRN
	 */
	public String yearRNGetValue(){
		
		return yearRN;
		
	}
	
	/**
	 * return the string value stored in the yearRN component in each Result Object
	 * @return String mediaType
	 */
	public String mediaTypeGetValue(){
		
		return mediaType;
		
	}
	
	/**
	 * return the string value stored in the seasonEpNo component in each Result Object
	 * @return String seasonEpNo
	 */
	public String seasonEpNoGetValue(){
		
		return seasonEpNo;
	}

	/**
	 * return the string value stored in the seriesYear component in each Result Object
	 * @return String seriesYear
	 */	
	public String seriesYearGetValue(){
		
		return seriesYear;
	}
	
	/**
	 * return the string value stored in the isSuspended component in each Result Object
	 * @return String isSuspended
	 */	
	public String isSuspendedGetValue(){
		
		return isSuspended;
	}
	/**
	 * comparable override to sort Result by title
	 * @param r - Result to compare with
	 * @return int value [-1,0,1] for sorting purposes
	 */
	@Override
	public int compareTo(Result r) {
		String inString = r.titleGetValue();
		String myString   = this.titleGetValue();
		int compare = inString.compareTo(myString);
		if(compare == 0) return 0;
		if(compare > 0) return 1;
		return -1;
	}
}
