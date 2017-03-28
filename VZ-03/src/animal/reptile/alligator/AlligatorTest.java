package animal.reptile.alligator;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlligatorTest {
  /**
   * Test method for {@link animal.reptile.alligator.Alligator#interact()}.
   */

  @Test
  public void testInteract() {
    Alligator a = new Alligator();
    assertEquals("Grrrrrr", a.interact());
  }
  /**
   * Test method for {@link animal.reptile.alligator.Alligator#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Alligator a = new Alligator();
    assertEquals("Carnivore", a.getFoodType());
  }
  /**
   * Test method for {@link animal.reptile.alligator.Alligator#render()}.
   */

  @Test
  public void testRender() {
    Alligator a = new Alligator();
    assertEquals('A', a.render());
  }
  /**
   * Test method for {@link animal.reptile.alligator.Alligator#isLandAnimal()}.
   */

  @Test
  public void testIsLandAnimal() {
    Alligator a = new Alligator();
    assertTrue(a.isLandAnimal());
  }
  /**
   * Test method for {@link animal.reptile.alligator.Alligator#isWaterAnimal()}.
   */

  @Test
  public void testIsWaterAnimal() {
    Alligator a = new Alligator();
    assertTrue(a.isWaterAnimal());
  }
  /**
   * Test method for {@link animal.reptile.alligator.Alligator#isFlyingAnimal()}.
   */

  @Test
  public void testIsFlyingAnimal() {
    Alligator a = new Alligator();
    assertFalse(a.isFlyingAnimal());
  }
}
