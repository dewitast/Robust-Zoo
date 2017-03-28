/**
 * 
 */
package animal.mammal.lion;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author nim_13515070
 *
 */
public class LionTest {

	/**
	 * Test method for {@link animal.mammal.lion.Lion#interact()}.
	 */
	@Test
	public void testInteract() {
		Lion l = new Lion();
		assertEquals("Roaarr!", l.interact());
	}

	/**
	 * Test method for {@link animal.mammal.lion.Lion#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Lion l = new Lion();
		assertEquals("Carnivore", l.getFoodType());
	}

	/**
	 * Test method for {@link animal.mammal.lion.Lion#render()}.
	 */
	@Test
	public void testRender() {
		Lion l = new Lion();
		assertEquals('L', l.render());
	}

	/**
	 * Test method for {@link animal.mammal.lion.Lion#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Lion l = new Lion();
		assertTrue(l.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.mammal.lion.Lion#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Lion l = new Lion();
		assertFalse(l.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.mammal.lion.Lion#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Lion l = new Lion();
		assertFalse(l.isFlyingAnimal());
	}

}
