package Exercise;

public class TestCylinder {

	public static void main(String[] args) {
		Cylinder cyl1 = new Cylinder();

		System.out.println("cyl1의 정보는 ");
		System.out.println("cyl1의 반지름은 " + cyl1.getRadius());
		System.out.println("cyl1의 높이는 " + cyl1.getHeight());
		System.out.println("cyl1의 baseArea는 " + cyl1.getArea());
		System.out.println("cyl1의 부피는 " + cyl1.getVolume());

		// 높이가 10.0인 Cylinder 생성
		Cylinder cyl2 = new Cylinder(10.0);
		System.out.println("cyl2의 정보는 ");
		System.out.println("cyl2의 반지름은 " + cyl2.getRadius());
		System.out.println("cyl2의 높이는 " + cyl2.getHeight());
		System.out.println("cyl2의 baseArea는 " + cyl2.getArea());
		System.out.println("cyl2의 부피는 " + cyl2.getVolume());

		// 반지름:2.0, 높이: 10.0, color: 기본값의 Cylinder 생성

		Cylinder cyl3 = new Cylinder(2.0, 10.0);
		System.out.println("cyl3의 정보는 ");
		System.out.println("cyl3의 반지름은 " + cyl3.getRadius());
		System.out.println("cyl3의 높이는 " + cyl3.getHeight());
		System.out.println("cyl3의 baseArea는 " + cyl3.getArea());
		System.out.println("cyl3의 부피는 " + cyl3.getVolume());

		System.out.println(cyl3);
	}

}
