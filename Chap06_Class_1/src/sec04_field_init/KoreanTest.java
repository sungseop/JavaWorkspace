package sec04_field_init;

class Korean {
	String nation = "대한민국";
	String name;
	String birthday;
	
	// 생성자
	public Korean(String name, String birthday) {
		// this - 자신의 객체 참조
		this.name = name;
		this.birthday = birthday;
	}
}

public class KoreanTest {

	public static void main(String[] args) {
		Korean k1 = new Korean("홍길동", "750303");
		System.out.println("국적: " + k1.nation);
		System.out.println("이름: " + k1.name);
		System.out.println("생일: " + k1.birthday);

		Korean k2 = new Korean("유관순", "810405");
		System.out.println("국적: " + k2.nation);
		System.out.println("이름: " + k2.name);
		System.out.println("생일: " + k2.birthday);
	}

}









