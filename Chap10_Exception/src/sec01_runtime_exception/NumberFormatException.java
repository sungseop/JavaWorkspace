package sec01_runtime_exception;

public class NumberFormatException {

	public static void main(String[] args) {
		String data1 = "123";	// 문자열
		String data2 = "a123";	// 문자열 
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
	}

}
