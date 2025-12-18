package com.practice.forloop;

//  print sum of odd and even no.
public class Nine {
	
	public static void main(String[] args) {
		
		int evensum =0;
		int oddsum=0;
		for(int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				evensum +=i;
			}else {
				oddsum +=i;
			}
		}
		System.out.println("Sum of Even Numbers = " + evensum);
		System.out.println("Sum of Odd Numbers  = " + oddsum);
	}

}
