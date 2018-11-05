package by.epam.cdptr.main;

public class ScienceBook extends NonPeriodicalEdition {
    String science;
	
	public ScienceBook(String title, int yearPublished, String author, String bookType, String science) {
	    
		super(title, yearPublished, author, bookType);
	    this.science = science;
	    }
	    public String getScience() {
	   return science;
	   }
	   public String toString() {
	 	   return getTitle() + " " + getYearPublished() + " " + getAuthor() + " " + getBookType() + " " +  science;
	 	   }

	   
	  }
