/**
 * Movie Object Class (Uses code from project 2)
 * @author David Milligan II
 *
 */

public class Movie implements Comparable <Movie>{
	
	private String title;
	private String media = "Theatre";
	private String year = "UNSPECIFIED";
	private String yearRN = "UNSPECIFIED";
	
	/**
	 * Constructor that take a string value, parse it, and store the parts as values for Movie objects
	 * @param s - String value of a line in the text file
	 */
	public Movie(String s) {
		//replace all the empty spaces in the line with just a single space
				String lineUntrimmed = s.replaceAll("\\s+", " ");
				
				//cut off the last space at the end of the line, if it has any.
				String line = lineUntrimmed.trim();
				
				//the 2 lines of code above ensures all the lines have the same format.
				
				//used to specify the end of substring desired, in this case it is the space right before the 4 digit year at the end of the line
				int delimIndex = line.lastIndexOf(" ");
				
				//parse release year 
				//from the position of the space, +1, to the end of the line
				year = line.substring(delimIndex + 1, line.length());
				
				//parse media
				//cutting the 4 digit year off the end, and cut off any space at the end of the line
				line = line.substring(0, delimIndex).trim();
				//If check the end of the line for (TV), (V) value, and if found, assign appropriate values to parseMedia.
				//if neither is found, parseMedia value remains "????"
				//after the string is parsed, cut off the part that's already stored and any space at the end
				if (line.endsWith("(TV)")) {
					media = "TV";
					line = line.substring(0, line.lastIndexOf('(')).trim();
				}
				else if (line.endsWith("(V)")) {
					media = "straight to video";
					line = line.substring(0, line.lastIndexOf('(')).trim();
				}

				//parse yearRN
				//new delimit to the "("
				delimIndex = line.lastIndexOf('(');
				//the yearRN information is in between the delimiter and the end of the line
				yearRN = line.substring(delimIndex + 1, line.length() - 1);
				//cut off the part that's parsed into parseYearRN and cut off any space at the end, left with title.
				title = line.substring(0, delimIndex).trim();
				
				if (yearRN.equals("????")){
					yearRN = "UNSPECIFIED";
				}
				if (year.equals("????")){
					year = "UNSPECIFIED";
				}
	}
	
	/**
	 * Constructor that Creates a blank movie object
	 * This is specifically so that a binary search can be performed on a list of Movie objects
	 */
	
	public Movie()
	{
		title = "";
		media = "";
		year = "";
		yearRN = "";
	}

	/**
	 * return the string value stored in the title component in each Movie object
	 * @return - String title
	 */
	public String titleGetValue(){
		
		return title;
	}
	
	/**
	 * return the string value stored in the year component in each Movie object
	 * @return - String year
	 */
	public String yearGetValue(){
		
		return year;
	}
	/**
	 * return the string value stored in the yearRN component in each Movie object
	 * @return - String yearRN
	 */
	public String yearRNGetValue(){
		return yearRN;
	}
	
	/**
	 * return the string value stored in the media component in each Movie object
	 * @return - String media
	 */
	public String mediaGetValue(){
		
		return media;
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
	 * Sets the realeaseYear field equal to the newly specified realeaseYear
	 * @param newReleaseYear - The new realeaseYear
	 */
	
	public void setYear(String newReleaseYear)
	{
		this.year = newReleaseYear;
	}
	

	/**
	 * comparable override to sort Movie by title
	 */
	@Override
	public int compareTo(Movie m) {
		String inString = m.titleGetValue();
		String myString   = this.titleGetValue();
		int compare = inString.compareTo(myString);
		if(compare == 0) return 0;
		if(compare > 0) return 1;
		return -1;
	}
}
