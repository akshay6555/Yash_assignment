package com.yash.assignment.collection;

import java.util.Collections;
import java.util.Vector;

/* WAP to store data related to item in Vector and after that sort the data.*/

public class Test {

	public static void main(String[] args) {

		Vector<Iteams> v = new Vector<Iteams>();
		v.add(new Iteams(101, "Monster", 90));
		v.add(new Iteams(105, "Coke   ", 65));
		v.add(new Iteams(103, "Appay  ", 80));
		v.add(new Iteams(102, "Redbull", 100));
		v.add(new Iteams(104, "Fruity ", 30));

		Collections.sort(v, new IdComparator());

		for (Iteams i : v)

			System.out.println("Iteams Id = " + i.getItemId() + "  Iteams Name =  " + i.getName() + "  Iteam price =  "
					+ i.getPrice());
	}

}