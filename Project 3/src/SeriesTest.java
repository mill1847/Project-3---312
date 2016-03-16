/**
 * Series Test Class (Uses code from project 2)
 * @author David Milligan II
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;
public class SeriesTest {

	@Test
	public void test() {
		Series testSeries = new Series("\"Star Trek Anthology\" (2015)				2015-????");
		
		assertTrue(testSeries.titleGetValue().equals("Star Trek Anthology"));
		assertTrue(testSeries.yearHighGetValue().equals("????"));
		assertTrue(testSeries.yearGetValue().equals("2015"));
		assertTrue(testSeries.isSuspendedGetValue().equals(""));
	}

}
