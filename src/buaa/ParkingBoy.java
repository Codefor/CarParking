package buaa;

public class ParkingBoy {
	private Park[] ParkLands;
	private int ParkNum;//num of ParkLands

	public ParkingBoy(int numPark) {
		super();
		ParkNum = numPark;
		ParkLands = new Park[numPark];
		for(int i = 0; i < numPark; i++) {
			ParkLands[i] = new Park(100);
		}
	}
	
	public Boolean Stop(Car car) {
		for (Park parkLand : ParkLands) {
			if(parkLand.getFreeCarNum() > 0)
			{
				return parkLand.Stop(car);				
			}
		}
		return false;
	}
	
	public Boolean GetCar(Car car) {
		for (Park parkLand : ParkLands) {
			if(parkLand.Go(car)) {
				return true;
			}
		}
		return false;
	}
	
	public void Status(){
		for(int i = 0; i < this.ParkNum; i++) {
			System.out.println("ParkLand "+i);
		}
	}
}
