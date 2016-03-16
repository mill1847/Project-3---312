/**
 * Movie Test Class (Uses code from project 2)
 * @author David Milligan II
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;
public class MovieTest {

	@Test
	public void test() {
 		String[] input = new String[1];
 		input[0] =  "Star Trek (and the Science Fiction Museum and Hall of Fame)  (2009)    2009";
 		String parseTitle = "";
 		String parseYearRN = "";
 		String parseMedia = "";
 		String parseReleaseYear = "";
 		
 		Movie[] testMovie = new Movie[input.length];
 		for (int i = 0; i < input.length; i++){
 			testMovie[i]= new Movie(input[i]);
 		}
 		parseTitle = testMovie[0].titleGetValue();
 		parseYearRN = testMovie[0].yearRNGetValue();
 		parseMedia = testMovie[0].mediaGetValue();
 		parseReleaseYear = testMovie[0].yearGetValue();
 		
 	
 		assertTrue(parseTitle.equals("Star Trek (and the Science Fiction Museum and Hall of Fame)"));
 		assertTrue(parseYearRN.equals("2009"));
 		assertTrue(parseMedia.equals("UNSPECIFIED"));
 		assertTrue(parseReleaseYear.equals("2009"));
	}

}
