package firstjava2;

import java.util.Scanner;

public class test6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수값: ");
		int i = in.nextInt();{
		if( i < 0 ) {
		System.out.println("절대값은 :" + (-i) + "입니다");
		}
		else {
		System.out.println("절대값은 :" + i + "입니다");
		}
		in.close();
		
		

	}

	}
}
