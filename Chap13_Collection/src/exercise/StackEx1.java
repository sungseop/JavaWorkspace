package exercise;

import java.util.*;

/*
 * 입력받은 임의의 정수를 스택을 이용하여 이진수로 변환
 */
public class StackEx1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2진수로 변환할 숫자를 입력해주세요:");
		int num = sc.nextInt();
		int origin = num;
		
		while(num>0) {
			stack.push(num % 2);
			num = num / 2;
		}

		System.out.printf("%d는 이진수로: ", origin);
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		
		System.out.println(" 입니다.");
	}

}
