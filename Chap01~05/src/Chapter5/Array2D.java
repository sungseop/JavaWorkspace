package Chapter5;

public class Array2D {

	public static void main(String[] args) {
		int[][] scores = {
				{70, 75, 80}, // 1번 학생의 국어, 수학, 영어
				{80, 90, 100}, 
				{85, 95, 100}, 
				{80, 90, 100}, 
				{80, 90, 100}
		};
		
		System.out.println("1번 학생의 국어 점수는 " + scores[0][0]);
		System.out.println("4번 학생의 영어 점수는 " + scores[3][2]);

	}

}
