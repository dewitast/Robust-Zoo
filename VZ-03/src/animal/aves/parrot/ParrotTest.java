package animal.aves.parrot;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
/**
 * Testing Parrot.
 * @author nim_13515070
 */

public class ParrotTest {
  /**
   * Test method for {@link animal.aves.parrot.Parrot#interact()}.
   */

  @Test
  public void testInteract() {
    Parrot p = new Parrot();
    assertEquals("Cuiitt", p.interact());
  }
  /**
   * Test method for {@link animal.aves.parrot.Parrot#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Parrot p = new Parrot();
    assertEquals("Omnivore", p.getFoodType());
  }
  /**
   * Test method for {@link animal.aves.parrot.Parrot#render()}.
   */

  @Test
  public void testRender() {
    Parrot p = new Parrot();
    assertEquals('P', p.render());
  }
  /**
   * Test method for {@link animal.aves.parrot.Parrot#isLandAnimal()}.
   */

  @Test
  public void testIsLandAnimal() {
    Parrot p = new Parrot();
    assertFalse(p.isLandAnimal());
  }
  /**
   * Test method for {@link animal.aves.parrot.Parrot#isWaterAnimal()}.
   */

  @Test
  public void testIsWaterAnimal() {
    Parrot p = new Parrot();
    assertFalse(p.isWaterAnimal());
  }
  /**
   * Test method for {@link animal.aves.parrot.Parrot#isFlyingAnimal()}.
   */

  @Test
  public void testIsFlyingAnimal() {
    Parrot p = new Parrot();
    assertTrue(p.isFlyingAnimal());
  }
}
