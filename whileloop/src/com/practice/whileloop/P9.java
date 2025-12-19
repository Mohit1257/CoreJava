package com.practice.whileloop;
//  print sum of odd and even no.
public class P9 {

	public static void main(String[] args) {
		int i= 1;
		int even = 0;
		int odd=0;
		while(i <= 100) {
			if (i % 2 ==0) {
				 even= even +i	;
			}else {
				 odd = odd + i;
			}
			
		i++;
		}
		System.out.println("Even Sum is: "+ even);
		System.out.println("Odd Sum is: "+ odd);
	
		
	}
}
