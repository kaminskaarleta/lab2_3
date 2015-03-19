package edu.iis.mto.dublers;

import edu.iis.mto.search.SearchResult;
import edu.iis.mto.search.SequenceSearcher;

public class SequenceSearcherDubler implements SequenceSearcher{
	
	private int key5SearchCounter;
	private int searchCounter;
	
	public SequenceSearcherDubler() {
		key5SearchCounter = 0;
		searchCounter = 0;
	}

	public SearchResult search(int key, int[] seq) {
		searchCounter++;
		
		//SearchResult will be true only if key is equals 5.
		if(key == 5){
			key5SearchCounter++;
			return new SearchResultDubler(true);
		}
		else{
			return new SearchResultDubler(false);
		}
	}

	public int getKey5SearchCounter() {
		return key5SearchCounter;
	}

	public int getSearchCounter() {
		return searchCounter;
	}
}
