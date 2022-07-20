package firstjava2;

import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수값: ");
		int i = in.nextInt();
		if(i<0) {
			System.out.println("양수가 아닌 값을 입력했네요");
		}
		else if(i%3 == 0) {
			System.out.println("이 값은 3으로 나누어집니다");
		}
		else {
			System.out.println("이 값을 3으로 나눈 나머지는 " + (i%3) + "입니다");
			}
		in.close();
	}
}

	