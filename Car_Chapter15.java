package kadai_015;
//クラス作成
public class Car_Chapter15 {
	
	
	//フィールド
	private int gear = 1;
	private int speed = 10;

	//初期化
	public Car_Chapter15 (int gear,int speed) {
		this.gear = gear;
		this.speed = speed;
		
	}
	
	
	
	//変数のメソッド
	public void gearChange(final int afterGear){
		 

		if(afterGear==2) {speed = 20;}
		if(afterGear==3) {speed = 30;}
		if(afterGear==4) {speed = 40;}
		if(afterGear==5) {speed = 50;}
		
		System.out.println("ギア" + gear+"から" + afterGear + "に切り替えました");
	    
	}
	public void run() {
		System.out.println("速度は時速"+ speed + "kmです");
		
	}
	}


  