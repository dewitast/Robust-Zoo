/**
 * 
 */
package animal.lion;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author nim_13515111
 *
 */
public class LionTest {

	/**
	 * Test method for {@link animal.lion.Lion#interact()}.
	 */
	@Test
	public void testInteract() {
		Lion l = new Lion();
		assertEquals("Roaarr!", l.interact());
	}

	/**
	 * Test method for {@link animal.lion.Lion#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Lion l = new Lion();
		assertEquals("Carnivore", l.getFoodType());
	}

	/**
	 * Test method for {@link animal.lion.Lion#render()}.
	 */
	@Test
	public void testRender() {
		Lion l = new Lion();
		assertEquals('L', l.render());
	}

	/**
	 * Test method for {@link animal.lion.Lion#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Lion l = new Lion();
		assertTrue(l.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.lion.Lion#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Lion l = new Lion();
		assertFalse(l.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.lion.Lion#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Lion l = new Lion();
		assertFalse(l.isFlyingAnimal());
	}

}
