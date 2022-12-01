package com.training.yash.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


///////  ******WAP to find third maximum number from list of numbers.**************


public class ThirdMaxNumber {
	
	public static void main(String[] args) {
		
		int[]a= {11,97,14,55,56,77,88,90};
		int[]b={99,97,40,105,56,77,88,90};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int i = a.length;
		int i1 = b.length;
		
		System.out.println("Third Highest="+a[i-3]);
		System.out.println("Third Highest="+b[i-3]);
		
	}

}
