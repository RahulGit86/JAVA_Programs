package com.test.interfac;

public class Book implements Comparable<Book> {

	private int numberOfPages;
	private String title;
	private String author;

	public int compareTo(Book book) {
       if(this.getNumberOfPages() != book.getNumberOfPages()){
    	   return this.getNumberOfPages() - book.getNumberOfPages();
       }
       if(!this.getTitle().equals(book.getTitle())){
    	   return this.getTitle().compareTo(book.getTitle());
       }
		return this.getAuthor().compareTo(book.getAuthor());
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
