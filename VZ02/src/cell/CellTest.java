/**
 * 
 */
package cell;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author nim_13515111
 *
 */
public class CellTest {

 /**
  * Test method for {@link cell.Cell#Cell()}.
  */
 @Test
 public void testCell() {
  Cell c = new Cell();
  assertEquals("Road", c.getObjectType());
  assertEquals('+', c.render());
 }

 /**
  * Test method for {@link cell.Cell#Cell(java.lang.String)}.
  */
 @Test
 public void testCellString() {
  Cell c = new Cell("LandHabitat");
  assertEquals('@', c.render());
 }

 /**
  * Test method for {@link cell.Cell#getObjectType()}.
  */
 @Test
 public void testGetObjectType() {
  Cell c = new Cell();
  assertEquals("Road", c.getObjectType());
 }

 /**
  * Test method for {@link cell.Cell#render()}.
  */
 @Test
 public void testRender() {
  Cell c = new Cell();
  assertEquals('+', c.render());
 }

 /**
  * Test method for {@link cell.Cell#setObjectType(java.lang.String)}.
  */
 @Test
 public void testSetObjectType() {
  Cell c = new Cell();
  c.setObjectType("LandHabitat");
  assertEquals('@', c.render());
 }

 /**
  * Test method for {@link cell.Cell#isHabitat()}.
  */
 @Test
 public void testIsHabitat() {
  Cell c = new Cell();
  assertFalse(c.isHabitat());
 }

 /**
  * Test method for {@link cell.Cell#isLandHabitat()}.
  */
 @Test
 public void testIsLandHabitat() {
  Cell c = new Cell();
  assertFalse(c.isLandHabitat());
 }

 /**
  * Test method for {@link cell.Cell#isAirHabitat()}.
  */
 @Test
 public void testIsAirHabitat() {
  Cell c = new Cell();
  assertFalse(c.isAirHabitat());
 }

 /**
  * Test method for {@link cell.Cell#isWaterHabitat()}.
  */
 @Test
 public void testIsWaterHabitat() {
  Cell c = new Cell();
  assertFalse(c.isWaterHabitat());
 }

 /**
  * Test method for {@link cell.Cell#isExit()}.
  */
 @Test
 public void testIsExit() {
  Cell c = new Cell();
  assertFalse(c.isExit());
 }

 /**
  * Test method for {@link cell.Cell#isRoad()}.
  */
 @Test
 public void testIsRoad() {
  Cell c = new Cell();
  assertTrue(c.isRoad());
 }

 /**
  * Test method for {@link cell.Cell#isEntrance()}.
  */
 @Test
 public void testIsEntrance() {
  Cell c = new Cell();
  assertFalse(c.isEntrance());
 }

}
