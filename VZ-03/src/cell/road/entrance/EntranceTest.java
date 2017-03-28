/**
 * 
 */
package cell.road.entrance;

import cell.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author nim_13515111
 *
 */
public class EntranceTest {

	/**
	 * Test method for {@link cell.road.entrance.Entrance#render()}.
	 */
	@Test
	public void testRender() {
		Cell c = new Entrance();
		assertEquals('Z', c.render());
	}

}
