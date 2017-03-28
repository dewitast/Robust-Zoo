package animal.aves.eagle;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Testing Eagle.
 * @author nim_13515070
 */

public class EagleTest {
  /**
   * Test method for {@link animal.aves.eagle.Eagle#interact()}.
   */

  @Test
  public void testInteract() {
    Eagle e = new Eagle();
    assertEquals("Nguiikk!", e.interact());
  }
  /**
   * Test method for {@link animal.aves.eagle.Eagle#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Eagle e = new Eagle();
    assertEquals("Carnivore", e.getFoodType());
  }
  /**
   * Test method for {@link animal.aves.eagle.Eagle#render()}.
   */

  @Test
  public void testRender() {
    Eagle e = new Eagle();
    assertEquals('E', e.render());
  }
  /**
   * Test method for {@link animal.aves.eagle.Eagle#isLandAnimal()}.
   */

  @Test
  public void testIsLandAnimal() {
    Eagle e = new Eagle();
    assertFalse(e.isLandAnimal());
  }
  /**
   * Test method for {@link animal.aves.eagle.Eagle#isWaterAnimal()}.
   */

  @Test
  public void testIsWaterAnimal() {
    Eagle e = new Eagle();
    assertFalse(e.isWaterAnimal());
  }
  /**
   * Test method for {@link animal.aves.eagle.Eagle#isFlyingAnimal()}.
   */

  @Test
  public void testIsFlyingAnimal() {
    Eagle e = new Eagle();
    assertTrue(e.isFlyingAnimal());
  }
}