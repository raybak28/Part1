package by.epam.cdptr.main;

class BankCount {
    private String name;
	private int ncount;
	private double sum;
	
	public BankCount(String name, int ncount, double sum) {
		this.name = name;
		this.ncount = ncount;
		this.sum = sum;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNcount() {
		return ncount;
	}
	
	public double getSum() {
		return sum;
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
		BankCount bk = (BankCount)obj;
		if (name != bk.name){
		return false;
		}
		if (ncount != bk.ncount){
		return false;
		}
		if (sum != bk.sum){
		return false;
		}
		return true;
		}
	
	    public int hashCode() {
	    	return (int) (31 * ncount + 31 * sum + ((null == name) ? 0 : name.hashCode()));
		
	}
	    public String toString() {
	    return "Name = " + name + ", Count number = " + ncount + ", Summa + " + sum;
}
}	    
