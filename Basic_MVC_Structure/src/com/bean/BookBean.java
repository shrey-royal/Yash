package com.bean;

/**
 * 
 * Book.java
 * This is a model class represents a book entity
 * @author Shrey K
 * 
 */

public class BookBean {
	protected int id;
	protected String title;
	protected String author;
	protected float price;
	
	public BookBean() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}	
}
