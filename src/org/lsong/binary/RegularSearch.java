package org.lsong.binary;

import java.util.ArrayList;
import java.util.List;

public class RegularSearch {

	public List<Integer> searchArray = new ArrayList<Integer>();
	
	public RegularSearch(List<Integer> searchArray){
		this.searchArray = searchArray;
	}
	
	private int getLength(){
		return searchArray.size();
	}
	
	public int searchForValue(List<Integer> searchArray, int searchVal){
		int firstPos = 0;
		int lastPos = getLength();
		
		if (lastPos <= firstPos){
			return 0;
		}
		else{
			
		}
		return 0;
	}
}
