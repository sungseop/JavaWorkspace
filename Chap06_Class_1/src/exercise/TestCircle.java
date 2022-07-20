package exercise;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();

		System.out.println("c1의 반지름은 " + c1.getRadius());
		System.out.println("c1의 면적은 " + c1.getArea());
		
		Circle c2 = new Circle(2.0, "black");
		System.out.println("c2의 반지름은 " + c2.getRadius());
		System.out.println("c2의 면적은 " + c2.getArea());
		System.out.println("c2의 색깔은  " + c2.getColor());
		
		Circle c3 = new Circle(5.0);
		System.out.println(c3.toString());
		System.out.println(c3); // c3을 출력하는 것은  c3.toString()과 같은 의미임.
	}
}
