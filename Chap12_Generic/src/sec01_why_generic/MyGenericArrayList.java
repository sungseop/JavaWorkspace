package sec01_why_generic;

public class MyGenericArrayList<E> {  // E: 타입을 나타내는 변수
	private Object[] elements;	// 모든 타입의 참조변수를 저장하는 저장소
	private int size;			// 저장된 항목의 수, 배열의 인덱스
	
	public MyGenericArrayList() {
		elements = new Object[10]; // 초기에 저장할 저장소 생성
		size = 0;
	}
	
	// 데이터를 저장하는 메소드
	public void add(E e) {	// E e:타입 매개변수로 수정 
		if (size < elements.length) {
			elements[size] = e;	// 매개변수로 전달된 객체 저장
		} else {
			// 배열의 크기를 늘려줌
		}
		++size;
	}
	
	// 특정 위치의 데이터를 읽는 메소드
	public E get(int index) {
		if (index >= size) {
			System.out.println("index 지정이 잘못되었습니다.");
			return null;
		}
		
		return (E)(elements[index]);
	}
	
	// 현재 저장된 항목의 수를 반환 
	public int size() {
		return size;
	}
}

