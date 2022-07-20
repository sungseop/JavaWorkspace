package exercise;

import java.util.ArrayList;

class Student {
	private int stud_no;
	private String name;
	private int age;
	
	public Student(int stud_no, String name, int age) {
		this.stud_no = stud_no;
		this.name = name;
		this.age = age;
	}

	public int getStud_no() {
		return stud_no;
	}

	public void setStud_no(int stud_no) {
		this.stud_no = stud_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "번호:"+stud_no+"\n이름:"+name+"\n나이:"+age+"\n";
	}
}

public class ArrayListTest {


	public static void main(String[] args) {
		ArrayList<Student> studList = new ArrayList<>();
		//Student s1 = new Student(101, "홍길동", 25);
		//studList.add(s1);
		
		studList.add(new Student(101, "홍길동", 25));
		studList.add(new Student(102, "이순신", 33));
		studList.add(new Student(103, "장영실", 29));
		
		for(int i=0; i<studList.size(); i++) {
			System.out.println(studList.get(i));
		}
	}
}
