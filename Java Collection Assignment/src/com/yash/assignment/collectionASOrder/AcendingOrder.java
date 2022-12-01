package com.yash.assignment.collectionASOrder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Ascending order program
public class AcendingOrder {

	public static void main(String[] args) {
		String a[] = new String[] { "Y", "A","H", "S", "K", "A" };
		List<String> list = Arrays.asList(a);
		Collections.sort(list);
		System.out.println("Elements in ascending order:" + list);
	}

}
