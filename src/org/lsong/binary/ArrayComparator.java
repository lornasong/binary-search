package org.lsong.binary;

import java.util.Comparator;

/**
 * Comparator to sort Integer ArrayList in ascending order (not descending).
 * @author lsong
 */
public class ArrayComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2){
		
		return (i1 < i2) ?-1: (i1 > i2) ? 1:0 ;
	}
}
