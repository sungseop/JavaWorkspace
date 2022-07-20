package exercise;

import java.util.*;

class Book {
	private int id;
	private String name;
	private String author;
	private String publisher;
	private int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return (name+author).hashCode();
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			Book tmp = (Book)obj;
			boolean result = (name.equals(tmp.name) 
								&& author.equals(tmp.author));
			
			return result;
		}
		
		return false;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
}

public class HashSetEx1 {
	public static void main(String[] args) {
		Set<Book> books = new HashSet<>();
		
		books.add(new Book(3, "할머니는 죽지 않는다", "공지영", "가출판사", 11));
		books.add(new Book(5, "할머니는 죽지 않는다", "공지영", "가출판사", 11));
		books.add(new Book(72, "기린의 날개", "히가시노 게이고", "나출판사", 20));
		books.add(new Book(38, "미스터 하이든", "사샤 아랑고", "다출판사", 19));
		books.add(new Book(50, "아몬드", "손원평", "라출판사", 32));
		books.add(new Book(55, "아몬드", "손원평", "라출판사", 20));
		
		for(Book item : books) {
			System.out.println(item);
		}
		
		Iterator<Book> it = books.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}








