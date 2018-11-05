package by.epam.cdptr.main;

public class Lesson8task1 {

	public static void main(String[] args) {
		BankCount bk1 = new BankCount("Ivanov", 123456, 5220.83);
		BankCount bk2 = new BankCount("Ivanov", 123456, 5220.83);

		if(bk1.equals(bk2)){
				
			System.out.println("true");
			}else{
			System.out.println("false");
			}
			
			System.out.println(bk1.hashCode());
			System.out.println(bk2.hashCode());
		}
	}
			