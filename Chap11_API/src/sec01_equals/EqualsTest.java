package sec01_equals;

class Person {
	String name; // 이름
	long   id;	 // 주민번호
	
	public Person(String name, long id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Person) {
			Person p = (Person) obj;
			return (this.name==p.name && this.id==p.id);
		} else {
			return false;
		}
	}

}

public class EqualsTest {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 8012343334444L);
		Person p2 = new Person("홍길동", 8012343334444L);
		
		if (p1 == p2) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		
		if (p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
	}

}
