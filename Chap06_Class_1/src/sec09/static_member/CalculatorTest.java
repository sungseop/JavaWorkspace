package sec09.static_member;

class Calculator {
	static double pi = 3.14159;
}

public class CalculatorTest {

	public static void main(String[] args) {
		// 반지름이 10.0인 원의 면적구하기 
		double area = 10.0 * 10.0 * Calculator.pi;
		System.out.println("반지름이 10.0인 원의 면적은 " + area);

	}

}
