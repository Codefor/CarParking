package buaa;

import java.util.ArrayList;
import java.util.HashMap;

public class Park {

	private int num;
	private int used;
	private ArrayList<CarInfo> Cars;
	private HashMap<CarInfo, Integer> parkMap;
	private ArrayList<Integer> EmptyList;
	
	public Park(int _num){
		this.num = _num;
		this.used = 0;
		Cars = new ArrayList<CarInfo>();
		parkMap = new HashMap<>(_num);
		EmptyList = new ArrayList<Integer>();
		for(int i = 0; i < _num; i++) {
			EmptyList.add(i);
		}
	}

	public int getFreeCarNum(){
		int avai = this.num - this.used;
		System.out.println("AVAI:"+avai);
		return avai;
	}
	
	public boolean Stop(CarInfo carInfo){
//		when avai <= 0 you can not park
		int avai = this.num - this.used;
		if(avai <= 0){
			System.out.println("NOT AVAILABLE!you can not park!");
			return false;
		}else{
			Cars.add(carInfo);
			parkMap.put(carInfo, EmptyList.get(0));
			EmptyList.remove(0);
			
			System.out.println("another car arrived!");
			this.used ++;
			return true;
		}
	}
	
	public boolean Go(CarInfo carInfo){
		//you can always go!
		if(this.used <= 0){
			System.out.println("NO CAR,you can not go!");
			return false;
		}else{
			System.out.println("another car gone!");
			int position = parkMap.get(carInfo);
			EmptyList.add(position);
			parkMap.remove(carInfo);
			this.used --;			
			return true;
		}
	}
	
	
}
