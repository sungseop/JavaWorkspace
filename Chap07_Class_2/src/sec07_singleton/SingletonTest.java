package sec07_singleton;

public class SingletonTest {

	public static void main(String[] args) {
		//Singleton s1 = new Singleton();  // 생성자 사용 불가능

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("obj1과 obj2는 같은 주소를 참조합니다.");
		} else {
			System.out.println("obj1과 obj2는 다른 주소를 참조합니다.");
		}
	}

}
