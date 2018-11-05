package by.cdpjava.library.action;

import java.util.Comparator;

import by.cdpjava.library.entity.BookExt;

public class SortedbyYear implements Comparator<BookExt> {
	
	public int compare(BookExt b1, BookExt b2) {
        if (b1.getYear() == b2.getYear()) {
            return 0;
        }
        if (b1.getYear() > b2.getYear()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}