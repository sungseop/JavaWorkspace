package firstjava2;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("x 값:");
		double x = in.nextDouble();
		System.out.print("y 값:");
		double y = in.nextDouble();
		System.out.println("합계는" + (x+y) + "입니다");
		System.out.println("평균은" + ((x+y)/2) + "입니다");
		in.close();

	}

}
