package sec02_interface_extends;

// 게임 유닛
class Unit {
	int x;
	int y;
	int currentHP; // 유닛의 체력
}

// 캐릭터가 움직이는 기능을 구현하는 인터페이스
interface Movable {
	public abstract void move(int x, int y);
}

// 캐릭터가 공격하는 기능을 구현하는 인터페이스
interface Attackable {
	public abstract void attack(Unit u);
}

interface Fightable extends Movable, Attackable {
}

class Tank extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
		
		System.out.printf("탱크가 무한궤도를 이용해서 %d, %d 위치로 이동합니다.", x, y);
	}

	@Override
	public void attack(Unit u) {
		
		System.out.println("탱크가 포를 이용해서 유닛을 공격합니다.");
	}
	
}

public class FighterTest {

	public static void main(String[] args) {
		Tank t = new Tank();
		t.move(10, 20);
		t.attack(new Unit());
	}

}
