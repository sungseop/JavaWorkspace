package sec17_getter_setter;

public class Car {
	private int speed;
	private boolean stop;
	
	// getter: ��������� ���� ��ȯ�ϴ� ��� 
	int getSpeed() {
		
		return speed;
	}
	
	// setter: ��������� ���� �����ϴ� ��� 
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






