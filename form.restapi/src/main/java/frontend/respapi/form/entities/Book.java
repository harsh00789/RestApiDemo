package frontend.respapi.form.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String BookName;
	private long BookPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public long getBookPrice() {
		return BookPrice;
	}
	public void setBookPrice(long bookPrice) {
		BookPrice = bookPrice;
	}
	public Book(int id, String bookName, long bookPrice) {
		super();
		this.id = id;
		BookName = bookName;
		BookPrice = bookPrice;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		
		return "Book [id=" + id + ", BookName=" + BookName + ", BookPrice=" + BookPrice + "]";
	}

}
