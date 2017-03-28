package driver;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Testing driver.
 * @author nim_13515063
 */

public class DriverTest {
  /**
   * Test method for {@link driver.Driver#Driver()}.
   */

  @Test
  public void testDriver() {
    Driver d = new Driver();
    assertEquals(-1, d.getPoint().getAbsis());
    assertEquals(-1, d.getPoint().getOrdinat());
  }

  /**
   * Test method for {@link driver.Driver#getZoo()}.
   */

  @Test
  public void testGetZoo() {
    Driver d = new Driver();
    assertEquals(0, d.getZoo().getJumlahCage());
    assertEquals(0, d.getZoo().getBaris());
    assertEquals(0, d.getZoo().getKolom());
  }
  /**
   * Test method for {@link driver.Driver#getPoint()}.
   */

  @Test
  public void testGetPoint() {
    Driver d = new Driver();
    assertEquals(-1, d.getPoint().getAbsis());
    assertEquals(-1, d.getPoint().getOrdinat());;
  }
}