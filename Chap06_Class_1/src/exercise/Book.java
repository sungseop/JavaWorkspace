package exercise;

public class Book {
	private String title;	// å ����
	private String author;	// ���ڸ�
	private long   price;	//  ����
	
	public Book() {
	}
	
	public Book(String title, String author, long price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(Book other) {
		this.title = other.title;
		this.author = other.author;
		this.price = other.price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public long getPrcie() {
		return price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "Book[title="+title+", author="+author+", price="+price+"]"; 
	}
}















