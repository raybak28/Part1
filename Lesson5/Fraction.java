package by.epam.cdptr.main;

class Fraction {
	
	private int m;
	private int n;
	
	public Fraction() {
		m = 0;
		n = 1;
		}
	
	public Fraction(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
	public String toString(){
	       return m + "/" + n;
	    }
	    
		
	public int getNum() {
		return m;
		}
	
	public int getDen() {
		return n;
		}

}
