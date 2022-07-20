package exercise;

import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<>();

		map.put("김우빈", 188.0);
		map.put("임시완", 166.0);
		map.put("김수현", 177.0);
		map.put("권지용", 168.5);
		map.put("에릭",  177.5);
		map.put("강호동", null);
		
		System.out.println("김수현의 키는 " + map.get("김수현"));
		
		// keyset()을 이용한 값의 검색
		Set<String> keys = map.keySet();
		System.out.println("키의 목록: " + keys);
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.printf("%s의 키는 %5.2f\n", key, map.get(key));
		}
		
		// HashMap의 사이즈
		System.out.println("size는 " + map.size());
		
		// "김수현"이라는 키값이 존재하는가
		System.out.println("'김수현' 키 존재여부: " + map.containsKey("김수현"));
		
		// 값의 존재여부 확인
		System.out.println("177.7 값의 존재여부: " + map.containsValue(177.7));
		
		// HashMap이 비어있는지 확인
		System.out.println("HashMap이 비어 있는가: " + map.isEmpty());
		
		// 객체 제거
		map.remove("강호동");
		keys = map.keySet();
		System.out.println("키의 목록:" + keys);

	}

}
