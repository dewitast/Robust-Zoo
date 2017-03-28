package zoo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Testing zoo.
 * @author nim_13515063
 */

public class ZooTest {
  /**
   * Test method for {@link zoo.Zoo#Zoo()}.
   */

  @Test
  public void testZoo() {
    Zoo z = new Zoo();
    assertEquals(0, z.getBaris());
    assertEquals(0, z.getKolom());
    assertEquals(0, z.getJumlahCage());
  }
  /**
   * Test method for {@link zoo.Zoo#Zoo(int, int)}.
   */

  @Test
  public void testZooIntInt() {
    Zoo z = new Zoo(5, 10);
    assertEquals(5, z.getBaris());
    assertEquals(10, z.getKolom());
    assertEquals(0, z.getJumlahCage());
  }
  /**
   * Test method for {@link zoo.Zoo#getBaris()}.
   */

  @Test
  public void testGetBaris() {
    Zoo z = new Zoo(5, 10);
    assertEquals(5, z.getBaris());
  }
  /**
   * Test method for {@link zoo.Zoo#getKolom()}.
   */

  @Test
  public void testGetKolom() {
    Zoo z = new Zoo(5, 10);
    assertEquals(10, z.getKolom());
  }
  /**
   * Test method for {@link zoo.Zoo#getJumlahCage()}.
   */

  @Test
  public void testGetJumlahCage() {
    Zoo z = new Zoo();
    assertEquals(0, z.getJumlahCage());
  }
}
