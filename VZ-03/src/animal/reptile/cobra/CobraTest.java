package animal.reptile.cobra;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testing Cobra.
 * @author nim_13515070
 */

public class CobraTest {
  /**
   * Test method for {@link animal.reptile.cobra.Cobra#interact()}.
   */

  @Test
  public void testInteract() {
    Cobra c = new Cobra();
    assertEquals("Ssshh!", c.interact());
  }
  /**
   * Test method for {@link animal.reptile.cobra.Cobra#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Cobra c = new Cobra();
    assertEquals("Carnivore", c.getFoodType());
  }
  /**
   * Test method for {@link animal.reptile.cobra.Cobra#render()}.
   */

  @Test
  public void testRender() {
    Cobra c = new Cobra();
    assertEquals('C', c.render());
  }
  /**
   * Test method for {@link animal.reptile.cobra.Cobra#isLandAnimal()}.
   */

  @Test
  public void testIsLandAnimal() {
    Cobra c = new Cobra();
    assertTrue(c.isLandAnimal());
  }
  /**
   * Test method for {@link animal.reptile.cobra.Cobra#isWaterAnimal()}.
   */

  @Test
  public void testIsWaterAnimal() {
    Cobra c = new Cobra();
    assertFalse(c.isWaterAnimal());
  }
  /**
   * Test method for {@link animal.reptile.cobra.Cobra#isFlyingAnimal()}.
   */

  @Test
  public void testIsFlyingAnimal() {
    Cobra c = new Cobra();
    assertFalse(c.isFlyingAnimal());
  }
}
