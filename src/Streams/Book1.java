package Streams;

import java.util.ArrayList;
import java.util.List;

public class Book1 {
	// Class Definition
	
	    // Member Variables
	    public int isbn;
	    public int yearPublished;
	    public String title;
	    public String author;
	    public String price;
	    public int noOfCopies;

	    // Constructor
	    public Book1(int ISBN, int year, String ttle, String auth, String pri, int copies) {

	        this.isbn = ISBN;
	        this.yearPublished = year;
	        this.title = ttle;
	        this.author = auth;
	        this.price = pri;
	        this.noOfCopies = copies;
	    }

	    // Create a List of Books
	    public static List<Book1> getBooks() {
	        Book1 b1 = new Book1(1234, 1991, "Book1", "mark.mark", "£11.00", 5);
	        Book1 b2 = new Book1(4321, 1994, "Book2", "bob.bob", "£12.00", 3);
	        List<Book1> books = new ArrayList<Book1>();
	        books.add(b1);
	        books.add(b2);
	        return books;
	    }
	}

