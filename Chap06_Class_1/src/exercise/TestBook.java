package exercise;

public class TestBook {

	public static void main(String[] args) {
		Book[] book = new Book[5];

		book[0] = new Book("����1", "������", 12800);
		
		for(int i=1; i<book.length; i++) {
			book[i] = new Book(book[0]);
			
			book[i].setTitle("����"+(i+1));
		}
		
		for(int i=0; i<book.length; i++) {
			System.out.println(book[i]);
		}
	}

}
