package edu.iis.mto.dublers;

import edu.iis.mto.search.SearchResult;
import edu.iis.mto.search.SequenceSearcher;

public class SequenceSearcherDubler implements SequenceSearcher{

	public SearchResult search(int key, int[] seq) {
		//SearchResult will be true only if key is equals 5.
		if(key == 5){
			return new SearchResultDubler(true);
		}
		else{
			return new SearchResultDubler(false);
		}
	}

}
