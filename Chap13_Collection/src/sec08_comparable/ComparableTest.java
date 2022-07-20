package sec08_comparable;

import java.util.*;

public class ComparableTest {

	public static void main(String[] args) {
		TreeSet<Person> tset = new TreeSet<>();

		tset.add(new Person("이순신", 33));
		tset.add(new Person("이순신", 35));
		tset.add(new Person("유관순", 19));
		tset.add(new Person("강감찬", 41));
		
		Iterator<Person> it = tset.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.printf("%s : %d\n", p.name, p.age);
		}
	}

}
