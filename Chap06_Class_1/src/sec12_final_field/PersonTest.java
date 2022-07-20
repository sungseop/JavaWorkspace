package sec12_final_field;

/*
 * final ��������� �ʱⰪ ���� ���
 */
class Person {
	final String nation = "Korean"; // ��������� ����� �ʱ�ȭ
	final String jumin_no;
	String name;
	
	public Person(String jumin_no, String name) {
		this.jumin_no = jumin_no;  // �����ڸ� �̿��� �ʱ�ȭ
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [nation=" + nation + ", jumin_no=" + jumin_no + ", name=" + name + "]";
	}
}

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "�̼���");

		System.out.println(p1);
		
		p1.jumin_no = "234567-1234567"; // final ��� ������ ���� ������ �� ����.
		
	}

}
