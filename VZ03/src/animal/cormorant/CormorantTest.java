/**
 * 
 */
package animal.cormorant;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author nim_13515111
 *
 */
public class CormorantTest {

	/**
	 * Test method for {@link animal.cormorant.Cormorant#interact()}.
	 */
	@Test
	public void testInteract() {
		Cormorant c = new Cormorant();
		assertEquals("Ooookkk!", c.interact());
	}

	/**
	 * Test method for {@link animal.cormorant.Cormorant#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Cormorant c = new Cormorant();
		assertEquals("Carnivore", c.getFoodType());
	}

	/**
	 * Test method for {@link animal.cormorant.Cormorant#render()}.
	 */
	@Test
	public void testRender() {
		Cormorant c = new Cormorant();
		assertEquals('M', c.render());
	}

	/**
	 * Test method for {@link animal.cormorant.Cormorant#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Cormorant c = new Cormorant();
		assertFalse(c.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.cormorant.Cormorant#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Cormorant c = new Cormorant();
		assertTrue(c.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.cormorant.Cormorant#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Cormorant c = new Cormorant();
		assertTrue(c.isFlyingAnimal());
	}

}
