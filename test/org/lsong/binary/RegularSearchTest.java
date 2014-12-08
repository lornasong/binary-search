package org.lsong.binary;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RegularSearchTest {

	@Test
	public void oddSearchValueTest() {
		List<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(23);
		b.add(40);
		
		RegularSearch test = new RegularSearch(b);
		
		assertEquals(test.searchForValue(1), 0);
		assertEquals(test.searchForValue(23), 1);
		assertEquals(test.searchForValue(40), 2);
	}
	
	@Test
	public void evenSearchValueTest() {
		List<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(23);
		b.add(40);
		b.add(57);
		
		RegularSearch test = new RegularSearch(b);
		
		assertEquals(test.searchForValue(1), 0);
		assertEquals(test.searchForValue(23), 1);
		assertEquals(test.searchForValue(40), 2);
		assertEquals(test.searchForValue(57), 3);
	}
	
	@Test
	public void singleSearchValueTest(){
		List<Integer> b = new ArrayList<Integer>();
		b.add(1);
		RegularSearch test = new RegularSearch(b);
		assertEquals(test.searchForValue(1), 0);

	}
	
	@Test
	public void missingSearchValueTest(){
		List<Integer> b = new ArrayList<Integer>();
		b.add(4);
		RegularSearch test = new RegularSearch(b);
		assertEquals(test.searchForValue(21), -1);
	}

}
