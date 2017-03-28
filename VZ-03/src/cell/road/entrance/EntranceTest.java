package cell.road.entrance;

import static org.junit.Assert.assertEquals;

import cell.Cell;

import org.junit.Test;

/**
 * Testing Entrance.
 * @author nim_13515111
 */
public class EntranceTest {
  /**
   * Test method for {@link cell.road.entrance.Entrance#render()}.
   */

  @Test
  public void testRender() {
    Cell c = new Entrance();
    assertEquals('Z', c.render());
  }
}
