/**
 * Maker Test Class (Uses code from project 2)
 * @author David Milligan II
 *
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class MakerTest {

	@Test
	public void test() {
		String input = "Watson, Emma (II) 'Harry Potter': Behind the Magic (2001) (TV) [Herself]\n'Harry Potter': Behind the Magic (2005) (TV) [Herself]\nConjuring a Scene (2004) (V) (archive footage) (uncredited) [Hermione Granger]";
		Maker m = new Maker(input);
		
		assertTrue(m.titleGetValue().equals("Watson, Emma"));
		assertTrue(m.appearanceEpisodesGetValue().size() == 0);
		assertTrue(m.appearanceMoviesGetValue().size() == 3);
		assertTrue(m.appearanceSeriesGetValue().size() == 0);
		assertTrue(m.appearanceYearsGetValue().size() == 3);
	}

}
