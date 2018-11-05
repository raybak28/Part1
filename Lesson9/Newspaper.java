package by.epam.cdptr.main;

import java.sql.Date;

public class Newspaper extends PeriodicalEdition{
	String newsPaperGanr;
	
	public Newspaper(String title, int yearPublished, Date data, String editionType, String newsPaperGanr) {
	    
		super(title, yearPublished, data, editionType);
	    this.newsPaperGanr = newsPaperGanr;
	    }
	    public String getNewsPaperGanr() {
	   return newsPaperGanr;
	   }

	   
	  }