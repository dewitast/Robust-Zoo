/**
 * 
 */
package animal.owl;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author nim_13515111
 *
 */
public class OwlTest {

	/**
	 * Test method for {@link animal.owl.Owl#interact()}.
	 */
	@Test
	public void testInteract() {
		Owl o = new Owl();
		assertEquals("Hoot!", o.interact());
	}

	/**
	 * Test method for {@link animal.owl.Owl#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Owl o = new Owl();
		assertEquals("Carnivore", o.getFoodType());
	}

	/**
	 * Test method for {@link animal.owl.Owl#render()}.
	 */
	@Test
	public void testRender() {
		Owl o = new Owl();
		assertEquals('O', o.render());
	}

	/**
	 * Test method for {@link animal.owl.Owl#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Owl o = new Owl();
		assertFalse(o.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.owl.Owl#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Owl o = new Owl();
		assertFalse(o.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.owl.Owl#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Owl o = new Owl();
		assertTrue(o.isFlyingAnimal());
	}

}
