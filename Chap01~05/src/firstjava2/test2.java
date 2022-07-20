package firstjava2;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수값:");
		int i = in.nextInt();
		System.out.println("100을 더한 값은" + (i+100) + "입니다.");
		System.out.println("100을 뺀 값은" + (i-100) + "입니다");
		in.close();
	
		

	}

}
