import org.junit.Test;
import static org.junit.Assert.*;

public class PointsOnCircleTest {
	
	@Test(timeout=2000)
	public void test0() {
		int r = 1;
		assertEquals(4L, new PointsOnCircle().count(r));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int r = 2000000000;
		assertEquals(76L, new PointsOnCircle().count(r));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int r = 3;
		assertEquals(4L, new PointsOnCircle().count(r));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int r = 1053;
		assertEquals(12L, new PointsOnCircle().count(r));
	}
}
