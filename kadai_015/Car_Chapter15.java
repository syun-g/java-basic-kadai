package kadai_015;

public class Car_Chapter15 {
 
	//フィールド
	private int gear = 1;
	private int speed = 10;
		

	public void gearChange(int afterGear){
		

    //gearの値で速度変換
		
		gear = afterGear;
		
		//もしafgearが１ならスピードは10
		
		if(afterGear == 1) {speed = 10;
		}
		
		//違うなら..
		
		else if(afterGear == 2) {speed = 20;
		}
		
		else if(afterGear == 3) {speed = 30;
		}
		
		else if(afterGear == 4) {speed = 40;
		}
		
		else if(afterGear == 5) {speed = 50;
		}
		//1-5意外のギア
		else {speed = 10;
		}
      
		System.out.println("ギア" + 1 + "から" + afterGear + "に切り替えました");
	}
	    
	public void run() {	
		
		System.out.println("速度は時速" + speed + "kmです");
		}
}