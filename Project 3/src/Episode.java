/**
 * Episode Object Class (Uses code from project 2)
 * @author David Milligan II
 *
 */
public class Episode implements Comparable<Episode>{
	
	private String title;
	private String epTitle;
	private String year;
	private String seriesYear;
	private String seasonEpNo;
	private String isSuspended;
	
	/**
	 * Constructor that take a string value, parses it, and store the parts as values for Episode objects
	 * @param s - String value of a line in the text file
	 */
	public Episode(String s) {
	
	String tempTitle = "";
	String tempSeriesYear = "";
	String tempEpisodeYear = "";
	String tempEpTitle = "";
	String tempSuspended = "";
	String tempSeasonEpNo = "";
	
	if (!s.contains("{{SUSPENDED}}")){
		String[] array = s.split("[{}\"]+");
		tempTitle = array[1].trim();
		String[] arraySY = array[2].trim().split("[()]+");
		tempSeriesYear = arraySY[1];
		tempEpisodeYear = array[4].trim();
		tempEpTitle = array[3].trim();
		if (tempEpTitle.contains("(")){
		String[] arrayET = array[3].trim().split("[()]+");
		tempEpTitle = arrayET[0].trim();
		tempSeasonEpNo = arrayET[1].trim();}
		}
	else{
		String[] array = s.split("[{}\"]+");
		tempTitle = array[1].trim();
		String[] arraySY = array[2].trim().split("[()]+");
		tempSeriesYear = arraySY[1];
		tempEpisodeYear = array[6].trim();
		if (tempEpTitle.contains("(")){
		String[] arrayET = array[3].trim().split("[()]+");
		tempEpTitle = arrayET[0].trim();
		tempSeasonEpNo = arrayET[1].trim();}
		tempSuspended = "{{SUSPENDED}}";}
	
	title = tempTitle;
	epTitle = tempEpTitle;
	year = tempEpisodeYear;
	seriesYear = tempSeriesYear;
	isSuspended = tempSuspended;
	seasonEpNo = tempSeasonEpNo;
	
	if (year.equals("????")){
		year = "UNSPECIFIED";
	}
	if (seriesYear.equals("????")){
		seriesYear = "UNSPECIFIED";
	}
	}
	
	/**
	 * constructor for with no fields (for searches)
	 */
	 public Episode ()
	 {
	title="";
	epTitle="";
	year="";
	seriesYear="";
	seasonEpNo="";
	isSuspended="";
	}
	 
	/**
	 * return the string value stored in the title component in each Episode object
	 * @return - String title
	 */
	public String titleGetValue(){
		
		return title;
	}
	
	/**
	 * return the string value stored in the series year component in each Episode object
	 * @return - String series year
	 */
	public String seriesYearGetValue(){
		
		return seriesYear;
	}
	
	/**
	 * return the string value stored in the episode year component in each Episode object
	 * @return - String year
	 */
	public String yearGetValue(){
		
		return year;
	}
	
	/**
	 * return the string value stored in the epTitle component in each Episode object
	 * @return - String epTitle;
	 */
	public String epTitleGetValue(){
		
		return epTitle;
	}

	/**
	 * return the string value stored in the season episode number component in each Episode object
	 * @return - String seasonEpNo
	 */
	public String seasonEpNoGetValue(){
		
		return seasonEpNo;
	}

	/**
	 * return the string value stored in the suspended component in each Episode object
	 * @return - String isSuspended
	 */
	public String isSuspendedGetValue(){
		
		return isSuspended;
	}
	/**
	 * sets the year for a Episode
	 * @param string -- a string to be entered as a year (ideally four numbers or question marks)
	 */
	public void setYear(String string) {
		
		this.year = string;
		
	}
	/**
	 * sets the year for a Episode
	 * @param searchInput -- a string to be set as the new epTitle of the Episode
	 */
	public void setEpTitle(String searchInput) {

		this.epTitle = searchInput;
		
	}

	/**
	 * comparable override to sort Episode by title
	 */
	@Override
	public int compareTo(Episode e) {
		String inString = e.titleGetValue();
		String myString   = this.titleGetValue();
		int compare = inString.compareTo(myString);
		if(compare == 0) return 0;
		if(compare > 0) return 1;
		return -1;
	}




}

