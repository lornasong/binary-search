package org.lsong.binary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Incomplete Controller Class to play with binary search. Does not account for
 * user error (e.g. user does not enter a value int).
 * 
 * Loads a random sorted array list of integers. User can type in value smaller
 * than size to search for index in arrayList. Returns -1 for values not in array. When user 
 * 
 * @author lsong
 */
public class Controller {

	public static void main(String[] args) {

		int size = 100000;

		// Load a random sorted array
		List<Integer> a = new ArrayList<Integer>();

		Random rand = new Random();

		for (int i = 0; i < size; i++) {
			Integer num = rand.nextInt(100);
			a.add(num);
		}

		Collections.sort(a, new ArrayComparator());

		RegularSearch test = new RegularSearch(a);

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		// Loop to get user's input
		int value = 0;
		while (true) {
			System.out.println("Enter a number to search");

			try {
				value = Integer.parseInt(reader.readLine());
				System.out.println(test.searchForValue(value));
			} catch (IOException e) {
				System.out.println("Ending");
			}
		}
	}

}
