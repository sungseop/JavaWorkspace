package sec12_final_field;

/*
 * final 멤버변수의 초기값 저장 방법
 */
class Person {
	final String nation = "Korean"; // 멤버변수에 명시적 초기화
	final String jumin_no;
	String name;
	
	public Person(String jumin_no, String name) {
		this.jumin_no = jumin_no;  // 생성자를 이용한 초기화
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [nation=" + nation + ", jumin_no=" + jumin_no + ", name=" + name + "]";
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "이순신");

		System.out.println(p1);
		
		p1.jumin_no = "234567-1234567"; // final 멤버 변수는 값을 수정할 수 없음.
		
	}

}
