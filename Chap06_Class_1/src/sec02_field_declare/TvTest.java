package sec02_field_declare;

public class TvTest {

	public static void main(String[] args) {
		Tv t1 = new Tv();

		t1.power = true;
		t1.channel = 6;
		
		System.out.println("���� ����:"+t1.power);
		System.out.println("ä�� ����:"+t1.channel);
	}

}

