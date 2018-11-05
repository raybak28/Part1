package by.cdpjava.library.main;


import java.util.List;
import by.cdpjava.library.entity.LibraryFromFileClass;

public class LibraryFromFile {

	public static void main(String[] args) {
				
		LibraryFromFileClass myLibrary = new LibraryFromFileClass();
		List<String> books3 = myLibrary.readFromFile();
		for (int i = 0; i < books3.size(); i++) {
			System.out.println(books3.get(i));
		}
		
    } 
}