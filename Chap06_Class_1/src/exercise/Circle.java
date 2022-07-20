package exercise;

public class Circle {
	private double radius = 1.0; // private�� �ٸ� Ŭ�������� ��� �Ұ���
	private String color = "red";
	
	// ������
	public Circle() {
	}
	
	// ������
	public Circle(double radius) {
		this.radius = radius;
	}
	
	// ������ 
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	// ������ ���� ��ȯ�ϴ� �޼ҵ� - getter
	double getRadius() {
		return radius;
	}
	
	// ������ ��ȯ�ϴ� �޼ҵ�
	String getColor() {
		return color;
	}
	
	// ���� ������ ���ϴ� �޼ҵ�
	double getArea() {
		return radius * radius * Math.PI; // Math.PI = 3.14
	}
	
	
	public String toString() {
		return "Circle[radius=" + radius + ", color=" + color + "]";
	}
	
}






