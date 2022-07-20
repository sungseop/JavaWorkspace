package sec04_file_class;

import java.io.*;

public class FileEx2 {

	public static void main(String[] args) {
		// 명령행에서 입력값을 받아 디렉토리, 파일을 확인
		File file = new File(args[0]);
		System.out.println("입력 디렉토리명: "+args[0]);
		
		// 파일이 존재하는지 확인 
		if (!file.exists() || !file.isDirectory()) {
			System.out.println("존재하지 않는 디렉토리입니다!");
			System.exit(0);
		} else {
			System.out.println("존재하는 디렉토리입니다.");
		}
		
		File[] files = file.listFiles();
		for(int i=0; i<files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "["+fileName+"]" : fileName);
		}
	}
}
