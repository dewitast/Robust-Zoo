/**
 * 
 */
package animal.tiger;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author nim_13515111
 *
 */
public class TigerTest {

	/**
	 * Test method for {@link animal.tiger.Tiger#interact()}.
	 */
	@Test
	public void testInteract() {
		Tiger t = new Tiger();
		assertEquals("Growl", t.interact());
	}

	/**
	 * Test method for {@link animal.tiger.Tiger#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Tiger t = new Tiger();
		assertEquals("Carnivore", t.getFoodType());
	}

	/**
	 * Test method for {@link animal.tiger.Tiger#render()}.
	 */
	@Test
	public void testRender() {
		Tiger t = new Tiger();
		assertEquals('T', t.render());
	}

	/**
	 * Test method for {@link animal.tiger.Tiger#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Tiger t = new Tiger();
		assertTrue(t.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.tiger.Tiger#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Tiger t = new Tiger();
		assertFalse(t.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.tiger.Tiger#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Tiger t = new Tiger();
		assertFalse(t.isFlyingAnimal());
	}

}
