/**
 * 
 */
package animal.eagle;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author nim_13515111
 *
 */
public class EagleTest {

	/**
	 * Test method for {@link animal.eagle.Eagle#interact()}.
	 */
	@Test
	public void testInteract() {
		Eagle e = new Eagle();
		assertEquals("Nguiikk!", e.interact());
	}

	/**
	 * Test method for {@link animal.eagle.Eagle#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Eagle e = new Eagle();
		assertEquals("Carnivore", e.getFoodType());
	}

	/**
	 * Test method for {@link animal.eagle.Eagle#render()}.
	 */
	@Test
	public void testRender() {
		Eagle e = new Eagle();
		assertEquals('E', e.render());
	}

	/**
	 * Test method for {@link animal.eagle.Eagle#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Eagle e = new Eagle();
		assertFalse(e.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.eagle.Eagle#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Eagle e = new Eagle();
		assertFalse(e.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.eagle.Eagle#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Eagle e = new Eagle();
		assertTrue(e.isFlyingAnimal());
	}

}
