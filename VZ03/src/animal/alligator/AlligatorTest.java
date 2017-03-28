/**
 * 
 */
package animal.alligator;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * @author nim_13515111
 *
 */
public class AlligatorTest {

	/**
	 * Test method for {@link animal.alligator.Alligator#interact()}.
	 */
	@Test
	public void testInteract() {
		Alligator a = new Alligator();
		assertEquals("Grrrrrr", a.interact());
	}

	/**
	 * Test method for {@link animal.alligator.Alligator#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Alligator a = new Alligator();
		assertEquals("Carnivore", a.getFoodType());
	}

	/**
	 * Test method for {@link animal.alligator.Alligator#render()}.
	 */
	@Test
	public void testRender() {
		Alligator a = new Alligator();
		assertEquals('A', a.render());
	}

	/**
	 * Test method for {@link animal.alligator.Alligator#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Alligator a = new Alligator();
		assertTrue(a.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.alligator.Alligator#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Alligator a = new Alligator();
		assertTrue(a.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.alligator.Alligator#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Alligator a = new Alligator();
		assertFalse(a.isFlyingAnimal());
	}

}
