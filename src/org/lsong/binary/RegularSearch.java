package org.lsong.binary;

import java.util.ArrayList;
import java.util.List;

/**
 * Binary search for index for a value of an ArrayList<Integer>.
 * Assumes that ArrayList is already sorted in not descending order.
 * 
 * @author lsong
 */
public class RegularSearch {

	public List<Integer> searchArray = new ArrayList<Integer>();

	public RegularSearch(List<Integer> searchArray) {
		this.searchArray = searchArray;
	}

	public List<Integer> getArray() {
		return searchArray;
	}

	private int getLength() {
		return searchArray.size();
	}

	/**
	 * Regular search for value and returns index. If array is empty, return -1.
	 * Loops through (length + 1) times to search for value.
	 * If value to not found after loop is completed, value is not in array and return -1. 
	 */
	public int searchForValue(int searchVal) {
		int firstPos = 0;
		int lastPos = getLength() - 1;

		// Array is empty
		if (getLength() == 0) {
			return -1;
		} else {
			// Array is not empty. Do search:

			// Search maximum: loop length+1 times
			int i = 0;
			while (i < getLength()) {

				//Check if firstPos is out of range, value is not in array
				if (firstPos > lastPos){
					return -1;
				}
				
				// Find middle index and value
				int increment = (lastPos - firstPos) / 2;
				int midPos = firstPos + increment;
				
				int midVal = searchArray.get(midPos);

				if (searchVal == midVal) {
					return midPos;
				} else if (searchVal > midVal) {
					firstPos = midPos + 1;
				} else {// (searchVal < midVal)
					lastPos = midPos - 1;
				}

				i++;

			}
			// Value is not in array
			return -1;

		}
	}
}
