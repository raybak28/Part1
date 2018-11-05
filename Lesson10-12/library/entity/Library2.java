package by.cdpjava.library.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library2 {
List<BookExt> books;
	
	public Library2() {
		books = new ArrayList<BookExt>();
		BookExt a = new BookExt("Angels and Devils", 2011, "Dan Braun", 15.85);
		BookExt b = new BookExt("Tihiy Don", 1987, "Mihail Sholohov", 10.14);
		BookExt c = new BookExt("Kapitanskaya Dochka", 1991, "Alexander Pushkin", 8.49);
		BookExt d = new BookExt("The Lord of the Rings", 2005, "John Tolkien", 12.35);
		BookExt e = new BookExt("Zolotaya rybka", 1964, "Alexander Pushkin", 5.16);
		BookExt f = new BookExt("Poems", 1995, "Alexander Pushkin", 7.68);
		
		books.add(a);
		books.add(b);
		books.add(c);
		books.add(d);
		books.add(e);
		books.add(f);
		
			
	}
	
	public void add(BookExt newBook) {
			books.add(newBook);
		}
	
	public List<BookExt> getBooks(){
		return Collections.unmodifiableList(books);
		}
	
	public boolean remove(BookExt book) {
		return books.remove(book);
	}
	
	
	}
	




