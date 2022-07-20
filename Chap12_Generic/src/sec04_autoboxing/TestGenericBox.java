package sec04_autoboxing;

public class TestGenericBox {

	public static void main(String[] args) {
		GenericBox<String> box1 = new GenericBox<String>("홍길동");
		String str = box1.getContent(); // Autounboxing: 값을 가져올 때 타입변환이 필요없음
		System.out.println(box1);
		
		// primary type의 데이터를 저장: Autoboxing
		GenericBox<Integer> box2 = new GenericBox<Integer>(123);
		int i = box2.getContent();
		System.out.println(box2);

	}

}
