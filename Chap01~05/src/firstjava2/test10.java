package firstjava2;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수 a:");
		int i = in.nextInt();
		System.out.print("정수 b:");
		int j = in.nextInt();
		
		if(i<j) {
			int temp = i;
			i=j;
			j=temp;
		}
		in.close();
		System.out.println("a>=b가 되도록 정렬했습니다");
		System.out.println("변수 a는" + i + "입니다");
		System.out.println("변수 b는" + j + "입니다");
		}
}











