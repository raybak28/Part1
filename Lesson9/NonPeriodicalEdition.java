package by.epam.cdptr.main;


public class NonPeriodicalEdition extends Edition {
	String author;
	String bookType;
	public NonPeriodicalEdition(String title, int yearPublished, String author, String bookType) {
    
	super(title, yearPublished);
    this.author = author;
    this.bookType = bookType;
  }
   public String getAuthor() {
   return author;
   }
   public String getBookType() {
   return bookType;
   }

   
  }
