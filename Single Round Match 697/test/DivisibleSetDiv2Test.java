import org.junit.Test;
import static org.junit.Assert.*;

public class DivisibleSetDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int[] b = new int[] {3,2};
		assertEquals("Possible", new DivisibleSetDiv2().isPossible(b));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] b = new int[] {3,3,3};
		assertEquals("Possible", new DivisibleSetDiv2().isPossible(b));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] b = new int[] {1,10};
		assertEquals("Impossible", new DivisibleSetDiv2().isPossible(b));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] b = new int[] {2, 3, 10};
		assertEquals("Possible", new DivisibleSetDiv2().isPossible(b));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] b = new int[] {7,10,4,6,3};
		assertEquals("Possible", new DivisibleSetDiv2().isPossible(b));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] b = new int[] {9,9,9,9,9,9,9,9,9};
		assertEquals("Possible", new DivisibleSetDiv2().isPossible(b));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int[] b = new int[] {3,4,5,6,7};
		assertEquals("Impossible", new DivisibleSetDiv2().isPossible(b));
	}
}
