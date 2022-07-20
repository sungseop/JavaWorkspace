package sec02_parent_constructor_call;

// 2���� ��ǥ�� ǥ���ϴ� Ŭ����
class Point {
	int x;
	int y;
	
	// ������
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// ��ǥ�� ����ϱ� 
	String getLocation() {
		return "x:" + x + ", y:" + y;
	}
}

// 3���� ��ǥ�� ǥ���ϴ� Ŭ����
class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		/*
		this.x = x;
		this.y = y;
		*/
		// ���� ���� ��ſ� �θ� �����ڸ� ȣ���Ѵ�.
		super(x, y);  // �θ������  Point(int x, int y)�� ã�ư�.
		this.z = z;
	}
	
	// 3���� ��ǥ�� �˾Ƴ��� �޼ҵ�
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
