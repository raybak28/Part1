package by.cdpjava.library.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import by.cdpjava.library.entity.Book;
import by.cdpjava.library.entity.BookExt;
import by.cdpjava.library.entity.Library;
import by.cdpjava.library.entity.Library2;

public class LibraryAction {
	public void addNewBook(Book book, Library library) {
		int count = 0;
		List<Book> books = library.getBooks();
		for (int i = 0; i < books.size(); i++)  {
			if (book.equals(books.get(i))) {
				count = 1;
			}
	}
		if (count == 0) {
		library.add(book);
		}
	}
	
	/*public void removeBook(Book book, Library library) {
		library.remove(book);
	}*/
	
	public void removeBookbyTitle(String Title, Library library) {
		Book book;
		List<Book> books = library.getBooks();
		for (int i = 0; i < books.size(); i++)  {
			if (Title.equals(books.get(i).getTitle())) {
			book = books.get(i);
			library.remove(book);
			}
	}
	}
	
	public Book find(Book book, Library library) {
		Book existingbook = null;
		List<Book> books = library.getBooks();
		for (int i = 0; i < books.size(); i++)  {
			if (book.equals(books.get(i))) {
				existingbook = book;
			}
	}
		return existingbook;
}
	
	public List<BookExt> findbyAuthor1(String author, Library2 library2) {
		
		List<BookExt> books = library2.getBooks();
		List<BookExt> a = new ArrayList<BookExt>();
		SortedbyPrice mySortedbyPrice = new SortedbyPrice(); 
		for (int i = 0; i < books.size(); i++)  {
			if (author.equals(books.get(i).getAutor())) {
			a.add(books.get(i));
		}
	}
		a.sort(mySortedbyPrice);
		return a;
	}
		
	public List<BookExt> findbyAuthor2(String author, Library2 library2) {
		
		List<BookExt> books = library2.getBooks();
		List<BookExt> b = new ArrayList<BookExt>();
		SortedbyYear mySortedbyPrice = new SortedbyYear(); 
		for (int i = 0; i < books.size(); i++)  {
			if (author.equals(books.get(i).getAutor())) {
			b.add(books.get(i));
		}
	}
		b.sort(mySortedbyPrice);
		return b;
	}
	
}
	
	
