/**
 * 
 */
package animal.orca;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * @author nim_13515111
 *
 */
public class OrcaTest {

	/**
	 * Test method for {@link animal.orca.Orca#interact()}.
	 */
	@Test
	public void testInteract() {
		Orca o = new Orca();
		assertEquals("Ngiak!", o.interact());
	}

	/**
	 * Test method for {@link animal.orca.Orca#getFoodType()}.
	 */
	@Test
	public void testGetFoodType() {
		Orca o = new Orca();
		assertEquals("Carnivore", o.getFoodType());
	}

	/**
	 * Test method for {@link animal.orca.Orca#render()}.
	 */
	@Test
	public void testRender() {
		Orca o = new Orca();
		assertEquals('R', o.render());
	}

	/**
	 * Test method for {@link animal.orca.Orca#isLandAnimal()}.
	 */
	@Test
	public void testIsLandAnimal() {
		Orca o = new Orca();
		assertFalse(o.isLandAnimal());
	}

	/**
	 * Test method for {@link animal.orca.Orca#isWaterAnimal()}.
	 */
	@Test
	public void testIsWaterAnimal() {
		Orca o = new Orca();
		assertTrue(o.isWaterAnimal());
	}

	/**
	 * Test method for {@link animal.orca.Orca#isFlyingAnimal()}.
	 */
	@Test
	public void testIsFlyingAnimal() {
		Orca o = new Orca();
		assertFalse(o.isFlyingAnimal());
	}

}
