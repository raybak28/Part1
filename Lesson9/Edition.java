package by.epam.cdptr.main;

public class Edition {

		private String title;
		private int yearPublished;
		
		
		public Edition(String title, int yearPublished) {
		this.title = title;
		this.yearPublished = yearPublished;
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
		
	}
	

