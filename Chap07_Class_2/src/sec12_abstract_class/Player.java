package sec12_abstract_class;

public abstract class Player {
	int currentPos;	// 현재 재생되는 위치
	boolean pause;	// 일시정지 상태 저장 
	
	Player() {
		pause = false;
		currentPos = 0;
	}
	
	// 추상 메소드: play의 구체적인 구현할 수 없음
	abstract void play(int pos);
	abstract void stop();
	
	// 일반 메소드 - 추상메소드 호출 가능
	void play() {
		play(currentPos);
	}
	
	// 일시정기 기능 구현
	void pause() {
		if (pause) { // 현재 일시정지 상태임
			pause = false;
			play(currentPos);
		} else {
			pause = true;
			stop();
		}
	}
}
