package by.epam.cdptr.main;

import java.util.ArrayList;
import java.util.List;

public class Lesson8task2 {

	public static void main(String[] args) {
		Payment a = new Payment("bread", 2.15);
		Payment b = new Payment("meat", 14.43);
		Payment c = new Payment("milk", 2.87);
				
		List<Payment> list = new ArrayList<Payment>();
		//List<Note> notes = new ArrayList<Note>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		for (int i = 0; i < list.size(); i++)  {
            System.out.println(list.get(i));
		}
		
	}

}
