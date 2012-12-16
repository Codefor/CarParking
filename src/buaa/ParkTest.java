package buaa;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParkTest {
	@Test
	public void testAddCar() {
		//aPark.Stop();
		ParkingBoy aGirl = new ParkingBoy(3,2);
		//aGirl.Stop(new CarInfo(1));
		Car carInfo = new Car(1);
		assertEquals(aGirl.Stop(carInfo), true);//Equals(99, aPark.getCarnum());
		assertEquals(aGirl.Go(carInfo), true);
		
	}
	
	@Test
	public void testSingleParkStop(){
		Park aPark = new Park(3);
		//���пճ�λ ��ͣһ���� Ӧ�óɹ�
		assertEquals(aPark.Stop(new Car(1)),true);
		assertEquals(aPark.Stop(new Car(2)),true);
		//�ظ�ͣ����ʧ��
		assertEquals(aPark.Stop(new Car(1)),false);
		assertEquals(aPark.Stop(new Car(3)),true);
		//��ͣ������ ��ͣһ���� Ӧ��ʧ��
		assertEquals(aPark.Stop(new Car(4)),false);
	}
	
	@Test
	public void testSingleParkGo(){
		Park aPark = new Park(3);
		Car c = new Car(1);
		aPark.Stop(c);
		//ͣ��һ���� ������ȷƱ��ȡ�� Ӧ�óɹ���ȡ�ĳ���ͣ��ȥ����ͬһ����,Ʊ�ݼ�Ϊ���ƺ�
		assertEquals(aPark.Go(c),true);//same as assertEquals(aPark.Go(new Car(1)),true);
		assertEquals(aPark.Go(new Car(4)),false);
	}
	@Test
	public void testStop(){
		ParkingBoy ParkManager = new ParkingBoy(2,3);
		Car car1 = new Car(1);
		Car car2 = new Car(2);
		Car car3 = new Car(3);
		Car car4 = new Car(4);
		Car car5 = new Car(5);
		Car car6 = new Car(6);
		Car car7 = new Car(7);
		assertEquals(ParkManager.Stop(car1),true);
		assertEquals(ParkManager.Stop(car2),true);
		assertEquals(ParkManager.Stop(car3),true);	
		assertEquals(ParkManager.Stop(car4),true);
		assertEquals(ParkManager.Stop(car5),true);
		assertEquals(ParkManager.Stop(car6),true);
		assertEquals(ParkManager.Stop(car7),false);
	}

	@Test
	public void testGo(){
		ParkingBoy ParkManager = new ParkingBoy(2,3);
		ParkManager.Stop(new Car(1));
		ParkManager.Stop(new Car(2));
		ParkManager.Stop(new Car(3));
		ParkManager.Stop(new Car(4));
		ParkManager.Stop(new Car(5));
		ParkManager.Stop(new Car(6));
		assertEquals(ParkManager.Go(new Car(1)),true);
		assertEquals(ParkManager.Go(new Car(2)),true);
		assertEquals(ParkManager.Go(new Car(3)),true);
		assertEquals(ParkManager.Go(new Car(4)),true);
		assertEquals(ParkManager.Go(new Car(5)),true);
		assertEquals(ParkManager.Go(new Car(6)),true);
		assertEquals(ParkManager.Go(new Car(7)),false);
		assertEquals(ParkManager.Go(new Car(8)),false);
	}
	
	@Test
	public void testStatus(){
		ParkingBoy ParkManager = new ParkingBoy(2,3);
		ParkManager.Status();
	}
}
