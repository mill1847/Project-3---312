/**
 * Series Object Class (Uses code from project 2)
 * @author David Milligan II
 *
 */

public class Series implements Comparable <Series>{

	private String title;
	private String year;
	private String yearHigh;
	private String isSuspended;
	/**
	 * Constructor that take a string value, parse it, and store the parts as values for Series objects
	 * @param s - String value of a line in the text file
	 */
	public Series(String s){
	
	String[] array = s.split("[()]+");
		String tempTitle = "";
		String tempYear = "";
		String tempFinal = "";
		String tempSuspended = "";
		
		tempTitle = array[0];
		tempYear = array[1];
		tempFinal = array[2];
		
		String[] titler = tempTitle.split("[ 	]+");
		String[] finaler = tempFinal.trim().split("[ 	-]+");
		tempTitle = "";
		for (int k = 0; k < titler.length; k++)
		{
			tempTitle = tempTitle+titler[k] + " "; 
		}
		tempTitle = tempTitle.substring(1, tempTitle.length()-2);
		tempFinal = finaler[finaler.length-1];
		if (finaler[0].equals("{{SUSPENDED}}"))tempSuspended = "{{SUSPENDED}}";
		
		isSuspended = tempSuspended;
		title = tempTitle;
		year = tempYear;
		yearHigh = tempFinal;
		
		if (year.equals("????")){
			year = "UNSPECIFIED";
		}
		if (yearHigh.equals("????")){
			yearHigh = "UNSPECIFIED";
		}
	}
	
	/**
	 * Constructor that Creates a blank Series object
	 * This is specifically so that a binary search can be performed on a list of Series objects
	 */
	
	public Series()
	{
		title = "";
		year = "";
		yearHigh = "";
		isSuspended = "";
	}
	
	
	/**
	 * return the string value stored in the title component in each Series object
	 * @return - String title
	 */
	public String titleGetValue(){
		
		return title;
	}
	
	/**
	 * return the string value stored in the yearLow component in each Series object
	 * @return - String yearLow
	 */
	public String yearGetValue(){
		
		return year;
	}
	
	/**
	 * return the string value stored in the yearHigh component in each Series Object
	 * @return - String yearHigh
	 */
	public String yearHighGetValue(){
		
		return yearHigh;
	}
	
	/**
	 * returns a string, if the Series is suspended, returns "{{SUSPENDED}}" 
	 * otherwhise it's an empty string return 
	 * @return - String isSuspended
	 */
	public String isSuspendedGetValue(){
		return isSuspended;
	}
	/**
	 * Sets the title field equal to the newly specified title
	 * @param newTitle The new title
	 */
	
	public void setTitle(String newTitle)
	{
		this.title = newTitle;
	}
	
	/**
	 * Sets the yearLow field equal to the newly specified yearLow
	 * @param newYearLow The new title
	 */
	
	public void setYear(String newYearLow)
	{
		this.year = newYearLow;
	}
	
	
	/**
	 * comparable override to sort Series by title
	 */
	@Override
	public int compareTo(Series s) {
		String inString = s.titleGetValue();
		String myString   = this.titleGetValue();
		int compare = inString.compareTo(myString);
		if(compare == 0) return 0;
		if(compare > 0) return 1;
		return -1;
	}
	
}
