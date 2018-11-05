package by.epam.cdptr.main;

import java.sql.Date;

public class PeriodicalEdition extends Edition {
	Date data;
	String editionType;
	public PeriodicalEdition(String title, int yearPublished, Date data, String editionType) {
    
	super(title, yearPublished);
    this.data = data;
    this.editionType = editionType;
  }
   public Date getData() {
   return data;
   }
   public String getEditionType() {
   return editionType;
   }

   
  }

