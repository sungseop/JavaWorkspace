package firstjava2;

import java.util.Scanner;

public class test17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("2 이상의 정수값");
		int i = in.nextInt();
		int j;
		for(j=2 ; j<i; j++); {
			if((i % j == 0) || (i%j > 1)) {
				System.out.println("소수가 아닙니다.");
			}
			else {
				System.out.println("소수입니다.");
			}

				}
		in.close();		}

}



