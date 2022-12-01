package com.training.yash.assignment;

public class OddEvenPrimePerfect {
	
	
	public static void main(String[] args) {
		
		 
		int []a= {1,2,3,4,5,6,7,8,9,11,23,28,31};
	int count=0;
//		
//		for(int i=0;i<a.length;i++) {
//			
//			if(a[i]%2==0)
//			{
//				System.out.println(a[i]);
//				count++;
//			}
//			
//			
//		}
//		System.out.println("Total Even Numbers="+count);
//		int count1=0;
//		for(int i=0;i<a.length;i++) {
//			
//			if(a[i]%2!=0) {
//				
//				System.out.println(a[i]);
//				count1++;
//			}
//		}
//		System.out.println("Total Odd Numbers="+count1);
		
		for(int i=0;i<a.length;i++) 
		{
//			int count2=0;
			for(int j=i;j<a.length;j++)
			{
				
				if(a[i]%a[j]==0) {
					
					count++;
				}
			}
			if(count==2) {
				System.out.println("This are Prime Numbers="+count);
		}
			
		}
			
		}
	}
	
	
//	public void odd() {
//		
//		for(int i=0;i<a.length;i++) {
//			
//			if(i%2!=0) {
//				System.out.println("This are the Odd Numbers="+i);
//				count++;
//			}
//			
//		}
//		System.out.println();
//		System.out.println("Total Count of Odd Number="+count);
//	
//	}
//		public void even() {
//			for(int i=0;i<a.length;i++) {
//				
//				if(i%2==0) {
//					System.out.println("This are the Even Numbers="+i);
//					count++;
//				}
//			}
//			System.out.println();
//			System.out.println("Total Count of Even Number="+count);
//		
//	}
//		public void prime() {
//			for(int i=0;i<a.length;i++) {
//				
//				int count=0;
//				for(int j=1;j<a.length;j++) {
//					
//					if(i%j==0) {
//					
//						count++;
//					}
//				}
//				if(count==2) {
//					System.out.println("Number Is Prime Number="+i);
//				}
//				
//			}
//			
//		}
//		public void perfect() {
//			int sum=0;
//			for(int i=1;i<a.length;i++) {
//				
//				for(a[i]>i) {
//					
//				}
//			}
//		}
//	public static void main(String[] args) {
//		
//		OddEvenPrimePerfect o=new OddEvenPrimePerfect();
//		o.odd();
//		
////		o.even();
////		System.out.println();
////		o.prime();
////	}
//	}


