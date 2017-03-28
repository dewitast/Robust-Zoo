package animal.mammal.giraffe;

import static org.junit.Assert.*;

import org.junit.Test;

public class GiraffeTest {
  /**
   * Test method for {@link animal.mammal.giraffe.Giraffe#interact()}.
   */

  @Test
  public void testInteract() {
    Giraffe g = new Giraffe();
    assertEquals("Hmm!", g.interact());
  }
  /**
   * Test method for {@link animal.mammal.giraffe.Giraffe#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Giraffe g = new Giraffe();
    assertEquals("Herbivore", g.getFoodType());
  }
  /**
   * Test method for {@link animal.mammal.giraffe.Giraffe#render()}.
   */

  @Test
  public void testRender() {
    Giraffe g = new Giraffe();
    assertEquals('F', g.render());
  }
  /**
   * Test method for {@link animal.mammal.giraffe.Giraffe#isLandAnimal()}.
   */

  @Test
  public void testIsLandAnimal() {
    Giraffe g = new Giraffe();
    assertTrue(g.isLandAnimal());
  }
  /**
   * Test method for {@link animal.mammal.giraffe.Giraffe#isWaterAnimal()}.
   */

  @Test
  public void testIsWaterAnimal() {
    Giraffe g = new Giraffe();
    assertFalse(g.isWaterAnimal());
  }
  /**
   * Test method for {@link animal.mammal.giraffe.Giraffe#isFlyingAnimal()}.
   */

  @Test
  public void testIsFlyingAnimal() {
    Giraffe g = new Giraffe();
    assertFalse(g.isFlyingAnimal());
  }
}
