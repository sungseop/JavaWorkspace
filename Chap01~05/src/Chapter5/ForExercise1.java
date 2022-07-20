package Chapter5;

public class ForExercise1 {

	public static void main(String[] args) {
		for (int i=1; i<=110; i++) {
			if (i%3==0 && i%5==0) {
				System.out.print("짝짝짝 ");
			} else if(i%3==0) {
				System.out.print("짝 ");
			} else if(i%5==0) {
				System.out.print("짝짝 ");
			} else {
				System.out.print(i+" ");
				
			}
		}

	}

}
