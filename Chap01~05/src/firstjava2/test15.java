package firstjava2;

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("양의 정수값:");
		int i = in.nextInt();
		int j;
		for(j=1 ; j<=i; j++); {
			j = j * i ;
		
		}
		
		
		System.out.println("1부터 5까지의 곱은 " + (j) + "입니다.");
		
		in.close();
	}

}
