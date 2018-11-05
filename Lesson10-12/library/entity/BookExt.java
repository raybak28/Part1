package by.cdpjava.library.entity;

public class BookExt extends Book {
	private String author;
	private double price;
	
	public BookExt(String title, int yearPublished, String author, double price) {
		super(title, yearPublished);
		this.author = author;
		this.price = price;
	}
	
	public String getAutor() {
		return author;
	}
	//
	public double getPrice() {
		return price;
	}
	
	public int getYear() {
		return super.getYearPublished();
		}	
	
	public String toString() {
		return super.getTitle() + " " + super.getYearPublished() + " " + author + " " + price;
	}

	public boolean equals(Object obj){
		if (obj == null){
		return false;
		}
		if( this == obj){
		return true;
		}
		if (this.getClass() != obj.getClass()){
		return false;
		}
		BookExt bk = (BookExt)obj;
		if (author != bk.author){
		return false;
		}
		if (price != bk.price){
		return false;
		}
		return true;
		}
	
	    public int hashCode() {
	    	return (int) (31 * price + ((null == author) ? 0 : author.hashCode()));
}
}
