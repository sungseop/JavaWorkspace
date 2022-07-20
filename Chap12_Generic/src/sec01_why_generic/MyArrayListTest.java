package sec01_why_generic;

public class MyArrayListTest {

	public static void main(String[] args) {
		MyArrayList strList = new MyArrayList();
		strList.add("abc");
		strList.add("beta");
		display(strList);
		
		// 문제를 발생시키기 위해 숫자를 저장
		strList.add(Integer.valueOf(1234));

		display(strList);
	}

	// 리스트의 내용을 출력하는 메소드
	public static void display(MyArrayList list) {
		for(int i=0; i<list.size(); i++) {
			String str = (String)list.get(i);
			System.out.println(str);
		}
	}
}
