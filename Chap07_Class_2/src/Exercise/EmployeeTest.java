package Exercise;

class Employee {
	public static long baseSalary = 10000;
	
	public long getSalary() {
		return baseSalary;
	}
}

class Manager extends Employee {
	public long getSalary() {
		return baseSalary + 20000;
	}
}

class Clerk extends Employee {
	public long getSalary() {
		return baseSalary + 10000;
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Manager manager = new Manager();
		System.out.println("manager의 급여는 " + manager.getSalary() +"원 입니다.");
		
		Clerk clerk = new Clerk();
		System.out.println("점원의 급여는 " + clerk.getSalary() + "원 입니다.");
	}
}








