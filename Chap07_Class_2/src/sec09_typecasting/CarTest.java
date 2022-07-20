package sec09_typecasting;

class Car {
	String color;
	
	void drive() {
		System.out.println("?먮룞李④? ?щ┰?덈떎.");
	}
	
	void stop() {
		System.out.println("?먮룞李④? 硫덉땅?덈떎.");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("臾쇱쓣 肉뚮┰?덈떎.");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("?ъ씠?뚯쓣 ?몃┰?덈떎.");
	}
}

public class CarTest {
	public static void main(String[] args) {
		Car car = null;	// 議곗긽 ??낆쓽 李몄“蹂??
		
		FireEngine fe = new FireEngine();
		fe.water();
		
		car = fe;	// ?먯넀媛앹껜 -> 議곗긽??낆쓽 李몄“蹂?섏뿉 ???(Upcasting)
		            // ?먮룞?쇰줈 Car ??낆쑝濡??뺣??섏씠 ?대（?댁쭚. (?뺣????앸왂 媛??
					// car = (Car)fe; ?섏? ?딆븘????
		//car.water(); // ?먯넀??硫붿냼?쒕? ?ъ슜?????놁쓬.
		
		FireEngine fe2 = (FireEngine)car;	// 議곗긽???-> ?먯넀??낆뿉 ???Downcasting)
		                                    // ?뺣????앸왂 遺덇??ν븿.
		fe2.water();
		
		//Car car2 = new Car();
		//FireEngine fe3 = (FireEngine)car2;  // 議곗긽??낆쓽 媛앹껜???먯넀??낆쓽 蹂?섏뿉 ??낇븷???놁쓬.
		
	}
}





