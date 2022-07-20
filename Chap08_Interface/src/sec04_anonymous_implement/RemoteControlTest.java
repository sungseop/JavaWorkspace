package sec04_anonymous_implement;

import sec01_interface_declare.RemoteControl;

public class RemoteControlTest {

	public static void main(String[] args) {
		// 익명의 구현 객체
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				
				System.out.println("전원을 켭니다.");
			}

			@Override
			public void turnOff() {
				
				System.out.println("전원을 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				if (volume >= RemoteControl.MAX_VOLUME) {
					volume = RemoteControl.MAX_VOLUME;
				} else if (volume <= RemoteControl.MIN_VOLUME) {
					volume = RemoteControl.MIN_VOLUME;
				} 
				
				System.out.println("현재의 볼륨은 " + volume +"입니다.");
			}
		};
		
		rc.turnOn();
		rc.setVolume(7);

	}

}
