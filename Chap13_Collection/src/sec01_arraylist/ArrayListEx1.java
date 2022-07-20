package sec01_arraylist;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		// 리스트에 데이터 추가
		list1.add(5);
		list1.add(7);
		list1.add(Integer.valueOf(8));
		list1.add(3);
		
		System.out.println("list1=" + list1);
		
		// 특정 위치에 데이터 추가
		list1.add(3, 4);
		System.out.println("list1=" + list1);
		// 특정 위치의 값을 변경
		list1.set(3, 6);
		System.out.println("list1=" + list1);
		
		// list2에 데이터 추가
		list2.add(3);
		list2.add(5);
		list2.add(6);
		list2.add(3);
		System.out.println("list2=" + list2);
		System.out.println("3이 저장된 위치의 인덱스: " + list2.indexOf(3));
		System.out.println("3이 저장된 마지막 위치의 인덱스: " + list2.lastIndexOf(3));
		System.out.println("list2의 항목의 갯수: " + list2.size());
		System.out.println("list2의 sublist는 " + list2.subList(1, 3)); // toindex의 이전값까지 가져옴.
		// 리스트의 내용을 배열로 변환
		Object[] intArr = list2.toArray();
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
		// list1에서 list2의 내용만 남기고 list1에서 나머지는 제거
		list1.retainAll(list2);
		System.out.println("list1.retainAll(list2)=" + list1);
		System.out.println("list1.contains(3)="+list1.contains(3));
		list1.remove(0); // 리스트에서 0번 인덱스 삭제
		System.out.println(list1);
		// 리스트에서 값 가져오기 
		System.out.println("1번 인덱스의 값="+list1.get(1));
		
	}

}
