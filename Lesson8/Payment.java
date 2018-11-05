package by.epam.cdptr.main;

class Payment {

	
	private String good;
	private double price;
	
	
	public Payment(String good, double price) {
		this.good = good;
		this.price = price;
	}
	
	public String toString() {
		return good + " " + price;
	}
	
	public String getGood() {
		return good;
	}
	
	public double getPrice() {
		return price;
	}
	
	
}
