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
		//aPark.Stop();
		ParkingBoy aGirl = new ParkingBoy(3);
		//aGirl.Stop(new CarInfo(1));
		CarInfo carInfo = new CarInfo(1);
		assertEquals(aGirl.Stop(carInfo), true);//Equals(99, aPark.getCarnum());
		assertEquals(aGirl.GetCar(carInfo), true);
		
	}

}
