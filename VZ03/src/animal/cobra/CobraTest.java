/**
 * 
 */
package animal.cobra;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author nim_13515111
 *
 */
public class CobraTest {

	/**
	 * Test method for {@link animal.cobra.Cobra#interact()}.
	 */
	@Test
	public void testInteract() {
		Cobra c = new Cobra();
		assertEquals("Ssshh!", c.interact());
	}

	/**
	 * Test method for {@link animal.cobra.Cobra#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Cobra c = new Cobra();
		assertEquals("Carnivore", c.getFoodType());
	}

	/**
	 * Test method for {@link animal.cobra.Cobra#render()}.
	 */
	@Test
	public void testRender() {
		Cobra c = new Cobra();
		assertEquals('C', c.render());
	}

	/**
	 * Test method for {@link animal.cobra.Cobra#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Cobra c = new Cobra();
		assertTrue(c.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.cobra.Cobra#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Cobra c = new Cobra();
		assertFalse(c.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.cobra.Cobra#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Cobra c = new Cobra();
		assertFalse(c.isFlyingAnimal());
	}

}
