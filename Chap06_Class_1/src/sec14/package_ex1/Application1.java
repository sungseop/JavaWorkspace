package sec14.package_ex1;

//import sec02_field_declare.Car;
//import sec02_field_declare.Tv;
// *�� �����ϸ� �ش� ��Ű�� ���� ��� Ŭ���� ����� �� �ֵ��� ������.
import sec02_field_declare.*;

public class Application1 {

	public static void main(String[] args) {
		System.out.println("��Ű����: sec14.package_ex1");
		
		// �ٸ� ��Ű���� �ִ� Ŭ������ ����ϰ� ������ ��Ű����� ���� �����ؾ� ��.
		sec02_field_declare.Car c1 = new sec02_field_declare.Car();
		
		System.out.println(c1.company);
		
		// import���� ���� ��� ��Ű�� ��θ� �������� �ʾƵ� ��.
		Car c2 = new Car();
		
		Tv tv1 = new Tv();
	}

}
