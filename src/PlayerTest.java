import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class PlayerTest {

	private Player p;
	
	@Before
	public void setUp(){
		p = new Player();
	}
	
	@Test
	public void hasAdvantage() {
		assertFalse(p.hasAdvantage());
	}
	
	@Test
	public void defaultScore() {
		assertEquals(Score.LOVE, p.getScore());
	}
	
	@Test
	public void scores(){
		p.winPoint();
		assertEquals(Score.FIFTEEN, p.getScore());
		
		p.winPoint();
		assertEquals(Score.THIRTY, p.getScore());

		p.winPoint();
		assertEquals(Score.FORTY, p.getScore());
	}
	
	@Ignore
	public void getAdvantage(){
		p.winPoint();
		assertTrue(p.hasAdvantage());
	}

}
