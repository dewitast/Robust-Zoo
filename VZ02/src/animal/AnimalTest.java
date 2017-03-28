/**
 * 
 */

package animal;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import point.Point;

/**
 * Testing animal.
 * @author nim_13515111
 *
 */

public class AnimalTest {
  /**
   * Test method for {@link animal.Animal#Animal()}.
   */
  @Test

  public void testAnimal() {
    Animal a = new Animal();
    assertEquals("Dugong", a.getSpecies());
  }
  /**
   * Test method for {@link animal.Animal#Animal(point.Point, java.lang.String, java.lang.String, 
   * java.lang.String, java.lang.String[], double, double, double, int, boolean, char)}.
   */

  @Test
  public void testAnimalPointStringStringStringStringArrayDoubleDoubleDoubleIntBooleanChar() {
    String[] h = new String[2];
    int jh = 2;
    h[0] = "Land";
    h[1] = "Water";
    Point p = new Point(1,2);
    Animal a = new Animal(p, "Alligator", "Grrrrrr", "Carnivore", h, 125, 6.25, 0, jh, false, 'A');
    assertEquals("Alligator", a.getSpecies());
  }
  /**
   * Test method for {@link animal.Animal#Animal(animal.Animal)}.
   */

  @Test
  public void testAnimalAnimal() {
    Animal a = new Animal();
    Animal acopy = new Animal(a);
    assertEquals("Dugong", acopy.getSpecies());
  }
  /**
   * Test method for {@link animal.Animal#isCarnivore()}.
   */

  @Test
  public void testIsCarnivore() {
    Animal a = new Animal();
    assertFalse(a.isCarnivore());
  }
  /**
   * Test method for {@link animal.Animal#isOmnivore()}.
   */

  @Test
  public void testIsOmnivore() {
    Animal a = new Animal();
    assertFalse(a.isOmnivore());
  }
  /**
   * Test method for {@link animal.Animal#isHerbivore()}.
   */

  @Test
  public void testIsHerbivore() {
    Animal a = new Animal();
    assertTrue(a.isHerbivore());
  }
  /**
   * Test method for {@link animal.Animal#getPos()}.
   */

  @Test
  public void testGetPos() {
    Animal a = new Animal();
    assertEquals(-1, a.getPos().getAbsis());
  }
  /**
   * Test method for {@link animal.Animal#getSpecies()}.
   */

  @Test
  public void testGetSpecies() {
    Animal a = new Animal();
    assertEquals("Dugong", a.getSpecies());
  }
  /**
   * Test method for {@link animal.Animal#interact()}.
   */

  @Test
  public void testInteract() {
    Animal a = new Animal();
    assertEquals("Splashh!", a.interact());
  }
  /**
   * Test method for {@link animal.Animal#getFoodType()}.
   */

  @Test
  public void testGetFoodType() {
    Animal a = new Animal();
    assertEquals("Herbivore", a.getFoodType());
  }
  /**
   * Test method for {@link animal.Animal#getNumberOfHabitat()}.
   */

  @Test
  public void testGetNumberOfHabitat() {
    Animal a = new Animal();
    assertEquals(1, a.getNumberOfHabitat());
  }
  /**
   * Test method for {@link animal.Animal#getTame()}.
   */

  @Test
  public void testGetTame() {
    Animal a = new Animal();
    assertTrue(a.getTame());
  }
  /**
   * Test method for {@link animal.Animal#render()}.
   */

  @Test
  public void testRender() {
    Animal a = new Animal();
    assertEquals('U', a.render());
  }
  /**
   * Test method for {@link animal.Animal#setPoint(int, int)}.
   */

  @Test
  public void testSetPointIntInt() {
    Animal a = new Animal();
    a.setPoint(1, 1);
    assertEquals(1, a.getPos().getAbsis());
  }
  /**
   * Test method for {@link animal.Animal#setPoint(point.Point)}.
   */

  @Test
  public void testSetPointPoint() {
    Animal a = new Animal();
    Point p = new Point(1, 2);
    a.setPoint(p);
    assertEquals(1, a.getPos().getAbsis());
  }
  /**
   * Test method for {@link animal.Animal#isSame(animal.Animal)}.
   */

  @Test
  public void testIsSame() {
    Animal a = new Animal();
    Animal b = new Animal();
    assertTrue(a.isSame(b));
  }
}
