package animal.aves.duck;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
/**
 * Testing Duck.
 * @author nim_13515070
 */

public class DuckTest {
  /**
   * Test method for {@link animal.aves.duck.Duck#interact()}.
   */

  @Test
  public void testInteract() {
    Duck d = new Duck();
    assertEquals("Quaackk!", d.interact());
  }
  /**
   * Test method for {@link animal.aves.duck.Duck#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Duck d = new Duck();
    assertEquals("Omnivore", d.getFoodType());
  }
  /**
   * Test method for {@link animal.aves.duck.Duck#render()}.
   */

  @Test
  public void testRender() {
    Duck d = new Duck();
    assertEquals('D', d.render());
  }
  /**
   * Test method for {@link animal.aves.duck.Duck#isLandAnimal()}.
   */

  @Test
  public void testIsLandAnimal() {
    Duck d = new Duck();
    assertFalse(d.isLandAnimal());
  }
  /**
   * Test method for {@link animal.aves.duck.Duck#isWaterAnimal()}.
   */

  @Test
  public void testIsWaterAnimal() {
    Duck d = new Duck();
    assertTrue(d.isWaterAnimal());
  }
  /**
   * Test method for {@link animal.aves.duck.Duck#isFlyingAnimal()}.
   */

  @Test
  public void testIsFlyingAnimal() {
    Duck d = new Duck();
    assertFalse(d.isFlyingAnimal());
  }
}