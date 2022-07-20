package sec08_polymorphism;

class Shape {
	void draw() {
		System.out.println("도형을 그립니다.");
	}
}

class Rectangle extends Shape {
	double width = 1.0;
	double height = 1.0;
	
	// 사각형의 면적을 구하는 메소드
	double rectArea() {
		return width * height;
	}
	
	void draw() {
		System.out.println("사각형을 그립니다.");
	}
}

class Circle extends Shape {
	double radius = 1.0;
	
	// 원의 면적을 구하는 메소드
	double circleArea() {
		return 3.14 * radius * radius;
	}
	
	void draw() {
		System.out.println("원을 그립니다.");
	}
}

class Triangle extends Shape {
	double length = 1.0;
	double height = 1.0;
	
	double triangleArea() {
		return length * height / 2.0;
	}
	
	void draw() {
		System.out.println("삼각형을 그립니다.");
	}
}

public class ShapteTest {

	public static void main(String[] args) {
		// 자신의 참조변수와 같은 타입의 객체를 저장함. 
		Rectangle r1 = new Rectangle();
		r1.draw();
		System.out.println("사각형의 면적은  " + r1.rectArea());

		// 다형성 테스트
		// 조상 타입의 참조변수에 자손 객체를 생성하여 저장함.
		Shape s = new Rectangle();
		s.draw(); // 자손의 draw() 메소드 실행 
		//s.rectArea();  // 조상 클래스에는  rectArea()가 없으므로 호출 불가능
		
		s = new Triangle();
		s.draw();
		s.triangleArea();
	}

}
