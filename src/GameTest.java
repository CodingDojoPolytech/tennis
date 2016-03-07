import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class GameTest {

	private Player p1;
	private Player p2;
	private Game g;

	@Before
	public void setUp() {
		p1 = new Player();
		p2 = new Player();

		g = new Game(p1, p2);
	}
	
	@Test
	public void testWinP1(){
		assertEquals(Score.LOVE , p1.score);
		
		g.winPointP1();
		
		assertEquals(Score.FIFTEEN, p1.score);
	}
	
	@Test
	public void noAvantage() {
		g.winPointP1();
		g.winPointP1();
		g.winPointP1();
		
		g.winPointP2();
		g.winPointP2();
		g.winPointP2();

		g.winPointP1();
		assertTrue(g.getP1().hasAdvantage());

		g.winPointP2();
		
		assertEquals(Score.FORTY, g.getP1().getScore());
		assertFalse(g.getP1().hasAdvantage());
		assertFalse(g.getP2().hasAdvantage());
	}
	
	@Test
	public void winGameTest(){
		g.winPointP1();
		g.winPointP1();
		g.winPointP1();
		g.winPointP1();
		
		assertEquals(1, p1.getGameWon());
	}
	

}
