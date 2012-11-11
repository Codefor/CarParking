package buaa;

public class Park {

	private int num;
	private int used;
	
	public Park(int _num){
		this.num = _num;
		this.used = 0;
	}
	public void getCarnum(){
		int avai = this.num - this.used;
		System.out.println("AVAI:"+avai); 
	}
	
	public void Stop(){
//		when avai <= 0 you can not park
		int avai = this.num - this.used;
		if(avai <= 0){
			System.out.println("NOT AVAILABLE!you can not park!");
		}else{
			System.out.println("another car arrived!");
			this.used ++;
		}
	}
	
	public void Go(){
		//you can always go!
		if(this.used <= 0){
			System.out.println("NO CAR,you can not go!");
		}else{
			System.out.println("another car gone!");
			this.used --;	
		}
	}
	
	public static void main(String[] args){
		Park p = new Park(3);
		p.Stop();
		p.Stop();
		p.Stop();
		p.Stop();
		p.Stop();
		p.Go();
		p.Go();
		p.Go();
		p.Go();
		p.Go();
		p.getCarnum();
	}
}
