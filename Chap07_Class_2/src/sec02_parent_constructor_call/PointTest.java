package sec02_parent_constructor_call;

// 2차원 좌표를 표현하는 클래스
class Point {
	int x;
	int y;
	
	// 생성자
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 좌표값 출력하기 
	String getLocation() {
		return "x:" + x + ", y:" + y;
	}
}

// 3차원 좌표를 표현하는 클래스
class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		/*
		this.x = x;
		this.y = y;
		*/
		// 위의 문장 대신에 부모 생성자를 호출한다.
		super(x, y);  // 부모생성자  Point(int x, int y)를 찾아감.
		this.z = z;
	}
	
	// 3차원 좌표를 알아내는 메소드
	String getLocation() {
		return "x:" + x + ", y:" + y + ", z:" + z;
	}
}

public class PointTest {

	public static void main(String[] args) {
		Point3D p1 = new Point3D(10, 20, 25);

		System.out.println(p1.getLocation());
	}

}
