package sec08_method_overloading;

public class CalcTest {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		System.out.println(c1.add(5, 6));
		
		System.out.println(c1.add(1.2, 2.3));
	}

}

/*
 * 메소드 오버로딩을 사용해서 메소드 선언 방법
 */
class Calculator {
	public int add(int a, int b) {
		
		return a + b;
	}
	
	public double add(double a, double b) {
		
		return a + b;
	}
	
	public float add(float a, float b) {
		
		return a + b;
	}
}