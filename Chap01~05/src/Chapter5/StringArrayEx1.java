package Chapter5;

public class StringArrayEx1 {

	public static void main(String[] args) {
		String str1 = "Hello"; // 참조형 변수. 변수 선언하면서 초기화
		String str2 = new String("Hello"); // 문자열 저장 공간을 확보
		
		if(str1 == str2) {
			System.out.println("주소값이 같습니다.");
		} else {
			System.out.println("주소값이 다릅니다.");
		}
		
		// 문자열 변수의 내용이 같은지 알아보려면 equals() 사용
		if(str1.equals(str2)) {
			System.out.println("값이 같습니다.");
		} else {
			System.out.println("값이 다릅니다.");
		}
		
		// 문자열 배열의 초기화
		String[] name = new String[3];
		name[0] = "Hong";
		name[1] = new String("kim");
		name[2] = "Park";
		
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}

	}

}
