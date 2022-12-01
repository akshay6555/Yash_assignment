package com.yash.assignment.collectionASOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//Ascending Order

public class AscendingOrder {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(20);
		list.add(10);
		list.add(50);
		list.add(30);
		list.add(80);
		list.add(70);
		list.add(20);
		list.add(50);
		list.add(30);
		list.add(80);

		Set<Integer> set = new HashSet<>(list);

		/*
		 * for (Integer s : set) {
		 * 
		 * System.out.println(s); }
		 */
		ArrayList<Integer> list2 = new ArrayList<Integer>(set);

		Collections.sort(list2);

		System.out.println(list2);

	}
}
