package sec01_runtime_exception;

public class NullPointerException {

	public static void main(String[] args) {
		String data = null;	// 저장소가 할당되어 있지 않음.
		
		// 해결 방법
		//data = "string";
		// 또는
		//data = new String("홍길동");
		System.out.println(data.toString());
	}

}
