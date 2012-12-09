package buaa;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParkTest {

	private Park aPark = new Park(100);
	private ParkingBoy ParkManager = new ParkingBoy(10);
	@Test
	public void testAddCar() {
		//aPark.Stop();
		ParkingBoy aGirl = new ParkingBoy(3);
		//aGirl.Stop(new CarInfo(1));
		Car carInfo = new Car(1);
		assertEquals(aGirl.Stop(carInfo), true);//Equals(99, aPark.getCarnum());
		assertEquals(aGirl.GetCar(carInfo), true);
		
	}
	
	@Test
	public void testStop(){
		Car car1 = new Car(1);
		Car car2 = new Car(2);
		Car car3 = new Car(3);
		assertEquals(ParkManager.Stop(car1),true);
		assertEquals(ParkManager.Stop(car2),true);
		assertEquals(ParkManager.Stop(car3),true);	
	}

	@Test
	public void testGo(){
		ParkManager.Stop(new Car(1));
		assertEquals(ParkManager.GetCar(new Car(2)),false);
	}
	
	@Test
	public void testStatus(){
		ParkManager.Status();
	}
}
