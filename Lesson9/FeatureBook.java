package by.epam.cdptr.main;

import java.sql.Date;

public class FeatureBook extends NonPeriodicalEdition {

    String ganr;
	
	public FeatureBook(String title, int yearPublished, String author, String bookType, String ganr) {
	    
		super(title, yearPublished, author, bookType);
	    this.ganr = ganr;
	    }
	    public String getGanr() {
	   return ganr;
	   }

	   
	  }