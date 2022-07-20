package sec03_hashset.package2;

import java.util.*;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public int hashCode() {
		
		// String 타입의 hashCode()를 재활용
		return (name+age).hashCode();
	}



	/*
	 * 두 객체의 내용이 같으면 true
	 *            다르면 false
	 */
	@Override
	public boolean equals(Object obj) {
		// obj가 Person 타입으로 형변환 가능 확인 
		if (obj instanceof Person) {
			Person tmp = (Person) obj;
			boolean result = (name.equals(tmp.name) && age==tmp.age);
			return result;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class HashSetSolution {

	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<>();
		set1.add("abc");
		set1.add("abc");  // 중복 데이터 저장
		System.out.println(set1);
		
		HashSet<Person> set2 = new HashSet<>();
		set2.add(new Person("철수", 25));
		set2.add(new Person("철수", 25));
		System.out.println(set2);
	}

}
