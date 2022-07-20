package sec04_iterator;

import java.util.*;

public class ListIteratorEx1 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("이순신");
		names.add("장영실");
		names.add("장보고");
		names.add("유관순");
		names.add("홍길동");
		
		ListIterator<String> it = names.listIterator();

		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		
		while(it.hasPrevious()) {
			System.out.print(it.previous() + " ");
		}
	}

}
