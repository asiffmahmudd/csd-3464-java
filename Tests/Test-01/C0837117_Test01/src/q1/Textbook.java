package q1;

public class Textbook {
	private String title;
	private String publisher;
	private Isbn isbn;
	private int edition;
	private int numPages;
	
	public Textbook() {
		this.title = "TBD";
		this.publisher = "TBD";
		this.isbn = null;
		this.edition = 0;
		this.numPages = 0;
	}

	public Textbook(String title, String publisher, Isbn isbn, int edition, int numPages) {
		if(!title.isEmpty()) {
			this.title = title;
		}
		else {
			this.title = "TBD";
		}
		if(!publisher.isEmpty()) {
			this.publisher = publisher;
		}
		else {
			this.publisher = "TBD";
		}
		if(isbn.isValidISBN(isbn.toString())) {
			this.isbn = isbn;
		}
		else {
			this.isbn = null;
		}
		this.edition = edition >= 1 ? edition : 1;
		this.numPages = numPages >= 1 ? numPages : 1;
	}
	
	public Textbook(Textbook textbook) {
		Isbn isbn = new Isbn(textbook.isbn);
		this.title = textbook.title;
		this.publisher = textbook.publisher;
		this.isbn = isbn;
		this.edition = textbook.edition;
		this.numPages = textbook.numPages;
	}
	
	public boolean equals(Textbook textbook) {
		if(this.title == textbook.title && this.publisher == textbook.publisher
		&& this.edition == textbook.edition && this.numPages == textbook.numPages) {
			if((this.isbn == null && textbook.isbn == null) || this.isbn.equals(textbook.isbn)) 
				return true;
		}
		return false;
	}
	
	public String toString() {
		String str = "TITLE: " + this.title + "\n" + 
				"PUBLISHER: " + this.publisher + "\n";
		if(this.isbn != null) {
			str += "ISBN-13: " + this.isbn.toString() + "\n";
		}
		else {
			str += "ISBN-13: " + "TBD\n";
		}
		str +=	"EDITION: " + this.edition + "\n" +
				"PAGES: " + this.numPages + " pgs";
		return str;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(!title.isEmpty())
			this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		if(!publisher.isEmpty())
			this.publisher = publisher;
	}

	public Isbn getIsbn() {
		return isbn;
	}

	public void setIsbn(Isbn isbn) {
		if(isbn.isValidISBN(isbn.toString()))
			this.isbn = isbn;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		if(edition >= 1)
			this.edition = edition;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		if(numPages >= 1)
			this.numPages = numPages;
	}
	
	
}
