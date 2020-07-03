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
		//fail("��δʵ��");
		c.die();
		assertEquals(false, c.islive());
	}
	@Test
	public void testReborn() {
		//fail("��δʵ��");
		c.reborn();
		assertEquals(true, c.islive());
	}
	@Test
	public void testIslive() {
		//fail("��δʵ��");
		c.die();
		assertEquals(false, c.islive());
	}
}
