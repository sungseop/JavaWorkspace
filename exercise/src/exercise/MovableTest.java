package exercise;

interface Movable {
	public void moveUp();		// y축으로 -방향
	public void moveDown(); 	// y축으로 +방향
	public void moveLeft();		// x축으로 -방향
	public void moveRight();	// x축으로 +방향
}

class MovablePoint implements Movable {
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	@Override
	public void moveUp() {
		System.out.println(toString());
		y -= ySpeed;
		System.out.printf("이동위치=(%d,%d)\n", x, y);
	}

	@Override
	public void moveDown() {
		System.out.println(toString());
		y += ySpeed;
		System.out.printf("이동위치=(%d,%d)\n", x, y);
	}

	@Override
	public void moveLeft() {
		System.out.println(toString());
		x -= xSpeed;
		System.out.printf("이동위치=(%d,%d)\n", x, y);
	}

	@Override
	public void moveRight() {
		System.out.println(toString());
		x += xSpeed;
		System.out.printf("이동위치=(%d,%d)\n", x, y);
	}
	
	public String toString() {
		return "현재위치=("+x+","+y+") xSpeed="+xSpeed+" ySpeed="+ySpeed;
	}
}


class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	
	public String toString() {
		return "원점의 현재위치=("+center.x+","+center.y+") xSpeed="+center.xSpeed+" ySpeed="+center.ySpeed;
	}

	@Override
	public void moveUp() {
		System.out.println(toString());
		center.y -= center.ySpeed;
		System.out.printf("원의 이동위치=(%d,%d)\n", center.x, center.y);
	}

	@Override
	public void moveDown() {
		System.out.println(toString());
		center.y += center.ySpeed;
		System.out.printf("원의 이동위치=(%d,%d)\n", center.x, center.y);
	}

	@Override
	public void moveLeft() {
		System.out.println(toString());
		center.x -= center.xSpeed;
		System.out.printf("원의 이동위치=(%d,%d)\n", center.x, center.y);
	}

	@Override
	public void moveRight() {
		System.out.println(toString());
		center.x += center.xSpeed;
		System.out.printf("원의 이동위치=(%d,%d)\n", center.x, center.y);
	}
}

public class MovableTest {

	public static void main(String[] args) {
		Movable p1 = new MovablePoint(10, 25, 3, 3);
		p1.moveRight();
		p1.moveUp();
		
		Movable c1 = new MovableCircle(10, 10, 5, 5, 100);
		c1.moveDown();
		c1.moveLeft();
	}
}
