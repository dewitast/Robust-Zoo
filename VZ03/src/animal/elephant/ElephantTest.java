/**
 * 
 */
package animal.elephant;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author nim_13515111
 *
 */
public class ElephantTest {

	/**
	 * Test method for {@link animal.elephant.Elephant#interact()}.
	 */
	@Test
	public void testInteract() {
		Elephant e = new Elephant();
		assertEquals("Prett!", e.interact());
	}

	/**
	 * Test method for {@link animal.elephant.Elephant#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Elephant e = new Elephant();
		assertEquals("Herbivore", e.getFoodType());
	}

	/**
	 * Test method for {@link animal.elephant.Elephant#render()}.
	 */
	@Test
	public void testRender() {
		Elephant e = new Elephant();
		assertEquals('H', e.render());
	}

	/**
	 * Test method for {@link animal.elephant.Elephant#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Elephant e = new Elephant();
		assertTrue(e.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.elephant.Elephant#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Elephant e = new Elephant();
		assertFalse(e.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.elephant.Elephant#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Elephant e = new Elephant();
		assertFalse(e.isFlyingAnimal());
	}

}
