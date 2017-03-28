/**
 * 
 */
package animal.walrus;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author nim_13515111
 *
 */
public class WalrusTest {

	/**
	 * Test method for {@link animal.walrus.Walrus#interact()}.
	 */
	@Test
	public void testInteract() {
		Walrus w = new Walrus();
		assertEquals("Aaarhhh", w.interact());
	}

	/**
	 * Test method for {@link animal.walrus.Walrus#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Walrus w = new Walrus();
		assertEquals("Carnivore", w.getFoodType());
	}

	/**
	 * Test method for {@link animal.walrus.Walrus#render()}.
	 */
	@Test
	public void testRender() {
		Walrus w = new Walrus();
		assertEquals('W', w.render());
	}

	/**
	 * Test method for {@link animal.walrus.Walrus#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Walrus w = new Walrus();
		assertFalse(w.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.walrus.Walrus#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Walrus w = new Walrus();
		assertTrue(w.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.walrus.Walrus#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Walrus w = new Walrus();
		assertFalse(w.isFlyingAnimal());
	}

}
