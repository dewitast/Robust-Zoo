/**
 * 
 */

package cage;

import static org.junit.Assert.*;

import animal.Animal;

import org.junit.*;

/**
 * testing cage.
 * @author nim_13515111
 *
 */
public class CageTest {
  /**
   * Test method for {@link cage.Cage#Cage()}.
   */

  @Test
  public void testCage() {
    Cage cg = new Cage();
    assertEquals(0, cg.getSize());
    assertEquals(0, cg.getTotalAnimal());
  }
  /**
   * Test method for {@link cage.Cage#Cage(int)}.
   */

  @Test
  public void testCageInt() {
    Cage cg = new Cage(10);
    assertEquals(10, cg.getSize());
    assertEquals(0, cg.getTotalAnimal());
  }
  /**
   * Test method for {@link cage.Cage#Cage(int, int)}.
   */

  @Test
  public void testCageIntInt() {
    Cage cg = new Cage(1, 2);
    assertEquals(1, cg.getSize());
    assertEquals(0, cg.getTotalAnimal());
  }
  /**
   * Test method for {@link cage.Cage#getSize()}.
   */

  @Test
  public void testGetSize() {
    Cage cg = new Cage(5);
    assertEquals(5, cg.getSize());
  }
  /**
   * Test method for {@link cage.Cage#getTotalAnimal()}.
   */

  @Test
  public void testGetTotalAnimal() {
    Cage cg = new Cage(10);
    assertEquals(0, cg.getTotalAnimal());
  }
  /**
   * Test method for {@link cage.Cage#adoptAnimal(animal.Animal)}.
   */

  @Test
  public void testAdoptAnimal() {
    Cage cg = new Cage(10);
    Animal a = new Animal();
    cg.adoptAnimal(a);
    assertEquals(1,cg.getTotalAnimal());
  }
  /**
   * Test method for {@link cage.Cage#isFull()}.
   */

  @Test
  public void testIsFull() {
    Cage cg = new Cage(10);
    Animal a = new Animal();
    cg.adoptAnimal(a);
    assertFalse(cg.isFull());
  }
  /**
   * Test method for {@link cage.Cage#canPut(animal.Animal)}.
   */
  
  @Test
  public void testCanPut() {
    Cage cg = new Cage(3);
    Animal a = new Animal();
    assertTrue(cg.canPut(a));
  }
}
