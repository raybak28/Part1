package by.cdpjava.library.view;

import java.util.List;

import by.cdpjava.library.entity.Book;
import by.cdpjava.library.entity.BookExt;


public class PrintLibraryInfo{
	
	public static void printAsTable(List<Book> books) {
		for (int i = 0; i < books.size(); i++)  {
		System.out.println( " | " + books.get(i).getTitle() + " | " + books.get(i).getYearPublished() + " | ");
		}
	}
	public static void printAsList(List<Book> books) {
		for (int i = 0; i < books.size(); i++)  {
		System.out.println(books.get(i));
		}
	}
}
