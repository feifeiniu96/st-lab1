/**
 * 
 */
package printPrime;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author lonely
 *
 */
public class printPrimeTest {

	private printPrime printPrime;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		printPrime = new printPrime();
	}

	/**
	 * Test method for {@link printPrime.printPrime#printPrimes(int)}.
	 */
	@Test
	public void testPrintPrimes() {
//		assertEquals("2 3 ",printPrime.printPrimes(2));
//		assertEquals("2 3 5 ",printPrime.printPrimes(3));
		assertEquals("2 3 5 7 ",printPrime.printPrimes(4));
	}

}
