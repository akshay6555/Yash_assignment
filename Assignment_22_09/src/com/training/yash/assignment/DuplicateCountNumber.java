package com.training.yash.assignment;

public class DuplicateCountNumber {
	
	public static void main(String[] args) {
		
		//WAP to find duplicate numbers and there counting from list of numbers.
		
		int[] narr= {11,12,13,14,12,66,60,44,55,44,33,22,11};
		
		int count=0;
		for(int i=0;i<narr.length;i++) {
			
			
			for(int j=i+1;j<narr.length;j++) {
				
				if(narr[i]==narr[j]) {
					
					System.out.println("Duplicate Number=" + narr[j]);
					count ++;
					
				}
			
			
			}
			
		}
		System.out.println("Total Count of Duplicate Numbers=" + count);
	}

}
