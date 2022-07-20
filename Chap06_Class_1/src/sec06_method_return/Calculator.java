package sec06_method_return;

public class Calculator {
	int mul_result;	// 곱셈결과를 저장하는 멤버변수
	
	// 정수 덧셈을 수행하는 메소드
	// 반환타입: int
	int add(int a, int b) {
		int result = 0;
		
		result = a + b;
		
		return result;
	}
	
	// 정수 뺄셈을 수행하는 메소드: 메소드명->subtract
	// 반환 타입: int
	// 입력 파라메터: a, b
	int subtract(int a, int b) {
		int result = a - b;
		
		return result;
	}
	
	// 반환값이 없는 메소드
	// 곱셈한 결과를 출력 수행
	void multiply(int a, int b) {
		mul_result = a * b;
	}
	
	// 멤버변수 mulResult 의 값을 출력
	void displayResult() {
		System.out.println(mul_result);
	}
}







