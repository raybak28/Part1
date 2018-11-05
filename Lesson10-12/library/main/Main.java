package by.cdpjava.library.main;


import java.util.List;

import by.cdpjava.library.action.LibraryAction;
import by.cdpjava.library.entity.Book;
import by.cdpjava.library.entity.BookExt;
import by.cdpjava.library.entity.Library;
import by.cdpjava.library.entity.Library2;
import by.cdpjava.library.view.PrintLibraryInfo;

public class Main {

	public static void main(String[] args) {
		Library myLibrary = new Library();
		Library2 myLibrary2 = new Library2();
		LibraryAction libAction = new LibraryAction();
		
		////////////////////////////////////////  ADD BOOK  ////////////////////////////////////////////////////////
		
		libAction.addNewBook(new Book("Evgeniy Onegin", 1985), myLibrary);
		libAction.addNewBook(new Book("Var and peace", 1978), myLibrary); // shoudn't be added due to this book exists
		
		///////////////////////////////////////  REMOVE BOOK  //////////////////////////////////////////////////////
		
		//libAction.removeBook(new Book("Biology", 1999), myLibrary);
		
		//libAction.removeBookbyTitle("Biology", myLibrary); // Remove Book "Biology" from Library
		
		///////////////////////////////////////  FIND BOOK  ////////////////////////////////////////////////////////
		
		//Book foundedbook = libAction.find(new Book("Var and peace", 1978), myLibrary);
		//System.out.println("Founded book : " + foundedbook);
		
		////////////////////////////////////// FIND BOOK by AUTHOR SORTED by PRICE /////////////////////////////////////////////////
		
		List<BookExt> booksbyPrice = libAction.findbyAuthor1("Alexander Pushkin", myLibrary2);
		System.out.println("Books sorted by Price :");
		for (int i = 0; i < booksbyPrice.size(); i++) {
			System.out.println(booksbyPrice.get(i));
		}
		System.out.println(" ");
		
		////////////////////////////////////  FIND BOOK by AUTHOR SORTED by YEAR //////////////////////////////////////////////////////
		
		List<BookExt> booksbyYear = libAction.findbyAuthor2("Alexander Pushkin", myLibrary2);
		System.out.println("Books sorted by Year of Publishing :");
		for (int i = 0; i < booksbyYear.size(); i++) {
			System.out.println(booksbyYear.get(i));
		}
		System.out.println(" ");
		
		//////////////////////////////////////  PRINT BOOK LIST ////////////////////////////////////////////////////
		
		System.out.println("| Book name | Year of edition |" );
		PrintLibraryInfo.printAsTable(myLibrary.getBooks());
		//PrintLibraryInfo.printAsList(myLibrary.getBooks());
		
		
	}

}
