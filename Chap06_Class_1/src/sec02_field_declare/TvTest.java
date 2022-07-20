package sec02_field_declare;

public class TvTest {

	public static void main(String[] args) {
		Tv t1 = new Tv();

		t1.power = true;
		t1.channel = 6;
		
		System.out.println("전원 상태:"+t1.power);
		System.out.println("채널 상태:"+t1.channel);
	}

}

