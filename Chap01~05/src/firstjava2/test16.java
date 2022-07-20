package firstjava2;

import java.util.Scanner;

public class test16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("몇 개의 *를 표시할까요?");
		int i = in.nextInt();
		for(int j = 0; j<=i; j++)
			if(j%5==0) {
				System.out.println();
			} else {
				System.out.print("*");
			}
		in.close();

	}

}








































