package sec02_generic_method;


public class GenericMethodTest {

	public static void main(String[] args) {
		Integer[] intArr = {30, 50, 20, 90, 70};
		printArray(intArr);
		
		Character[] chArr = {'J', 'A', 'V', 'A'};
		printArray(chArr);
	}
	
	/*
	 * 여러 가지 타입의 배열의 내용을 출력하는 메소드 구현
	 */
	public static <E> void printArray(E[] arr) {
		for (E element : arr) {
			System.out.println(element);
		}
		System.out.println();
	}

}
