package com.test.interfac;

public class TestCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book book = new Book();
		book.setAuthor("rahulsi");
		book.setNumberOfPages(11);
		book.setTitle("java");

		Book book1 = new Book();
		book1.setAuthor("rahulsn");
		book1.setNumberOfPages(11);
		book1.setTitle("java");

		System.out.println(book.compareTo(book1));
		if(book.compareTo(book1) == 0){
			System.out.println("Both are same");
		}else if(book.compareTo(book1) > 0){
			System.out.println("Book is first");
		}else{
			System.out.println("Book1 is first");
		}
	}

}
