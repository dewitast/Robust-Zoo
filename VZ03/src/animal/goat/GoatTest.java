/**
 * 
 */
package animal.goat;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author nim_13515111
 *
 */
public class GoatTest {

	/**
	 * Test method for {@link animal.goat.Goat#interact()}.
	 */
	@Test
	public void testInteract() {
		Goat g = new Goat();
		assertEquals("Mbeeeee!", g.interact());
	}

	/**
	 * Test method for {@link animal.goat.Goat#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Goat g = new Goat();
		assertEquals("Herbivore", g.getFoodType());
	}

	/**
	 * Test method for {@link animal.goat.Goat#render()}.
	 */
	@Test
	public void testRender() {
		Goat g = new Goat();
		assertEquals('G', g.render());
	}

	/**
	 * Test method for {@link animal.goat.Goat#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Goat g = new Goat();
		assertTrue(g.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.goat.Goat#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Goat g = new Goat();
		assertFalse(g.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.goat.Goat#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Goat g = new Goat();
		assertFalse(g.isFlyingAnimal());
	}

}
