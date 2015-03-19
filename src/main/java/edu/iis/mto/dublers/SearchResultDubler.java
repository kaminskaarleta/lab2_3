package edu.iis.mto.dublers;

import edu.iis.mto.search.SearchResult;

public class SearchResultDubler implements SearchResult{

	boolean result;
	
	public SearchResultDubler(boolean result){
		this.result = result;
	}
	
	public boolean isFound() {
		return result;
	}

	public int getPosition() {
		return 0;
	}

}
