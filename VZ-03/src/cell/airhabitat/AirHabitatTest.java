/**
 * 
 */
package cell.airhabitat;

import cell.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author nim_13515111
 *
 */
public class AirHabitatTest {

	/**
	 * Test method for {@link cell.airhabitat.AirHabitat#isHabitat()}.
	 */
	@Test
	public void testIsHabitat() {
		Cell c = new AirHabitat();
		assertTrue(c.isHabitat());
	}

	/**
	 * Test method for {@link cell.airhabitat.AirHabitat#render()}.
	 */
	@Test
	public void testRender() {
		Cell c = new AirHabitat();
		assertEquals('^', c.render());
	}

}
