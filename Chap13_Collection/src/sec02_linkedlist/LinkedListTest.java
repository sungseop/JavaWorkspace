package sec02_linkedlist;

import java.util.*;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> aList = new LinkedList<>();
		String[] alpha = {"A", "B", "C", "D", "E"};
		
		for(String s : alpha) {
			aList.add(s);
		}

		System.out.println("첫번째의 항목은 " + aList.getFirst());
		System.out.println("마지막 항목은 " + aList.getLast());
	}

}
