package Streams;

import java.util.*;
import java.util.stream.Stream;

public class Library {
public static void main(String[] args) {
	ArrayList<Book>books=populatebooks();// here created new arraylist of books
	// we can make this program as parallel progrming to increase the speed
	//books.parallelStream().filter(bookk ->{// this parallel program
	books.stream().filter(bookk ->{
		// here  books.stream() books elemnt cob=nverted into straems  then filtering by ranfdom refrnce
		
		return bookk. getAuthor() .startsWith("t");
		// some ref .getAuthoe and startWith some letter or some lemnt 
	}).filter(bookk ->{
		return bookk. getTitle() .startsWith("");
		// foreach methid is eagar method so starems will hav the data with help with below code we can print all data
	}).forEach(System.out::println);
	
		//authors name tommy title awake
	//authors name tommy title awake
	}
//Stream<Book> newstream=books.stream();
//Stream<Book>  filterdresult=newstream.filter((x-> x==x));
//filterdresult.forEach(x->{
//	System.out.println(x);
//});

static ArrayList<Book> populatebooks(){// here we created method caLled populatbooks with Book is the datatype are genrics ArrayList<Book> 
ArrayList<Book>books=new ArrayList();// creaed neew array list daata type=genrics as the Book

books.add(new Book("kalidasa", "kalikapurna"));
books.add(new Book("jaki", "jani") );
books.add(new Book("kpurnadradasa","alikapurna"));
books.add(new Book("tommy","awake") );
books.add(new Book("tommy","awake") );
books.add(new Book("ppurnadradasa", "kkalikapurna"));
return books;// it will return arraylis of books//uthors name jaki titklejani

}
}