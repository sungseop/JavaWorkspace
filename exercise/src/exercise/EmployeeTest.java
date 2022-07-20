package exercise;

public class EmployeeTest {

	public static void main(String[] args) {
		Address addr1 = new Address("서울", "강남구", "대한민국");
		Employee e1 = new Employee(111, "유관순", addr1);
		System.out.println(e1);
	}

}
