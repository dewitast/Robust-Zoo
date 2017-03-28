/**
 * 
 */
package cell.restaurant;

import cell.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author nim_13515111
 *
 */
public class RestaurantTest {

	/**
	 * Test method for {@link cell.restaurant.Restaurant#isHabitat()}.
	 */
	@Test
	public void testIsHabitat() {
		Cell c = new Restaurant();
		assertFalse(c.isHabitat());
	}

	/**
	 * Test method for {@link cell.restaurant.Restaurant#render()}.
	 */
	@Test
	public void testRender() {
		Cell c = new Restaurant();
		assertEquals('S', c.render());
	}

}
