package p1;

import java.io.Serializable;

public class BookBag implements Serializable{
	private Book[] arr;
	private int nElems;
	
	public BookBag(int maxSize) {
		arr = new Book[maxSize];
	}
	
	public void insert(Book book) {
		arr[nElems++] = book;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
	}
	
	public String sequentialSearchByISBN(String isbn) {
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getIsbn().equals(isbn)) {
				return arr[i].toString();
			}
		}
		return null;
	}
	
	public Book[] sequentialSearchByLastName(String lastName) {
		Book[] temp = new Book[nElems];
		int c = 0;
		for(int i = 0; i < nElems; i++) {
			if(arr[i].getAuthor().getLastName().equals(lastName)) {
				temp[c] = arr[i];
				c++;
			}
		}
		return temp;
	}
	
	//see other stuff for rest (discord notes by garrett)
	
	public int getNelems() {
		return nElems;
	}
}
