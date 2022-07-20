package firstjava2;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수값:");
		int i = in.nextInt();
		System.out.println("마지막 자릿수를 제외한 값은" + (i/10) + "입니다");
		System.out.println("마지막 자릿수는"+ (i%10) + "입니다");
		in.close();
		

	}

}
