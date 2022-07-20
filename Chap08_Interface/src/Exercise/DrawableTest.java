package Exercise;

interface Drawable {
	public static final int RED = 1;
	int GREEN = 2;	// public static final이 생략됨
	int BLUE = 3;
	int BLACK = 4;
	int WHITE = 5;
	
	public void draw(int color);
}

class Circle implements Drawable {
	private int x;
	private int y;
	private int color;
	private double radius;
	public String[] colorName = {"", "빨강", "초록", "파랑", "검정", "흰색"};
	
	public Circle(int x, int y, double radius, int color) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public void draw(int color) {
		System.out.printf("(%d, %d) 위치에 반지름 %f, 원의 색깔이 %s인 원을 그립니다.\n", 
				x, y, radius, colorName[this.color]);
		
	}
}

class Rectangle implements Drawable {
	private int x1, y1;
	private int x2, y2;
	private int color;
	public String[] colorName = {"", "빨강", "초록", "파랑", "검정", "흰색"};
	
	public Rectangle(int x1, int y1, int x2, int y2, int color) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.color = color;
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	@Override
	public void draw(int color) {
		
		System.out.printf("왼쪽 위의 좌표가 (%d,%d), 오른쪽 아래의 좌표가 (%d,%d)",
				x1, y1, x2, y2);
		System.out.printf("사각형의 색깔이 %s인 사각형을 그립니다.\n", colorName[this.color]);
	}
}


public class DrawableTest {

	public static void main(String[] args) {
		Drawable[] drawables = new Drawable[] {
			new Circle(10, 20, 50, 1),
			new Circle(15, 34, 60, 2),
			new Rectangle(100, 120, 300, 300, 3)
		};
		
		for(Drawable d :drawables) {
			d.draw(2);
		}

	}

}
