package animal.mammal.tiger;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testing Tiger.
 * @author nim_13515070
 */

public class TigerTest {
  /**
   * Test method for {@link animal.mammal.tiger.Tiger#interact()}.
   */

  @Test
  public void testInteract() {
    Tiger t = new Tiger();
    assertEquals("Growl", t.interact());
  }
  /**
   * Test method for {@link animal.mammal.tiger.Tiger#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Tiger t = new Tiger();
    assertEquals("Carnivore", t.getFoodType());
  }
  /**
   * Test method for {@link animal.mammal.tiger.Tiger#render()}.
   */

  @Test
  public void testRender() {
    Tiger t = new Tiger();
    assertEquals('T', t.render());
  }
  /**
   * Test method for {@link animal.mammal.tiger.Tiger#isLandAnimal()}.
   */

  @Test
  public void testIsLandAnimal() {
    Tiger t = new Tiger();
    assertTrue(t.isLandAnimal());
  }
  /**
   * Test method for {@link animal.mammal.tiger.Tiger#isWaterAnimal()}.
   */

  @Test
  public void testIsWaterAnimal() {
    Tiger t = new Tiger();
    assertFalse(t.isWaterAnimal());
  }
  /**
   * Test method for {@link animal.mammal.tiger.Tiger#isFlyingAnimal()}.
   */

  @Test
  public void testIsFlyingAnimal() {
    Tiger t = new Tiger();
    assertFalse(t.isFlyingAnimal());
  }
}
