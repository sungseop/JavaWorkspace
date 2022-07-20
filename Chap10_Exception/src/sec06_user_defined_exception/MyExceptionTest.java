package sec06_user_defined_exception;

public class MyExceptionTest {

	public static void main(String[] args) {
		
		try {
			magicNum(7);
			magicNum(8);
		} catch (MyMagicException e) {
			e.printStackTrace();
		}
	}

	public static void magicNum(int number) throws MyMagicException {
		if (number == 8) { // 숫자가 8이면 예외를 발생시킴
			throw (new MyMagicException("8을 입력하였습니다."));
		}
		
		System.out.println("정상처리되었습니다.");
	}
}
