package firstjava2;

import java.util.Scanner;

public class test9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수 a:");
		int i = in.nextInt();
		System.out.print("정수 b:");
		int j = in.nextInt();
		String x = (i-j > 10 || i-j < (-10)) ? "두 값의 차이는 10 이상입니다.":"두 값의 차이는 9 이하입니다.";
		System.out.println(x);
		in.close();
		

	}

}
