package Chapter5;

public class Array2D_Ex1 {

	public static void main(String[] args) {
		int[][] scores = new int[5][3];
		int[][] points = { 
				{ 95, 90, 87 }, // 1번 학생의 국어, 영어, 수학 점수
				{ 87, 67, 98 }, 
				{ 95, 90, 87 }, 
				{ 87, 67, 98 }, 
				{ 95, 90, 87 } 
				};
		System.out.println("첫번째 학생의 국어 점수는 " + points[0][0]);
		System.out.println("첫번째 학생의 수학 점수는 " + points[0][2]);
		System.out.println("세번째 학생의 영어 점수는 " + points[2][1]);
		
		for (int i = 0; i < points.length; i++) { // 각 행에 대해서 반복하는 for문
			for (int j = 0; j < points[i].length; j++) { // 각 행의 요소별로 반복하는 for문
				System.out.print(points[i][j] + " ");
			}
		}

	}
}
