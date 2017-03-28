/**
 * 
 */
package cell.park;

import cell.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author nim_13515111
 *
 */
public class ParkTest {

	/**
	 * Test method for {@link cell.park.Park#isHabitat()}.
	 */
	@Test
	public void testIsHabitat() {
		Cell c = new Park();
		assertFalse(c.isHabitat());
	}

	/**
	 * Test method for {@link cell.park.Park#render()}.
	 */
	@Test
	public void testRender() {
		Cell c = new Park();
		assertEquals('#', c.render());
	}

}
