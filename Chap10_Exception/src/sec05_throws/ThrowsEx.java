package sec05_throws;

public class ThrowsEx {

	public static void main(String[] args) {
		try {
			searchClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void searchClass() throws ClassNotFoundException {
		
		Class c = Class.forName("java.lang.String2");
	}

}
