/**
 * Episode Test Class (Uses code from project 2)
 * @author David Milligan II
 *
 */
import static org.junit.Assert.*;
import org.junit.Test;
public class EpisodeTest {

	@Test
	public void test() {
		Episode testEpisode = new Episode("\"Star Trek Anthology\" (2015) {Another Door Opens (#1.1)}	2016");
		
		assertTrue(testEpisode.yearGetValue().equals("2016"));
 		assertTrue(testEpisode.titleGetValue().equals("Star Trek Anthology"));
 		assertTrue(testEpisode.seriesYearGetValue().equals("2015"));
 		assertTrue(testEpisode.epTitleGetValue().equals("Another Door Opens"));
 		assertTrue(testEpisode.seasonEpNoGetValue().equals("#1.1"));
 		assertTrue(testEpisode.isSuspendedGetValue().equals(""));
	}

}
