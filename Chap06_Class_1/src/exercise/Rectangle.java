package exercise;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;
	
	public Rectangle() {
	}
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	// 사각형의 높이를 반환하는 메소드
	public float getLength() {
		return length;
	}
	
	// 사각형의 높이를 설정하는 메소드
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	// 사각형의 면적을 구하는 메소드
	public double getArea() {
		return (double)(width * length);
	}
	
	// 사각형의 둘레를 구하는 메소드
	public double getPerimeter() {
		return (double)(2*width + 2*length);
	}
	
	public String toString() {
		return "Rectangle[length="+length+", width="+width + "]";
	}
}










