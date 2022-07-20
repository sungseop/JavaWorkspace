package sec01_interface_declare;

public class RemoteControlTest {

	public static void main(String[] args) {
		RemoteControl rc;  // 인터페이스 타입으로 선언
		
		rc = new Tv();
		rc.turnOn();
		rc.setVolume(5);

		rc.setMute(true);  // TV클래스 수정없이 바로 사용가능함.
		
		RemoteControl.changeBattery();
	}

}
