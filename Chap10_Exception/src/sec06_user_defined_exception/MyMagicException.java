package sec06_user_defined_exception;

/*
 * 숫자 8이 입력되면 발생되는 예외를 정의 
 */
public class MyMagicException extends Exception {
	public MyMagicException(String message) {
		// 예외 발생의 메시지로 사용할 내용을 부모생성자를 통해 초기화
		super(message);
	}
}
