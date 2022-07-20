package Chapter5;

public class Array {

	public static void main(String[] args) {
		int intArr[] = {5, 7, 2, 4, 9}; // 5개의 int 데이터로 이루어진 배열
		//30명의 수학 점수를 저장하는 배열 선언
		int scores[] = new int[30]; //new : 메모리에 데이터를 저장할 공간을 확보해줌
		scores[1] = 50; // 2번째 scores에 50; [1]=index
		
		System.out.println(scores[1]); //50
		System.out.println(intArr[2]); //2
	}
}
