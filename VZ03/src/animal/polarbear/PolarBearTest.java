/**
 * 
 */
package animal.polarbear;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author nim_13515111
 *
 */
public class PolarBearTest {

	/**
	 * Test method for {@link animal.polarbear.PolarBear#interact()}.
	 */
	@Test
	public void testInteract() {
		PolarBear p = new PolarBear();
		assertEquals("Auuummm", p.interact());
	}

	/**
	 * Test method for {@link animal.polarbear.PolarBear#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		PolarBear p = new PolarBear();
		assertEquals("Carnivore", p.getFoodType());
	}

	/**
	 * Test method for {@link animal.polarbear.PolarBear#render()}.
	 */
	@Test
	public void testRender() {
		PolarBear p = new PolarBear();
		assertEquals('B', p.render());
	}

	/**
	 * Test method for {@link animal.polarbear.PolarBear#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		PolarBear p = new PolarBear();
		assertTrue(p.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.polarbear.PolarBear#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		PolarBear p = new PolarBear();
		assertTrue(p.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.polarbear.PolarBear#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		PolarBear p = new PolarBear();
		assertFalse(p.isFlyingAnimal());
	}

}
