package org.lsong.binary;

import java.util.ArrayList;
import java.util.List;

/**
 * Recursive binary search for index for a value of an ArrayList<Integer>.
 * Assumes that ArrayList is already sorted in not descending order.
 * 
 * @author lsong
 */
public class RecursiveSearch {

	public List<Integer> searchArray = new ArrayList<Integer>();
	public int firstPos = 0;
	public int lastPos;

	public RecursiveSearch(List<Integer> searchArray) {
		this.searchArray = searchArray;
		this.lastPos = getLength() - 1;
	}

	public List<Integer> getArray() {
		return searchArray;
	}

	private int getLength() {
		return searchArray.size();
	}

	private void setLastPos(int newLastPos) {
		this.lastPos = newLastPos;
	}

	private void setFirstPos(int newFirstPos) {
		this.firstPos = newFirstPos;
	}

	/**
	 * Recursive search for value and returns index.
	 * If value is not in array, returns -1.
	 * Tries to search for midpoint between first position and last position.
	 * If midpoint is not equal to the value being searched, then (re)set
	 * first position or last position accordingly and call method.
	 * Catches if array is empty and returns -1.
	 */
	public int searchForValue(int searchVal) {

		try {

			// Value is not in array
			if (firstPos > lastPos) {
				return -1;
			}

			// Find midPoint
			int midPos = firstPos + (lastPos - firstPos) / 2;
			int midVal = searchArray.get(midPos);

			if (searchVal == midVal) {
				setFirstPos(0);// Reset first and last position
				setLastPos(getLength() - 1);
				return midPos;
			} else if (searchVal > midVal) {
				setFirstPos(midPos + 1);
				return searchForValue(searchVal);
			} else {
				setLastPos(midPos - 1);
				return searchForValue(searchVal);
			}

		} catch (IndexOutOfBoundsException e) {

			System.out.println("Error: Array is empty");
			return -1;
		}
	}

}
