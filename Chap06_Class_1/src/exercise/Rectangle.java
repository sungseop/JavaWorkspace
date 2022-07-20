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
	
	// �簢���� ���̸� ��ȯ�ϴ� �޼ҵ�
	public float getLength() {
		return length;
	}
	
	// �簢���� ���̸� �����ϴ� �޼ҵ�
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	// �簢���� ������ ���ϴ� �޼ҵ�
	public double getArea() {
		return (double)(width * length);
	}
	
	// �簢���� �ѷ��� ���ϴ� �޼ҵ�
	public double getPerimeter() {
		return (double)(2*width + 2*length);
	}
	
	public String toString() {
		return "Rectangle[length="+length+", width="+width + "]";
	}
}










