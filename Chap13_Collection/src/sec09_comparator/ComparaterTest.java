package sec09_comparator;

import java.util.*;

public class ComparaterTest {

	public static void main(String[] args) {
		TreeSet<Product> pSet = new TreeSet<Product>(new DescendingComparator());

		pSet.add(new Product("TV", 10000));
		pSet.add(new Product("냉장고", 9000));
		pSet.add(new Product("세탁기", 8000));
		pSet.add(new Product("오디오", 12000));
		
		for(Product p : pSet) {
			System.out.println(p);
		}
	}

}
