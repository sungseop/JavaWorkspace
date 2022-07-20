package sec12_abstract_class;

public class PlayerTest {

	public static void main(String[] args) {
		//Player p = new Player(); // 추상클래스는 객체생성 불가능

		CDPlayer player = new CDPlayer();
		player.play(1);
		player.nextTrack();
		player.pause();
		player.prevTrack();
		player.pause();
		player.prevTrack();
	}

}
