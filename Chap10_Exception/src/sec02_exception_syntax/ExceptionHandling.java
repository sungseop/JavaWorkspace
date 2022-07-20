package sec02_exception_syntax;

public class ExceptionHandling {

	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try { // 문제의 소지가 있는 코드
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
	}

}
