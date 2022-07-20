package sec06_properties;

import java.util.*;
import java.io.*;

public class PropertyEx {

	public static void main(String[] args) {
		Properties prop = new Properties();

		// 값을 저장
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "ko");
		prop.setProperty("wifi", "true");
		prop.setProperty("sound", "JingleBell");
		
		// 키값 전체를 읽어옴.
		Enumeration e = prop.propertyNames();
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.printf("%10s=%-8s\n", element, prop.getProperty(element));
		}
		
		try {
			prop.store(new FileOutputStream("output.txt"), 
							"Properties Example");
			prop.storeToXML(new FileOutputStream("output.xml"), 
							"Properties Example");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
