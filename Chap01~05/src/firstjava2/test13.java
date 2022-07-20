package firstjava2;

import java.util.Scanner;

public class test13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수 A:");
		int i = in.nextInt();
		System.out.print("정수 B:");
		int j = in.nextInt();
		if(i>j) {
			int temp = i;
			i=j;
			j=temp;
	}
			
		do {
			System.out.println(i);
			i++;
		}
		while(i<=j);
		}
}