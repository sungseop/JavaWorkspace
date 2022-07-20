package sec09_comparator;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Product> {

	/*
	 * 역순 정렬 기능;
	 * o1이 작으면 1 반환
	 * o1, o2가 같으면 0 반환
	 * o1이 크면 -1 반환
	 */
	@Override
	public int compare(Product o1, Product o2) {
		if (o1.price < o2.price) {
			return 1;
		} else if (o1.price == o2.price) {
			return 0;
		} else {
			return -1;
		}
	}

}
