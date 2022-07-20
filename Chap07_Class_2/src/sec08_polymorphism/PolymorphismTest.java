package sec08_polymorphism;
/*
 * ?대옒?ㅼ쓽 ?ㅽ삎?깆쓣 ?댁슜?섎뒗 ?꾨줈洹몃옩
 */
class Product {
	int price;	// ?쒗뭹 媛寃?
	int bonusPoint;	// 蹂대꼫???ъ씤??
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product {
	Tv() {
		super(10000);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(5000);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(3000);
	}
	
	public String toString() {
		return "Audio";
	}
}

// ?쒗뭹 援щℓ???대옒??
class Buyer {
	int money = 50000;
	int bonusPoint = 0;	// 援щℓ?먯쓽 蹂대꼫???ъ씤??
	
	// ?쒗뭹??援щℓ?섎뒗 湲곕뒫
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("?붿븸??遺議깊븯???쒗뭹??援щℓ?????놁뒿?덈떎.");
			return; // ???댁긽 ?ㅽ뻾?섏? ?딄퀬 硫붿냼??醫낅즺.
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString() + "瑜?援щℓ?섏??듬땲??");
	}
}

public class PolymorphismTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		// Buyer媛 ?щ윭紐낆씪 寃쎌슦
		Buyer[] buyers = new Buyer[3];
		for(int i=0; i<buyers.length; i++) {
			buyers[i] = new Buyer();
		}
		
		Tv tv = new Tv();
		b.buy(tv);

		b.buy(new Computer());
		
		b.buy(new Audio());
		
		System.out.println("?꾩옱 ?⑥? ?덉? " + b.money + "???낅땲??");
		System.out.println("?꾩옱 蹂대꼫???ъ씤?몃뒗 " + b.bonusPoint + "???낅땲??");
		
		// 0踰덉㎏ 援щℓ?먭?  TV瑜?援щℓ
		buyers[0].buy(new Tv());
		// 2踰덉㎏ 援щℓ?먭? Computer瑜?援щℓ
		buyers[2].buy(new Computer());
	}

}
