package sec04_field_init;

class Korean {
	String nation = "���ѹα�";
	String name;
	String birthday;
	
	// ������
	public Korean(String name, String birthday) {
		// this - �ڽ��� ��ü ����
		this.name = name;
		this.birthday = birthday;
	}
}

public class KoreanTest {

	public static void main(String[] args) {
		Korean k1 = new Korean("ȫ�浿", "750303");
		System.out.println("����: " + k1.nation);
		System.out.println("�̸�: " + k1.name);
		System.out.println("����: " + k1.birthday);

		Korean k2 = new Korean("������", "810405");
		System.out.println("����: " + k2.nation);
		System.out.println("�̸�: " + k2.name);
		System.out.println("����: " + k2.birthday);
	}

}









