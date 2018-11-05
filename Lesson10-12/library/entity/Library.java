package by.cdpjava.library.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
	List<Book> books;
	
	public Library() {
		books = new ArrayList<Book>();
		Book a = new Book("Var and peace", 1978);
		Book b = new Book("Biology", 1999);
		//Book c = new Book("Biology", 1999);
		books.add(a);
		books.add(b);
		//books.add(c);
		
			
	}
	
	public void add(Book newBook) {
			books.add(newBook);
		}
	public List<Book> getBooks(){
		return Collections.unmodifiableList(books);
		}
	public boolean remove(Book book) {
		return books.remove(book);
	}
	
	
	}
	

