package exercise;

public class Circle {
	private double radius = 1.0; // private은 다른 클래스에서 사용 불가능
	private String color = "red";
	
	// 생성자
	public Circle() {
	}
	
	// 생성자
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// 생성자 
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	// 반지름 값을 반환하는 메소드 - getter
	double getRadius() {
		return radius;
	}
	
	// 색깔을 반환하는 메소드
	String getColor() {
		return color;
	}
	
	// 원의 면적을 구하는 메소드
	double getArea() {
		return radius * radius * Math.PI; // Math.PI = 3.14
	}
	
	
	public String toString() {
		return "Circle[radius=" + radius + ", color=" + color + "]";
	}
	
}






