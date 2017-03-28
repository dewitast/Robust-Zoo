package animal.mammal.dolphin;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testing Dolphin.
 * @author nim_13515070
 */

public class DolphinTest {
  /**
   * Test method for {@link animal.mammal.dolphin.Dolphin#interact()}.
   */

  @Test
  public void testInteract() {
    Dolphin d = new Dolphin();
    assertEquals("A a a a a", d.interact());
  }
  /**
   * Test method for {@link animal.mammal.dolphin.Dolphin#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Dolphin d = new Dolphin();
    assertEquals("Carnivore", d.getFoodType());
  }
  /**
   * Test method for {@link animal.mammal.dolphin.Dolphin#render()}.
   */

  @Test
  public void testRender() {
    Dolphin d = new Dolphin();
    assertEquals('N', d.render());
  }
  /**
   * Test method for {@link animal.mammal.dolphin.Dolphin#isLandAnimal()}.
   */

  @Test
  public void testIsLandAnimal() {
    Dolphin d = new Dolphin();
    assertFalse(d.isLandAnimal());
  }
  /**
   * Test method for {@link animal.mammal.dolphin.Dolphin#isWaterAnimal()}.
   */

  @Test
  public void testIsWaterAnimal() {
    Dolphin d = new Dolphin();
    assertTrue(d.isWaterAnimal());
  }
  /**
   * Test method for {@link animal.mammal.dolphin.Dolphin#isFlyingAnimal()}.
   */

  @Test
  public void testIsFlyingAnimal() {
    Dolphin d = new Dolphin();
    assertFalse(d.isFlyingAnimal());
  }
}
