import org.junit.Test;
import static org.junit.Assert.*;

public class MirrorNumberTest {
	
	@Test(timeout=2000)
	public void test0() {
		String A = "0";
		String B = "10";
		assertEquals(3, new MirrorNumber().count(A, B));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String A = "0";
		String B = "100";
		assertEquals(7, new MirrorNumber().count(A, B));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String A = "143";
		String B = "23543";
		assertEquals(54, new MirrorNumber().count(A, B));
	}
}
