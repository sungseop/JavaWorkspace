package sec03_hashset;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> fruits = new HashSet<>();
		
		// 데이터 추가
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Apple");
		
		for(String str:fruits) {
			System.out.println(str);
		}
		// 전체 데이터의 내용을 하나씩 처리 하는 방법 
		Iterator<String> it = fruits.iterator(); // set에 들어 있는 전체 내용을 가져옴.
		while(it.hasNext()) { // Iterator에 처리할 데이터가 있는지 확인 후 반복
			System.out.println(it.next());
		}
		
		// set에 데이터가 비어 있는지 확인 
		System.out.println("fruits set이 비어있는가: " + fruits.isEmpty());
		
		// 특정 데이터가 있는지 확인 
		System.out.println("fruits에 Orange가 있는가: " + fruits.contains("Orange"));

		// List에 들어 있는 데이터를 SET에 추가 
		List<String> list1 = new ArrayList<>();
		list1.add("Grape");
		list1.add("Mango");
		list1.add("Lemon");
		
		fruits.addAll(list1);
		System.out.println("fruits 의 전체 항목은 " + fruits);
		
		// 특정 항목 삭제
		fruits.remove("Banana");
		System.out.println("fruits 의 전체 항목은 " + fruits);
	}

}
