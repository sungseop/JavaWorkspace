package firstjava2;

import java.util.Scanner;

public class test14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?");
		int i = in.nextInt();
		for(int j=0; j<i; j++) {
			System.out.println("*");
		}
		}
	}
