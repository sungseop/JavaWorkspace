package sec06_method_return;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int sum = cal.add(5, 4); // 메소드를 호출하면 메소드에서 계산한 결과값으로 치환

		System.out.println("sum(5,4)="+sum);
		
		// 두수의 뺄셈을 수행하기 위해 subtract() 호출
		int a = 10;
		int b = 7;
		System.out.println(cal.subtract(a, b)); // 변수를 인자(argument)로 입력 가능
		
		// 반환값이 없는 메소드 호출
		cal.multiply(a, b);
		
		// 곱한 결과를 출력 
		cal.displayResult();
	}

}
