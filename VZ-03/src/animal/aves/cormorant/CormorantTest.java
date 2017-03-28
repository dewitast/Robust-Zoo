package animal.aves.cormorant;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * Testing Cormorant.
 * @author nim_13515070
 */

public class CormorantTest {
  /**
   * Test method for {@link animal.aves.cormorant.Cormorant#interact()}.
   */

  @Test
  public void testInteract() {
    Cormorant c = new Cormorant();
    assertEquals("Ooookkk!", c.interact());
  }
  /**
   * Test method for {@link animal.aves.cormorant.Cormorant#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Cormorant c = new Cormorant();
    assertEquals("Carnivore", c.getFoodType());
  }
  /**
   * Test method for {@link animal.aves.cormorant.Cormorant#render()}.
   */
  
  @Test
  public void testRender() {
    Cormorant c = new Cormorant();
    assertEquals('M', c.render());
  }
  /**
   * Test method for {@link animal.aves.cormorant.Cormorant#isLandAnimal()}.
   */

  @Test
  public void testIsLandAnimal() {
    Cormorant c = new Cormorant();
    assertFalse(c.isLandAnimal());
  }
  /**
   * Test method for {@link animal.aves.cormorant.Cormorant#isWaterAnimal()}.
   */

  @Test
  public void testIsWaterAnimal() {
    Cormorant c = new Cormorant();
    assertTrue(c.isWaterAnimal());
  }
  /**
   * Test method for {@link animal.aves.cormorant.Cormorant#isFlyingAnimal()}.
   */

  @Test
  public void testIsFlyingAnimal() {
    Cormorant c = new Cormorant();
    assertTrue(c.isFlyingAnimal());
  }
}