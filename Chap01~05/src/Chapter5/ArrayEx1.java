package Chapter5;

// 1차원 배열 예제, 배열의 내용을 합산하여 출력

public class ArrayEx1 {
	public static void main(String[] args) {

		int[] scores = new int[5];
		int sum = 0; // 합계 저장 변수

		scores[0] = 75;
		scores[1] = 87;
		scores[2] = 70;
		scores[3] = 98;
		scores[4] = 67;

		for (int i = 0; i<scores.length; i++) { // 배열변수.length : 배열의 요소 갯수를 의미함
			sum = sum + scores[i];
		}
		System.out.println("배열의 합계는 " + sum);
	}
}
