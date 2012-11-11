package buaa;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParkTest {

	private Park aPark = new Park(100);
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//		assertEquals(0, 0);
//	}
	
	@Test
	public void testAddCar() {
		aPark.Stop();
		assertEquals(99, aPark.getFreeCarNum());//Equals(99, aPark.getCarnum());
		
	}

}
