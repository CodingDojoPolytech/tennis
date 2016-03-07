import static org.junit.Assert.*;

import org.junit.Test;


public class ScoreTest {

	@Test
	public void compare() {
		assertTrue(Score.LOVE.compareTo(Score.FORTY) < 0);
	}

}
