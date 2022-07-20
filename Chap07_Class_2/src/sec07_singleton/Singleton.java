package sec07_singleton;

public class Singleton {

	// 자신이 새로운 객체를 생성해서 갖고 있음.
	private static Singleton singleton = new Singleton();
	
	// 외부에서 생성자를 사용할 수 없음.
	private Singleton() {
	}
	
	// 위에서 생성한 singleton 객체의 주소를 리턴 
	static Singleton getInstance() {
		return singleton;
	}
}
