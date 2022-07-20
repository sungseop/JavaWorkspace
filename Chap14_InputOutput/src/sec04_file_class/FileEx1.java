package sec04_file_class;

import java.io.*;

public class FileEx1 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\java-workspace\\Chap13_Collection\\..\\Chap14_InputOutput\\program.out");

		String fileName = file.getName();
		System.out.println("파일명: " + fileName);
		
		String path = file.getPath();
		System.out.println("파일의 경로: " + path);
		
		System.out.println("파일의 절대 경로: " + file.getAbsolutePath());
		System.out.println("파일의 정규 경로: " + file.getCanonicalPath());
	}

}
