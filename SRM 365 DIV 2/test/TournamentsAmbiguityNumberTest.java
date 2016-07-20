import org.junit.Test;
import static org.junit.Assert.*;

public class TournamentsAmbiguityNumberTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] table = new String[] {"-10",
 "0-1",
 "10-"};
		assertEquals(3, new TournamentsAmbiguityNumber().scrutinizeTable(table));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] table = new String[] {"----",
 "----",
 "----",
 "----"};
		assertEquals(0, new TournamentsAmbiguityNumber().scrutinizeTable(table));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] table = new String[] {"-1",
 "0-"};
		assertEquals(0, new TournamentsAmbiguityNumber().scrutinizeTable(table));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] table = new String[] {"--1-10-1---1--1-00",
 "--0110000--0---10-",
 "01--00000100-00011",
 "-0---0010-11110100",
 "001--01-00-0001-1-",
 "11111--100--1-1-01",
 "-1110--00110-11-01",
 "0110-01--100110-10",
 "-111111---01--0-01",
 "--0-1100----10011-",
 "--10--011--1--101-",
 "01101-110-0--1-0-1",
 "---010-0-0---00-11",
 "--101-00-1-01-0-0-",
 "0-110001110-11-110",
 "-010-----011--0--0",
 "11010110100-010--0",
 "1-01-0010--00-111-"};
		assertEquals(198, new TournamentsAmbiguityNumber().scrutinizeTable(table));
	}
}
