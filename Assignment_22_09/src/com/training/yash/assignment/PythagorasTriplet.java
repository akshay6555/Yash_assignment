package com.training.yash.assignment;

public class PythagorasTriplet {
	
	
	public static boolean m1(int[]a,int n) {
		
		for(int i=0;i<n-2;i++) {
			
			for(int j=i+1;j<n-1;j++) {
				
				for(int k=i+2;k<n;k++) {
					
					int x=a[i];
					int y=a[j];
					int z=a[k];
					
					if(x*x + y*y==z*z) {
						
						System.out.println(x +" "+ y +" "+ z);
						
						return true;
					}
				}
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		
		int []a= {1,2,6,7,8,9,10,11,12,13,14};	
		
		int size=a.length;
		
		if(m1(a,size)==true) {
			System.out.println("There is Pythagoras triplet");
		}
		else
		{
			System.out.println("There is Pythagoras triplet");
		}
	}

}
