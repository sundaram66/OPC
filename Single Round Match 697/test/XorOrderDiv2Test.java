import org.junit.Test;
import static org.junit.Assert.*;

public class XorOrderDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int m = 2;
		int[] a = new int[] {0,1,2};
		assertArrayEquals(new long[] {6, 6, 8 }, new XorOrderDiv2().getExpectation(m, a));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int m = 1;
		int[] a = new int[] {1};
		assertArrayEquals(new long[] {0 }, new XorOrderDiv2().getExpectation(m, a));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int m = 5;
		int[] a = new int[] {13,17};
		assertArrayEquals(new long[] {16, 16 }, new XorOrderDiv2().getExpectation(m, a));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int m = 30;
		int[] a = new int[] {1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals(new long[] {29527900160, 28991029248, 28991029248, 27917287424, 27917287424, 27917287424, 27917287424, 35433480192, 35433480192, 35970351104 }, new XorOrderDiv2().getExpectation(m, a));
	}
}
