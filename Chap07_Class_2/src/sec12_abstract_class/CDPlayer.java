package sec12_abstract_class;

/*
 * 추상클래스를 상속하여 클래스를 정의하면
 * 부모클래스의 추상메소드를 반드시 구현해야 함.
 */
public class CDPlayer extends Player {

	@Override
	void play(int pos) {
		currentPos = pos;
		System.out.println("CD플레이어가 " + pos + "트랙을 재생합니다.");
	}

	@Override
	void stop() {
		
		System.out.println("CD플레이어가 재생을 중지합니다.");
	}

	void nextTrack() {
		if (!pause) {
			currentPos++;
			System.out.println("CD플레이어가 " + currentPos + "트랙을 재생합니다.");
		} else {
			System.out.println("CD플레이어가 재생중이 아닙니다.");
		}
	}
	
	void prevTrack() {
		if (!pause && currentPos>1) {
			currentPos--;
			System.out.println("CD플레이어가 " + currentPos + "트랙을 재생합니다.");
		} else {
			System.out.println("CD플레이어가 재생중이 아닙니다.");
		}
	}
}






