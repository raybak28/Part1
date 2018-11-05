package by.cdpjava.library.entity;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryFromFileClass {
	
	public List<String> readFromFile() {
		List<String> books = new ArrayList<String>();
		try(FileReader reader = new FileReader("D:\\Studing\\Java\\Eclipse\\Library.txt")){
			Scanner scan = new Scanner(reader);
			
	        int i = 1;
	        
	        while (scan.hasNextLine()) {
	            System.out.println(scan.nextLine());
	            books.add(scan.nextLine());
	            i++;
	        }
	 
	        reader.close();
	        
		}
		
	    catch(IOException ex){
	         
	        System.out.println(ex.getMessage());
	    }
		
		return books;
		

}
}