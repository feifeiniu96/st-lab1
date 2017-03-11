package javaPro;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTest {
	private Triangle triangle;

	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void testTriangles() {
		triangle = new Triangle();
		assertEquals (3, triangle.triangles (1,2,3));
		assertEquals (0, triangle.triangles (1,1,1));
		assertEquals (1, triangle.triangles (2,2,3));
		assertEquals (2, triangle.triangles (3,4,5));
	}

}
