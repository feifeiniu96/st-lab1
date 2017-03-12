package javaPro;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TriangleTest {
	private int a;
	private int b;
	private int c;
	private int expected;
	private Triangle triangle;

	public TriangleTest(int a, int b, int c, int expected){
		         this.a = a;
		         this.b = b;
		         this.c = c;
		         this.expected = expected;
		     }
	@Before
	public void setUp() throws Exception {
		System.out.println("Before test");
		triangle = new Triangle();
	}
	
	@Parameters
	public static Collection<Object[]>getData(){
		return Arrays.asList(new Object[][]{
			{1, 2, 3, 3},
			{1, 1, 1, 0},
			{2, 2, 3, 1},
			{3, 4, 5, 2}
		});
	}
	@Test
	public void testTriangles() {
		assertEquals (this.expected, triangle.triangles(a, b, c));
//		assertEquals (0, triangle.triangles (1,1,1));
//		assertEquals (1, triangle.triangles (2,2,3));
//		assertEquals (2, triangle.triangles (3,4,5));
	}

}
