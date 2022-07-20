package sec17_getter_setter;

public class Car {
	private int speed;
	private boolean stop;
	
	// getter: 멤버변수의 값을 반환하는 기능 
	int getSpeed() {
		
		return speed;
	}
	
	// setter: 멤버변수에 값을 저장하는 기능 
	void setSpeed(int speed) {
		
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	
	boolean isStop() {
		
		return stop;
	}
	
	void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}






