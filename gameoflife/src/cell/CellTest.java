package cell;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CellTest {
	Cell c=new Cell();
	@Before
	public void setUp() throws Exception {
		c.die();
	}
	@Test
	public void testDie() {
		//fail("尚未实现");
		c.die();
		assertEquals(false, c.islive());
	}
	@Test
	public void testReborn() {
		//fail("尚未实现");
		c.reborn();
		assertEquals(true, c.islive());
	}
	@Test
	public void testIslive() {
		//fail("尚未实现");
		c.die();
		assertEquals(false, c.islive());
	}
}
