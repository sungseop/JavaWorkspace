package sec01_interface_declare;

public interface RemoteControl {
	// 상수
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;  // public static final이 생략된 형태
	
	// 추상 메소드
	void turnOn();	// 전원을 켜는 기능
	void turnOff();	// 전원을 끄는 기능
	void setVolume(int volume);
	
	// 디폴트 메소드
	// 무음 처리 기능
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리를 합니다.");
		} else {
			System.out.println("무음을 해지합니다.");
		}
	}
	
	//static 메소드 추가
	static void changeBattery() {
		System.out.println("리모콘의 건전지를 교환합니다.");
	}
}






