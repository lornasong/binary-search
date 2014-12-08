package org.lsong.binary;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RecursiveSearchTest {

	@Test
	public void oddSearchValueTest() {
		List<Integer> b = new ArrayList<Integer>();
		b.add(2);
		b.add(23);
		b.add(40);
		
		RecursiveSearch test = new RecursiveSearch(b);
		
		assertEquals(test.searchForValue(2), 0);
		assertEquals(test.searchForValue(23), 1);
		assertEquals(test.searchForValue(40), 2);
		assertEquals(test.searchForValue(-1), -1);
	}
	
	@Test
	public void evenSearchValueTest() {
		List<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(23);
		b.add(40);
		b.add(57);
		
		RecursiveSearch test = new RecursiveSearch(b);
		
		assertEquals(test.searchForValue(1), 0);
		assertEquals(test.searchForValue(23), 1);
		assertEquals(test.searchForValue(40), 2);
		assertEquals(test.searchForValue(57), 3);
	}
	
	@Test
	public void singleSearchValueTest(){
		List<Integer> b = new ArrayList<Integer>();
		b.add(1);
		RecursiveSearch test = new RecursiveSearch(b);
		assertEquals(test.searchForValue(1), 0);

	}
	
	@Test
	public void missingSearchValueTest(){
		List<Integer> b = new ArrayList<Integer>();
		b.add(4);
		RecursiveSearch test = new RecursiveSearch(b);
		assertEquals(test.searchForValue(21), -1);
	}
	
	@Test
	public void duplicateSearchValueTest(){
		List<Integer> b = new ArrayList<Integer>();
		b.add(1);
		b.add(6);
		b.add(6);
		b.add(93);
		b.add(101);
		b.add(800);
		b.add(800);
		b.add(800);
		b.add(9111);
		b.add(9111);
		RecursiveSearch test = new RecursiveSearch(b);
		assertEquals(test.searchForValue(6), 1);
		assertEquals(test.searchForValue(800), 7);
		assertEquals(test.searchForValue(9111), 8);
		assertEquals(test.searchForValue(911199), -1);
	}
	
	@Test
	public void emptySearchValueTest(){
		List<Integer> b = new ArrayList<Integer>();
		RecursiveSearch test = new RecursiveSearch(b);
		assertEquals(test.searchForValue(21), -1);
	}

}
