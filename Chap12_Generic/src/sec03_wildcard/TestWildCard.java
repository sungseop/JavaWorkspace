package sec03_wildcard;

import java.util.*;

public class TestWildCard {

	public static void main(String[] args) {
		List<Object> objList = new ArrayList<Object>();
		objList.add(Integer.valueOf(55));
		objList.add(Integer.valueOf(47));
		objList.add("abc");
		printList(objList);
		
		List<String> strList = new ArrayList<String>();
		strList.add("one");
		strList.add("two");
		printList(strList);
	}

	//public static void printList(List<Object> lst) { //Object타입의 목록만 출력 가능함.
	public static void printList(List<?> lst) {	
		for (Object obj:lst) {
			System.out.println(obj);
		}
	}
}
