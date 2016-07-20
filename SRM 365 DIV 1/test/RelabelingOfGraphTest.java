import org.junit.Test;
import static org.junit.Assert.*;

public class RelabelingOfGraphTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] m = new String[] {"0100", "0010", "0001", "0000"};
		assertArrayEquals(new int[] {0, 1, 2, 3 }, new RelabelingOfGraph().renumberVertices(m));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] m = new String[] {"010", "001", "100"};
		assertArrayEquals(new int[] { }, new RelabelingOfGraph().renumberVertices(m));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] m = new String[] {"00001", "00010", "00000", "00001", "00100"};
		assertArrayEquals(new int[] {0, 1, 4, 2, 3 }, new RelabelingOfGraph().renumberVertices(m));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] m = new String[] {"0"};
		assertArrayEquals(new int[] {0 }, new RelabelingOfGraph().renumberVertices(m));
	}
}
