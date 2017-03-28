package animal.mammal.walrus;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Testing walrus.
 * @author nim_13515070
 */

public class WalrusTest {
  /**
   * Test method for {@link animal.mammal.walrus.Walrus#interact()}.
   */

  @Test
   public void testInteract() {
    Walrus w = new Walrus();
    assertEquals("Aaarhhh", w.interact());
  }
  /**
   * Test method for {@link animal.mammal.walrus.Walrus#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Walrus w = new Walrus();
    assertEquals("Carnivore", w.getFoodType());
  }
  /**
   * Test method for {@link animal.mammal.walrus.Walrus#render()}.
   */

  @Test
  public void testRender() {
    Walrus w = new Walrus();
    assertEquals('W', w.render());
  }
  /**
   * Test method for {@link animal.mammal.walrus.Walrus#isLandAnimal()}.
   */

  @Test
  public void testIsLandAnimal() {
    Walrus w = new Walrus();
    assertFalse(w.isLandAnimal());
  }
  /**
   * Test method for {@link animal.mammal.walrus.Walrus#isWaterAnimal()}.
   */

  @Test
  public void testIsWaterAnimal() {
    Walrus w = new Walrus();
    assertTrue(w.isWaterAnimal());
  }
  /**
   * Test method for {@link animal.mammal.walrus.Walrus#isFlyingAnimal()}.
   */

  @Test
  public void testIsFlyingAnimal() {
    Walrus w = new Walrus();
    assertFalse(w.isFlyingAnimal());
  }
}
