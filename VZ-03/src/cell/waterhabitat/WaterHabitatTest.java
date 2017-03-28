package cell.waterhabitat;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import cell.Cell;

import org.junit.Test;

/**
 * Testing WaterHabitat.
 * @author nim_13515111
 */

public class WaterHabitatTest {
  /**
   * Test method for {@link cell.waterhabitat.WaterHabitat#isHabitat()}.
   */

  @Test
  public void testIsHabitat() {
    Cell c = new WaterHabitat();
    assertTrue(c.isHabitat());
  }
  /**
   * Test method for {@link cell.waterhabitat.WaterHabitat#render()}.
   */

  @Test
  public void testRender() {
    Cell c = new WaterHabitat();
    assertEquals('~', c.render());
  }
}
