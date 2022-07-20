package sec04_multi_catch;

public class MultiCatchException {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			// 2개의 문자열을 숫자로 변환
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println("result="+result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 입력값의 갯수가 부족합니다.");
			System.out.println("[실행방법] java MultiCatchException num1 num2");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없는 데이터입니다.");
		} catch (Exception e) {  // 예외범위가 넓은 부분은 맨 아래로 이동한다.
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요!");
		}

	}

}
