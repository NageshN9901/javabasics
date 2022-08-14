package Streams;

public class Book {

	private String author;
	private String title;
	//const
	public Book (String author,String title) {
		this.author=author;
		this.title=title;
	}
	// geter method for private feilds
	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
	// need toSting method to reprdent data inthe form string
	@Override 
	public String toString(){
		return ("authors name "+ author +" "+"title"+" "+ title );
	}
	
	
}
