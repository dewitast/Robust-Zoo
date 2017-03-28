package cell.park;

import static org.junit.Assert.*;

import cell.Cell;

import org.junit.Test;

/**
 * Testing park.
 * @author nim_13515111
 */

public class ParkTest {
  /**
   * Test method for {@link cell.park.Park#isHabitat()}.
   */

  @Test
  public void testIsHabitat() {
	  Cell c = new Park();
	  assertFalse(c.isHabitat());
  }
  /**
   * Test method for {@link cell.park.Park#render()}.
   */

  @Test
  public void testRender() {
	  Cell c = new Park();
	  assertEquals('#', c.render());
  }
}
