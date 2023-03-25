package com.course.movieapp.model;

import java.util.List;

public class SearchResult {
	private String searchType;
	private String expression;
	private List<SearchMovie> results;
	
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getExpression() {
		return expression;
	}
	public void setExpression(String expression) {
		this.expression = expression;
	}
	public List<SearchMovie> getResults() {
		return results;
	}
	public void setResults(List<SearchMovie> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "SearchResult [\n\tsearchType=" + searchType + ", \nexpression=" + expression + ", \nresults=" + results + "]";
	}
	
	
}
