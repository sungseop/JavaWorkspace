package firstjava2;

import java.util.Random;

public class test11 {

	public static void main(String[] args) {
		Random rand = new Random();
		int test = rand.nextInt(3);
		switch (test) {
		case 0 : System.out.println("가위");
		break;
		case 1 : System.out.println("바위");
		break;
		case 2 : System.out.println("보");
		break;
		}
		
		

	}

}
