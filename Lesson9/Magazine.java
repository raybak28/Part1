package by.epam.cdptr.main;

import java.sql.Date;

public class Magazine extends PeriodicalEdition{
    
	int pagenum;
	
	public Magazine(String title, int yearPublished, Date data, String editionType, int pagenum) {
	    
		super(title, yearPublished, data, editionType);
	    this.pagenum = pagenum;
	    }
	    public int getPagenum() {
	   return pagenum;
	   }

	   
	  }