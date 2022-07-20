package sec03_system_inout;

import java.io.*;

public class SystemInEx {

	public static void main(String[] args) {
		System.out.println("=== 메뉴 ===");
		System.out.println("1. 예금조회");
		System.out.println("2. 예금입금");
		System.out.println("3. 예금출금");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴를 선택하세요:");

		InputStream is = System.in;  // 표준입력장치를 입력스트림으로 사용
		
		try {
			char input = (char)is.read();
			
			switch(input) {
			case '1':
				System.out.println("예금 조회를 선택하였습니다.");
				break;
			case '2':
				System.out.println("예금 입금을 선택하였습니다.");
				System.out.print("입금할 금액을 한글로 입력해 주세요:");
				byte[] byteData = new byte[20];
				/*
				is.read();
				is.read(); // 메뉴 입력시에 입력했던 Enter Key를 읽어서 제거한다.
				*/
				is.skip(2);
				int readLen = is.read(byteData);
				String amount = new String(byteData, 0, readLen-2);
				System.out.printf("입금 금액: %s\n", amount);
				break;
			case '3':
				System.out.println("예금 출금을 선택하였습니다.");
				break;
			case '4':
				System.out.println("프로그램 종료를 선택하였습니다.");
				break;
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}





