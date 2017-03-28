/**
 * 
 */
package animal.parrot;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author nim_13515111
 *
 */
public class ParrotTest {

	/**
	 * Test method for {@link animal.parrot.Parrot#interact()}.
	 */
	@Test
	public void testInteract() {
		Parrot p = new Parrot();
		assertEquals("Cuiitt", p.interact());
	}

	/**
	 * Test method for {@link animal.parrot.Parrot#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Parrot p = new Parrot();
		assertEquals("Omnivore", p.getFoodType());
	}

	/**
	 * Test method for {@link animal.parrot.Parrot#render()}.
	 */
	@Test
	public void testRender() {
		Parrot p = new Parrot();
		assertEquals('P', p.render());
	}

	/**
	 * Test method for {@link animal.parrot.Parrot#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Parrot p = new Parrot();
		assertFalse(p.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.parrot.Parrot#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Parrot p = new Parrot();
		assertFalse(p.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.parrot.Parrot#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Parrot p = new Parrot();
		assertTrue(p.isFlyingAnimal());
	}

}
