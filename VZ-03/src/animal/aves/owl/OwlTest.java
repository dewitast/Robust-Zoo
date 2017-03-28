package animal.aves.owl;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
/**
 * Testing Owl.
 * @author nim_13515070
 */

public class OwlTest {
  /**
   * Test method for {@link animal.aves.owl.Owl#interact()}.
   */

  @Test
  public void testInteract() {
    Owl o = new Owl();
    assertEquals("Hoot!", o.interact());
  }
  /**
   * Test method for {@link animal.aves.owl.Owl#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Owl o = new Owl();
    assertEquals("Carnivore", o.getFoodType());
  }
  /**
   * Test method for {@link animal.aves.owl.Owl#render()}.
   */

  @Test
  public void testRender() {
    Owl o = new Owl();
    assertEquals('O', o.render());
  }

  /**
   * Test method for {@link animal.aves.owl.Owl#isLandAnimal()}.
   */

  @Test
  public void testIsLandAnimal() {
    Owl o = new Owl();
    assertFalse(o.isLandAnimal());
  }
  /**
   * Test method for {@link animal.aves.owl.Owl#isWaterAnimal()}.
   */

  @Test
  public void testIsWaterAnimal() {
    Owl o = new Owl();
    assertFalse(o.isWaterAnimal());
  }
  /**
   * Test method for {@link animal.aves.owl.Owl#isFlyingAnimal()}.
   */

  @Test
  public void testIsFlyingAnimal() {
    Owl o = new Owl();
    assertTrue(o.isFlyingAnimal());
  }
}