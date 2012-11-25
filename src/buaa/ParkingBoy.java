package buaa;

public class ParkingBoy {
	private Park[] ParkLands;
	private int ParkNum;

	public ParkingBoy(int numPark) {
		super();
		ParkNum = numPark;
		ParkLands = new Park[numPark];
		for(int i = 0; i < numPark; i++) {
			ParkLands[i] = new Park(100);
		}
	}
	
	public Boolean Stop(CarInfo carInfo) {
		for (Park parkLand : ParkLands) {
			if(parkLand.getFreeCarNum() > 0)
			{
				return parkLand.Stop(carInfo);				
			}
		}
		return false;
	}
	
	public Boolean GetCar(CarInfo carInfo) {
		for (Park parkLand : ParkLands) {
			if(parkLand.Go(carInfo)) {
				return true;
			}
		}
		return false;
	}
	

}
