package buaa;

import java.util.ArrayList;
import java.util.HashMap;

public class Park {

	private int num;
	private int used;
	private ArrayList<Integer> Cars;//parked carIds
	private HashMap<Integer, Integer> parkMap;//carId 2 parkId
	private ArrayList<Integer> EmptyList;//the empty parkIds
	
	public Park(int num){
		this.num = num;
		this.used = 0;
		Cars = new ArrayList<Integer>();
		parkMap = new HashMap<>(num);
		EmptyList = new ArrayList<Integer>();
		for(int i = 0; i < num; i++) {
			EmptyList.add(i);
		}
	}

	public int getFreeCarNum(){
		return this.num - this.used;
	}
	
	public boolean Stop(Car car){
		if(this.getFreeCarNum() <= 0){
			return false;
		}else{
			int id = car.getId();
			if( this.parkMap.containsKey(id)){
				return false;//the car is already in the parkland
			}else{
				//TODO need sync
				Cars.add(id);
				parkMap.put(id, EmptyList.remove(0));				
				
				this.used ++;
				return true;
			}			
		}
	}
	
	public boolean Go(Car car){
		if(this.used <= 0){
			return false;
		}else{
			int id = car.getId();
			if (this.parkMap.containsKey(id)){
				//TODO need sync
				int parkId = parkMap.get(id);				
				parkMap.remove(id);
				EmptyList.add(parkId);
				this.used --;			
				return true;
			}else{
				return false;
			}
			
		}
	}	
}
