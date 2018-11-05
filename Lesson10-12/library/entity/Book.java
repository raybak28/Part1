package by.cdpjava.library.entity;


public class Book {
	
	private String title;
	private int yearPublished;
	
	
	public Book(String title, int yearPublished) {
	this.title = title;
	this.yearPublished = yearPublished;
	}
	
	public String toString() {
		return title + " " + yearPublished;
	}
	
	public String getTitle() { 
		return title;
		}
	public void setTitle(String title) {
		this.title = title;
		}
	public int getYearPublished() {
		return yearPublished;
		}
	public void setYearPublished(int yearPublished) { 
		this.yearPublished = yearPublished;
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
			Book bk = (Book)obj;
			if (title != bk.title){
			return false;
			}
			if (yearPublished != bk.yearPublished){
			return false;
			}
			return true;
			}
		
		    public int hashCode() {
		    	return (int) (31 * yearPublished + ((null == title) ? 0 : title.hashCode()));

}  
}
