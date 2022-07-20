package sec14.package_ex1;

//import sec02_field_declare.Car;
//import sec02_field_declare.Tv;
// *로 지정하면 해당 패키지 내의 모든 클래스 사용할 수 있도록 지정함.
import sec02_field_declare.*;

public class Application1 {

	public static void main(String[] args) {
		System.out.println("패키지명: sec14.package_ex1");
		
		// 다른 패키지에 있는 클래스를 사용하고 싶을때 패키지명과 같이 지정해야 함.
		sec02_field_declare.Car c1 = new sec02_field_declare.Car();
		
		System.out.println(c1.company);
		
		// import문이 있을 경우 패키지 경로를 지정하지 않아도 됨.
		Car c2 = new Car();
		
		Tv tv1 = new Tv();
	}

}
