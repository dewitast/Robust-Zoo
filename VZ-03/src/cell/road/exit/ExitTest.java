/**
 * 
 */
package cell.road.exit;

import static org.junit.Assert.*;

import org.junit.Test;

import cell.Cell;

/**
 * @author nim_13515111
 *
 */
public class ExitTest {

	/**
	 * Test method for {@link cell.road.exit.Exit#render()}.
	 */
	@Test
	public void testRender() {
		Cell c = new Exit();
		assertEquals('X', c.render());
	}

}
