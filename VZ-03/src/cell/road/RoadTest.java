package cell.road;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import cell.Cell;

import org.junit.Test;

/**
 * Testing Road.
 * @author nim_13515111
 */

public class RoadTest {
  /**
   * Test method for {@link cell.road.Road#isHabitat()}.
   */

  @Test
  public void testIsHabitat() {
    Cell c = new Road();
    assertFalse(c.isHabitat());
  }
  /**
   * Test method for {@link cell.road.Road#render()}.
   */

  @Test
  public void testRender() {
    Cell c = new Road();
    assertEquals('+', c.render());
  }
}
