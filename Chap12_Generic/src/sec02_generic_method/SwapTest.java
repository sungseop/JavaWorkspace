package sec02_generic_method;

public class SwapTest {

	public static void main(String[] args) {
		swap(1, 2);
		swap("순이", "안녕");
		String s1 = "Hello";
		String s2 = "Java!";
		swap(s1, s2);
		System.out.printf("s1=%s, s2=%s\n", s1, s2);
	}

	// 2개의 인자를 바꿔서 출력하는 메소드
	public static <T> void swap(T first, T second) {
		T temp = first;
		first = second;
		second = temp;
		
		System.out.println(first + " " + second);
	}
}
