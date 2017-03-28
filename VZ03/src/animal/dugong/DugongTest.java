/**
 * 
 */
package animal.dugong;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author nim_13515111
 *
 */
public class DugongTest {

	/**
	 * Test method for {@link animal.dugong.Dugong#interact()}.
	 */
	@Test
	public void testInteract() {
		Dugong d = new Dugong();
		assertEquals("Splashh!", d.interact());
	}

	/**
	 * Test method for {@link animal.dugong.Dugong#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Dugong d = new Dugong();
		assertEquals("Herbivore", d.getFoodType());
	}

	/**
	 * Test method for {@link animal.dugong.Dugong#render()}.
	 */
	@Test
	public void testRender() {
		Dugong d = new Dugong();
		assertEquals('U', d.render());
	}

	/**
	 * Test method for {@link animal.dugong.Dugong#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Dugong d = new Dugong();
		assertFalse(d.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.dugong.Dugong#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Dugong d = new Dugong();
		assertTrue("Splashh!", d.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.dugong.Dugong#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Dugong d = new Dugong();
		assertFalse(d.isFlyingAnimal());
	}

}
