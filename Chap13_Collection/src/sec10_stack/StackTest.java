package sec10_stack;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();

		System.out.println("Empty stack : " + stack);
		
		stack.push(1001);
		stack.push(1002);
		stack.push(1003);
		stack.push(1004);
		
		System.out.println("Non-Empty stack : " + stack);
		// 스택에서 맨 위의 데이터를 꺼냄
		System.out.println("Pop 메소드 수행: " + stack.pop());
		System.out.println("Non-Empty stack : " + stack);
		// 데이터를 꺼내지 않고 값을 확인
		System.out.println("Peek 메소드 수행: " + stack.peek());
		System.out.println("Non-Empty stack : " + stack);
		// 스택이 비어 있는지 확인 
		System.out.println("스택이 비어 있나요? " + stack.isEmpty());
		// 스택에서 데이터 조회: 데이터가 존재하면 위치값 반환
		System.out.println("search() 메소드 : " + stack.search(1002));
	}

}
