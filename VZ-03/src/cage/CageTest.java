/**
 * 
 */
package cage;
import point.*;
import animal.*;
import animal.reptile.alligator.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * @author nim_13515070
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
	 * Test method for {@link cage.Cage#Cage(cage.Cage)}.
	 */
	@Test
	public void testCageCage() {
		Cage kandang = new Cage(10); 
		Cage cg = new Cage(kandang);
		assertEquals(10, cg.getSize());
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
		Animal a = new Alligator();
		cg.adoptAnimal(a);
		assertEquals(1,cg.getTotalAnimal());
	}

	/**
	 * Test method for {@link cage.Cage#isOccupied(int)}.
	 */
	@Test
	public void testIsOccupiedInt() {
		Cage cg = new Cage(10);
		Animal a = new Alligator();
		cg.adoptAnimal(a);
		assertTrue(cg.isOccupied(0));
	}

	/**
	 * Test method for {@link cage.Cage#isInCage(animal.Animal)}.
	 */
	@Test
	public void testIsInCageAnimal() {
		Cage cg = new Cage(10);
		Animal a = new Alligator();
		cg.adoptAnimal(a);
		assertTrue(cg.isInCage(a));
	}

	/**
	 * Test method for {@link cage.Cage#isInCage(point.Point)}.
	 */
	@Test
	public void testIsInCagePoint() {
		Cage cg = new Cage(10);
		cg.addPoint(1, 1);
		Point p = new Point(1, 1);
		assertTrue(cg.isInCage(p));
	}

	/**
	 * Test method for {@link cage.Cage#isFull()}.
	 */
	@Test
	public void testIsFull() {
		Cage cg = new Cage(10);
		Animal a = new Alligator();
		cg.adoptAnimal(a);
		assertFalse(cg.isFull());
	}

	/**
	 * Test method for {@link cage.Cage#addPoint(int, int)}.
	 */
	@Test
	public void testAddPoint() {
		Cage cg = new Cage(10);
		cg.addPoint(1, 1);
		Point p = new Point(1, 1);
		assertTrue(cg.isInCage(p));
	}

	/**
	 * Test method for {@link cage.Cage#canPut(animal.Animal)}.
	 */
	@Test
	public void testCanPut() {
		Cage cg = new Cage(3);
		Animal a = new Alligator();
		assertTrue(cg.canPut(a));
	}

}
