package com.practice.whileloop;
// print count of odd No 1 to 25 No.
public class P15 {
	
	
	public static void main(String[] args) {
		int i = 1;
		int count =0;
		while (i <=25) {
			if (i %2 ==0) {
				count++;
			}
			i++;
		}
		
		System.out.println(" Count of Odd Number is: "+ count);
	}

}
