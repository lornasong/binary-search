package org.lsong.binary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Controller {
	
	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		
		//Fill with random integers
		Random rand = new Random();
		
		for (int i = 0; i < 100; i++){
			Integer num = rand.nextInt(1000);
			a.add(num);
		}
		
		//Sort array
		Collections.sort(a, new ArrayComparator());
		
		//Check
		for (int i = 0; i < 100; i++){
			System.out.println(a.get(i));
		}
		
	}
	
	

}
