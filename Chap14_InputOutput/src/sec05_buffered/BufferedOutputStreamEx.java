package sec05_buffered;

import java.io.*;

/*
 * 성능향상 보조 스트림: BufferedOutputStream
 */
public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fos = new FileOutputStream("test.txt");
			bos = new BufferedOutputStream(fos);
			
			for(int i='1'; i<='9'; i++) {
				bos.write(i);
			}
			
			bos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
