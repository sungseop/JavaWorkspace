package sec06_inputstreamreader;

import java.io.*;

/*
 * 파일에서 바이트 단위로 읽은 데이터를 문자로 변환하여 화면에 출력 
 */
public class InputStreamReaderEx {

	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;  // 바이트 입력->문자 입력
		OutputStreamWriter osw = null;

		try {
			fis = new FileInputStream("input.txt");
			isr = new InputStreamReader(fis);
			osw = new OutputStreamWriter(System.out);
			
			char[] cbuf = new char[512];
			int length = 0;  // 실제 파일에서 읽어들인 길이를 저장
			while((length = isr.read(cbuf)) != -1) { // 파일을 다 읽으면 -1이 반환됨
				osw.write(cbuf, 0, length);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				isr.close();
				osw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
