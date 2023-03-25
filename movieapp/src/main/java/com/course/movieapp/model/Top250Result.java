package com.course.movieapp.model;

import java.util.List;

public class Top250Result {

	private List<Top250Movie> items;
	private String errorMessage;
	
	
	public List<Top250Movie> getItems() {
		return items;
	}
	public void setItems(List<Top250Movie> items) {
		this.items = items;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	@Override
	public String toString() {
		return "Top250Result [items=" + items + ", errorMessage=" + errorMessage + "]";
	}
	
	
	
}
