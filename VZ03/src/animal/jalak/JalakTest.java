/**
 * 
 */
package animal.jalak;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author nim_13515111
 *
 */
public class JalakTest {

	/**
	 * Test method for {@link animal.jalak.Jalak#interact()}.
	 */
	@Test
	public void testInteract() {
		Jalak j = new Jalak();
		assertEquals("Tweet!", j.interact());
	}

	/**
	 * Test method for {@link animal.jalak.Jalak#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Jalak j = new Jalak();
		assertEquals("Herbivore", j.getFoodType());
	}

	/**
	 * Test method for {@link animal.jalak.Jalak#render()}.
	 */
	@Test
	public void testRender() {
		Jalak j = new Jalak();
		assertEquals('J', j.render());
	}

	/**
	 * Test method for {@link animal.jalak.Jalak#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Jalak j = new Jalak();
		assertFalse(j.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.jalak.Jalak#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Jalak j = new Jalak();
		assertFalse(j.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.jalak.Jalak#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Jalak j = new Jalak();
		assertTrue(j.isFlyingAnimal());
	}

}
