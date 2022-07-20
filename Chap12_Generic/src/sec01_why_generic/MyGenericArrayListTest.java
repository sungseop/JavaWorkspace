package sec01_why_generic;

public class MyGenericArrayListTest {

	public static void main(String[] args) {
		// 아래의  list 에는 String 타입만 저장 가능함.
		MyGenericArrayList<String> strList = new MyGenericArrayList();
		strList.add("abc");
		strList.add("beta");
		display(strList);
		
		// 문제를 발생시키기 위해 숫자를 저장
		//strList.add(Integer.valueOf(1234)); // 컴파일할 때 값이 잘못 들어가는 것을 알려줌

		//display(strList);
	}

	// 리스트의 내용을 출력하는 메소드
	public static void display(MyGenericArrayList<String> list) {
		for(int i=0; i<list.size(); i++) {
			String str = (String)list.get(i);
			System.out.println(str);
		}
	}
}
