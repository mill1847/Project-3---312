/**
 * Result Test Class (Uses code from project 2)
 * @author David Milligan II
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;
public class ResultTest {

	@Test
	public void test() {
		String inputMovie = "Star Trek (and the Science Fiction Museum and Hall of Fame)  (2009)    2009";
		Movie testMovie = new Movie(inputMovie);
		Result testResult1 = new Result(testMovie);
		assertTrue(testResult1.titleGetValue().equals("Star Trek (and the Science Fiction Museum and Hall of Fame)"));
		assertTrue(testResult1.yearRNGetValue().equals("2009"));
		assertTrue(testResult1.mediaGetValue().equals("UNSPECIFIED"));
		assertTrue(testResult1.yearGetValue().equals("2009"));
		
		String inputSeries = "\"Star Trek: The Continuing Mission\" (2007) {{SUSPENDED}}	2007-????";
		Series testSeries = new Series(inputSeries);
		Result testResult2 = new Result(testSeries);
		assertTrue(testResult2.titleGetValue().equals("\"Star Trek: The Continuing Mission\""));
		assertTrue(testResult2.yearHighGetValue().equals("????"));
		assertTrue(testResult2.yearGetValue().equals("2007")); 
		assertTrue(testResult2.isSuspendedGetValue().equals("{{SUSPENDED}}"));
		
		String inputEpisode = "\"Star Trek: The Continuing Mission\" (2007) {We Will Control All That You See and Hear (#1.6)} {{SUSPENDED}}	2010";
		Episode testEpisode = new Episode(inputEpisode);
		Result testResult3 = new Result(testEpisode);
		assertTrue(testResult3.titleGetValue().equals("Star Trek: The Continuing Mission"));
		assertTrue(testResult3.yearGetValue().equals("2010")); 
		assertTrue(testResult3.seriesYearGetValue().equals("2007")); 
		assertTrue(testResult3.epTitleGetValue().equals("We Will Control All That You See and Hear"));
		assertTrue(testResult3.isSuspendedGetValue().equals("{{SUSPENDED}}"));
		assertTrue(testResult3.seasonEpNoGetValue().equals("#1.6"));
	}

}
