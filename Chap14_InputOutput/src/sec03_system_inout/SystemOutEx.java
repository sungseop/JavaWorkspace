package sec03_system_inout;

import java.io.*;

public class SystemOutEx {

	public static void main(String[] args) throws IOException {
		OutputStream os = System.out;

		// 영문 소문자
		for (byte c=97; c<123; c++) {
			os.write(c);
		}
		os.write(10);
		
		// 숫자 출력 
		for (byte c=48; c<58; c++) {
			os.write(c);
		}
		os.write(10);
		
		// 한글을 표준출력으로 보내기
		String hangul = "가나다라마바사";
		byte[] hanBytes = hangul.getBytes();	// 한글을 byte배열에 저장 
		os.write(hanBytes);
		
		os.flush();
		os.close();
	}

}
