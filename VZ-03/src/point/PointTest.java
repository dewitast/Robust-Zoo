/**
 * 
 */
package point;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author nim_13515070
 *
 */
public class PointTest {

	/**
	 * Test method for {@link point.Point#Point()}.
	 */
	@Test
	public void testPoint() {
		Point p = new Point();
		assertEquals(0, p.getAbsis());
		assertEquals(0, p.getOrdinat());
	}

	/**
	 * Test method for {@link point.Point#Point(int, int)}.
	 */
	@Test
	public void testPointIntInt() {
		Point p = new Point(1, 2);
		assertEquals(1, p.getAbsis());
		assertEquals(2, p.getOrdinat());
	}

	/**
	 * Test method for {@link point.Point#Point(point.Point)}.
	 */
	@Test
	public void testPointPoint() {
		Point p = new Point(1, 2);
		Point pcopy = new Point(p);
		assertEquals(1, pcopy.getAbsis());
		assertEquals(2, pcopy.getOrdinat());
	}

	/**
	 * Test method for {@link point.Point#getAbsis()}.
	 */
	@Test
	public void testGetAbsis() {
		Point p = new Point(1, 2);
		assertEquals(1, p.getAbsis());
	}

	/**
	 * Test method for {@link point.Point#getOrdinat()}.
	 */
	@Test
	public void testGetOrdinat() {
		Point p = new Point(1, 2);
		assertEquals(2, p.getOrdinat());
	}

	/**
	 * Test method for {@link point.Point#setAbsis(int)}.
	 */
	@Test
	public void testSetAbsis() {
		Point p = new Point();
		p.setAbsis(12);
		assertEquals(12, p.getAbsis());
	}

	/**
	 * Test method for {@link point.Point#setOrdinat(int)}.
	 */
	@Test
	public void testSetOrdinat() {
		Point p = new Point();
		p.setOrdinat(12);
		assertEquals(12, p.getOrdinat());
	}

	/**
	 * Test method for {@link point.Point#nextX()}.
	 */
	@Test
	public void testNextX() {
		Point p = new Point(0, 0);
		p = p.nextX();
		assertEquals(1, p.getAbsis());
	}

	/**
	 * Test method for {@link point.Point#prevX()}.
	 */
	@Test
	public void testPrevX() {
		Point p = new Point(0, 0);
		p = p.prevX();
		assertEquals(-1, p.getAbsis());
	}

	/**
	 * Test method for {@link point.Point#prevY()}.
	 */
	@Test
	public void testPrevY() {
		Point p = new Point(0, 0);
		p = p.prevY();
		assertEquals(-1, p.getOrdinat());
	}

	/**
	 * Test method for {@link point.Point#nextY()}.
	 */
	@Test
	public void testNextY() {
		Point p = new Point(0, 0);
		p = p.nextY();
		assertEquals(1, p.getOrdinat());
	}

	/**
	 * Test method for {@link point.Point#isSame(point.Point)}.
	 */
	@Test
	public void testIsSame() {
		Point p1 = new Point();
		Point p2 = new Point(1, 2);
		assertFalse(p1.isSame(p2));
	}

}
