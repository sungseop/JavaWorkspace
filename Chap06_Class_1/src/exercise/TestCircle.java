package exercise;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();

		System.out.println("c1�� �������� " + c1.getRadius());
		System.out.println("c1�� ������ " + c1.getArea());
		
		Circle c2 = new Circle(2.0, "black");
		System.out.println("c2�� �������� " + c2.getRadius());
		System.out.println("c2�� ������ " + c2.getArea());
		System.out.println("c2�� ������  " + c2.getColor());
		
		Circle c3 = new Circle(5.0);
		System.out.println(c3.toString());
		System.out.println(c3); // c3�� ����ϴ� ����  c3.toString()�� ���� �ǹ���.
	}
}
