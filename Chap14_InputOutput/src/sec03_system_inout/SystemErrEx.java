package sec03_system_inout;

import java.io.*;

public class SystemErrEx {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		PrintStream ps = null;
		
		System.out.println("표준 Out: Hello World!");
		System.err.println("표준 Err: Hello World!");
		
		try {
			fos = new FileOutputStream("program.out");
			ps = new PrintStream(fos);
			System.setOut(ps); // 표준 출력을 변경하는 메소드
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("Test 표준 출력");
		System.err.println("Test 표준 Err");
	}

}
