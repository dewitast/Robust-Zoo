package cell.landhabitat;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import cell.Cell;

import org.junit.Test;

/**
 * Testing LandHabitat.
 * @author nim_13515111
 */

public class LandHabitatTest {
  /**
   * Test method for {@link cell.landhabitat.LandHabitat#isHabitat()}.
   */

  @Test
  public void testIsHabitat() {
    Cell c = new LandHabitat();
    assertTrue(c.isHabitat());
  }
  /**
   * Test method for {@link cell.landhabitat.LandHabitat#render()}.
   */

  @Test
  public void testRender() {
    Cell c = new LandHabitat();
    assertEquals('@', c.render());
  }
}
