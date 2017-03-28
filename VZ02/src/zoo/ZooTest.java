/**
 * 
 */
package zoo;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author nim_13515063
 *
 */
public class ZooTestTest {

 /**
  * Test method for {@link zoo.ZooTest#testZoo()}.
  */
 @Test
 public void testTestZoo() {
  Zoo z = new Zoo();
  assertEquals(0, z.getBaris());
  assertEquals(0, z.getKolom());
  assertEquals(0, z.getJumlahCage());
 }

 /**
  * Test method for {@link zoo.ZooTest#testZooIntInt()}.
  */
 @Test
 public void testTestZooIntInt() {
  Zoo z = new Zoo(2, 4);
  assertEquals(2, z.getBaris());
  assertEquals(4, z.getKolom());
  assertEquals(0, z.getJumlahCage());
 }

 /**
  * Test method for {@link zoo.ZooTest#testGetBaris()}.
  */
 @Test
 public void testTestGetBaris() {
  Zoo z = new Zoo(2, 4);
  assertEquals(2, z.getBaris());
 }

 /**
  * Test method for {@link zoo.ZooTest#testGetKolom()}.
  */
 @Test
 public void testTestGetKolom() {
  Zoo z = new Zoo(2, 4);
  assertEquals(4, z.getKolom());
 }

 /**
  * Test method for {@link zoo.ZooTest#testGetJumlahCage()}.
  */
 @Test
 public void testTestGetJumlahCage() {
  Zoo z = new Zoo();
  assertEquals(0, z.getJumlahCage());
 }

}
