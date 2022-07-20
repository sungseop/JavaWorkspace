package Chapter5;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("몇 월인가요?");
		int i = in.nextInt();
		
		if(3<=i && i<=5) {
			System.out.println("현재 계절은 봄입니다");
		} else if(6<=i && i<=8) {
			System.out.println("현재 계절은 여름입니다");
		} else if(9<=i && i<=11) {
			System.out.println("현재 계절은 가을입니다");
		} else if(12==i || (i<=2)&&(0<i)) {
			System.out.println("현재 계절은 겨울입니다");
		} else {
			System.out.println("입력 오류");
		}
		in.close();
			
		}
		

	}

