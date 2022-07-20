package sec03_wildcard;

public class MyMath {

	public static void main(String[] args) {
		System.out.println(add(53, 62));
		System.out.println(add(5.3f, 6.2f));
		System.out.println(add("Java", "Programming"));
	}

	public static <T extends Number> double add(T first, T second) {
		
		return first.doubleValue() + second.doubleValue();
	}
}
