package sec09_comparator;

public class Product {
	public String pname;
	public int price;
	
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pname=" + pname + ", price=" + price + "]";
	}

}
