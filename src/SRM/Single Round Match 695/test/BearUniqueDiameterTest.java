import org.junit.Test;
import static org.junit.Assert.*;

public class BearUniqueDiameterTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] a = new int[] {0,0,0};
		int[] b = new int[] {1,2,3};
		assertEquals(10, new BearUniqueDiameter().countSubtrees(a, b));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] a = new int[] {3,2,1,4,0};
		int[] b = new int[] {1,3,4,0,5};
		assertEquals(21, new BearUniqueDiameter().countSubtrees(a, b));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] a = new int[] {0,1,2,3,2};
		int[] b = new int[] {1,2,3,4,5};
		assertEquals(22, new BearUniqueDiameter().countSubtrees(a, b));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] a = new int[] {1};
		int[] b = new int[] {0};
		assertEquals(3, new BearUniqueDiameter().countSubtrees(a, b));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] a = new int[] {36,23,33,33,33,24,33,33,33,33,37,33,33,33,33,28,33,33,22,33,
29,16,33,33,33,33,33,31,35,33,33,8,13,26,12,33,33,0,33,33};
		int[] b = new int[] {33,33,0,9,39,33,32,40,15,19,33,30,38,7,25,33,27,11,33,3,33,33,
21,18,5,6,4,33,11,14,10,33,33,33,33,20,2,1,34,17};
		assertEquals(719477120, new BearUniqueDiameter().countSubtrees(a, b));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] a = new int[] {0,0,0,1,2,3,4,5,6};
		int[] b = new int[] {1,2,3,4,5,6,7,8,9};
		assertEquals(70, new BearUniqueDiameter().countSubtrees(a, b));
	}
}
