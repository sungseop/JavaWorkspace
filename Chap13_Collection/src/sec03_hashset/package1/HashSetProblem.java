package sec03_hashset.package1;

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
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class HashSetProblem {

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
