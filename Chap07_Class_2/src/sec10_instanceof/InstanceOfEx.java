package sec10_instanceof;

class Parent {
	
}

class Child extends Parent {
	
}

public class InstanceOfEx {

	public static void main(String[] args) {
		Parent p1 = new Child();	// Upcasting
		System.out.println("Child ??낆쓽 媛앹껜瑜?遺紐?李몄“蹂?섏뿉 ???);
		method2(p1);
		method1(p1);
		
		
		System.out.println("遺紐???낆쓽 媛앹껜瑜?遺紐⑦??낆쓽 李몄“蹂?섏뿉 ???);
		Parent p2 = new Parent();
		method2(p2);
		method1(p2);
		
	}

	// instanceof瑜??ъ슜?섏? ?딆? ??
	public static void method1(Parent parent) {
		Child child = (Child)parent; // Downcasting
		System.out.println("method1: child ???蹂???깃났.");
	}
	
	// instanceof ?곗궛?먮? ?ъ슜????
	public static void method2(Parent parent) {
		if (parent instanceof Child) { // parent蹂?섎? Child??낆쑝濡?蹂?섍??ν븳媛
			Child child = (Child)parent;
			System.out.println("method2: child ???蹂???깃났.");
		} else {
			System.out.println("method2: child ???蹂?섑븷 ???놁쓬.");
		}
	}
	
}
