package Exercise;

interface Movable {
	public void moveUp();
	public void moveDown();
	public void moveLeft();
	public void moveRight();
}

class MovablePoint implements Movable {
	protected int x;
	protected int y;
	protected int xSpeed;  // x축좌표를 이동하는 속도
	protected int ySpeed;  // y축좌표를 이동하는 속도
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUp() {
		System.out.printf("현재 위치=(%d,%d)\n", x, y);
		System.out.printf("xSpeed=%d, ySpeed=%d\n", xSpeed, ySpeed);
		y -= ySpeed;
		System.out.printf("이동 위치=(%d,%d)\n", x, y);
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight() {
		System.out.printf("현재 위치=(%d,%d)\n", x, y);
		System.out.printf("xSpeed=%d, ySpeed=%d\n", xSpeed, ySpeed);
		x += xSpeed;
		System.out.printf("이동 위치=(%d,%d)\n", x, y);
	}
	
}

public class MovableTest {

	public static void main(String[] args) {
		MovablePoint p1 = new MovablePoint(100, 100, 5, 5);
		p1.moveUp();
		p1.moveRight();
	}

}
