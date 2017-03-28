package animal.reptile.iguana;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testing Iguana.
 * @author nim_13515070
 */

public class IguanaTest {
  /**
   * Test method for {@link animal.reptile.iguana.Iguana#interact()}.
   */

  @Test
  public void testInteract() {
    Iguana i = new Iguana();
    assertEquals("Purrrr", i.interact());
  }
  /**
   * Test method for {@link animal.reptile.iguana.Iguana#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Iguana i = new Iguana();
    assertEquals("Herbivore", i.getFoodType());
  }
  /**
   * Test method for {@link animal.reptile.iguana.Iguana#render()}.
   */

  @Test
  public void testRender() {
    Iguana i = new Iguana();
    assertEquals('I', i.render());
  }
  /**
   * Test method for {@link animal.reptile.iguana.Iguana#isLandAnimal()}.
   */

  @Test
  public void testIsLandAnimal() {
    Iguana i = new Iguana();
    assertTrue(i.isLandAnimal());
  }
  /**
   * Test method for {@link animal.reptile.iguana.Iguana#isWaterAnimal()}.
   */

  @Test
  public void testIsWaterAnimal() {
    Iguana i = new Iguana();
    assertFalse(i.isWaterAnimal());
  }
  /**
   * Test method for {@link animal.reptile.iguana.Iguana#isFlyingAnimal()}.
   */

  @Test
  public void testIsFlyingAnimal() {
    Iguana i = new Iguana();
    assertFalse(i.isFlyingAnimal());
  }
}
