package com.learning.springboot.springbootbasics;

public class Books {
	private String name;
	private String author;
	private int id;
	
	public Books(String name, String author, int id) {
		super();
		this.name = name;
		this.author = author;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Books [name=" + name + ", author=" + author + ", id=" + id + "]";
	}
	
}
