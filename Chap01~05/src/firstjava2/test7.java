package firstjava2;

import java.util.Scanner;

public class test7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("변수 A:");
		int i = in.nextInt();
		System.out.print("변수 B:");
		int j = in.nextInt();
		if(i%j == 0) {
		System.out.println(j + "는 " + i + "의 약수입니다.");
		}
		else {
			System.out.println(j + "는" + i + "의 약수가 아닙니다");
		}
		in.close();
		}
		
		
		
		
				
		
		

	}

