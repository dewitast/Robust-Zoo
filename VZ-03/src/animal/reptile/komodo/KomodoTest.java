package animal.reptile.komodo;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testing Komodo.
 * @author nim_13515070
 */

public class KomodoTest {
  /**
   * Test method for {@link animal.reptile.komodo.Komodo#interact()}.
   */

  @Test
  public void testInteract() {
    Komodo k = new Komodo();
    assertEquals("Slpp!", k.interact());
  }
  /**
   * Test method for {@link animal.reptile.komodo.Komodo#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Komodo k = new Komodo();
    assertEquals("Carnivore", k.getFoodType());
  }
  /**
   * Test method for {@link animal.reptile.komodo.Komodo#render()}.
   */

  @Test
  public void testRender() {
    Komodo k = new Komodo();
    assertEquals('K', k.render());
  }
  /**
   * Test method for {@link animal.reptile.komodo.Komodo#isLandAnimal()}.
   */

  @Test
  public void testIsLandAnimal() {
    Komodo k = new Komodo();
    assertTrue(k.isLandAnimal());
  }
  /**
   * Test method for {@link animal.reptile.komodo.Komodo#isWaterAnimal()}.
   */

  @Test
  public void testIsWaterAnimal() {
    Komodo k = new Komodo();
    assertFalse(k.isWaterAnimal());
  }
  /**
   * Test method for {@link animal.reptile.komodo.Komodo#isFlyingAnimal()}.
   */

  @Test
  public void testIsFlyingAnimal() {
    Komodo k = new Komodo();
    assertFalse(k.isFlyingAnimal());
  }
}
