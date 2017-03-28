import org.junit.Test;
import static org.junit.Assert.*;

public class BearPasswordAnyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] x = new int[] {5,0,0,0,0};
		assertEquals("ababa", new BearPasswordAny().findPassword(x));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] x = new int[] {4,2,1,0};
		assertEquals("baaa", new BearPasswordAny().findPassword(x));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] x = new int[] {3,1,1};
		assertEquals("", new BearPasswordAny().findPassword(x));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] x = new int[] {4,3,2,1};
		assertEquals("aaaa", new BearPasswordAny().findPassword(x));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] x = new int[] {0};
		assertEquals("", new BearPasswordAny().findPassword(x));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] x = new int[] {4,0,3,2};
		assertEquals("", new BearPasswordAny().findPassword(x));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int[] x = new int[] {6,3,1,0,0,0};
		assertEquals("abbaaa", new BearPasswordAny().findPassword(x));
	}
	
	@Test(timeout=2000)
	public void test7() {
		int[] x = new int[] {10,5,2,1,0,0,0,0,0,0};
		assertEquals("bbbbaababb", new BearPasswordAny().findPassword(x));
	}
	
	@Test(timeout=2000)
	public void test8() {
		int[] x = new int[] {5,4,2,1,0};
		assertEquals("", new BearPasswordAny().findPassword(x));
	}
}
