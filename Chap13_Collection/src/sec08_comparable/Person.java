package sec08_comparable;

public class Person implements Comparable<Person> {
	public String name;
	public int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/*
	 * 객체 저장시 값을 비교하기 위한 메소드
	 * Person o: 저장할 값 
	 * 멤버변수 age 값이 더 작으면 -1 반환
	 *           같으면 0 반환
	 *           더 크면 1 반환 
	 */
	@Override
	public int compareTo(Person o) {
		/*
		 * if (age < o.age) { return -1; } else if(age == o.age) { return 0; } else {
		 * return 1; }
		 */
			
		return name.compareTo(o.name);
	}

}
