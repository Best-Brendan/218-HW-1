package p1;

public class Book {
	private String title;
	private String isbn;
	private Author author;
	private Double price;
	@Override
	public String toString() {
		return "Book [title=" + title + ", isbn=" + isbn + ", author=" + author + ", price=" + price + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Book(String title, String isbn, Author author, Double price) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.author = author;
		this.price = price;
	}
}
