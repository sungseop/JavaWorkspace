package sec01_equals;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		
		String s3 = "abc";
		String s4 = "abc";
		
		if (s1 == s2) {
			System.out.println("동일한 문자열입니다.");
		} else {
			System.out.println("다른 문자열입니다.");
		}
		
		if (s3 == s4) {
			System.out.println("동일한 문자열입니다.");
		} else {
			System.out.println("다른 문자열입니다.");
		}
		
		System.out.println("equals() 사용");
		if (s1.equals(s2)) {
			System.out.println("동일한 문자열입니다.");
		} else {
			System.out.println("다른 문자열입니다.");
		}

	}

}
