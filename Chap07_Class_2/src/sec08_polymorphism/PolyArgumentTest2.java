package sec08_polymorphism;

class Product2 {
	int price;			// ?쒗뭹 媛寃?
	int bonusPoint;		// 蹂대꼫???ъ씤??

	Product2(int price) {
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}

	Product2() {} // 湲곕낯 ?앹꽦??
}
 
class Tv4 extends Product2 {
	Tv4() {
		super(100);	
	}

	public String toString() { return "Tv"; }
}

class Computer2 extends Product2 {
	Computer2() { super(200); }

	public String toString() { return "Computer"; }
}

class Audio2 extends Product2 {
	Audio2() { super(50); }

	public String toString() { return "Audio"; }
}

class Buyer2 {			// 臾쇨굔???щ뒗 ?щ엺
	int money = 1000;	// ?뚯쑀??湲덉븸
	int bonusPoint = 0;	// 怨좉컼??蹂대꼫???ъ씤??
	Product2[] item = new Product2[10];	// 援ъ엯???쒗뭹????ν븯湲??꾪븳 諛곗뿴
	int i =0;			// Product諛곗뿴???ъ슜???몃뜳??

	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("?붿븸??遺議깊빀?덈떎.");
			return;
		}

		money -= p.price;	         
		bonusPoint += p.bonusPoint;	
		item[i++] = p;		        // Product[]??item(Tv, Computer, Audio)????ν븳??
		System.out.println(p + "瑜?援щℓ?섏??듬땲??");
	}

	/*
	 * 援щℓ??臾쇳뭹???뺣낫瑜??붿빟?댁꽌 蹂댁뿬二쇰뒗 硫붿냼??
	 */
	void summary() {		    
		int sum = 0;		 	// 援щℓ??臾쇳뭹???⑷퀎
		String itemList =""; 	// 援ъ엯??臾쇳뤌 紐⑸줉

		// 占쌥븝옙占쏙옙占쏙옙 占싱울옙占쌔쇽옙 占쏙옙占쏙옙占쏙옙 占쏙옙품占쏙옙 占쏙옙 占쏙옙占쌥곤옙 占쏙옙占쏙옙占?占쏙옙占쏙옙占?
		for(int i=0; i<item.length;i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("援щℓ??臾쇳뭹??珥??⑷퀎??" + sum + "???낅땲??");
		System.out.println("援ъ엯???쒗뭹? " + itemList + "?낅땲??");
	}
}

class PolyArgumentTest2 {
	public static void main(String args[]) {
		Buyer2 b = new Buyer2();

		b.buy(new Tv4());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}
}
