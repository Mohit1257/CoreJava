package com.practice.whileloop;
//  Print sum of 1 to 50 EVEN Num. 
public class P6 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
	 while (i <= 50) {
		if (i %2 ==0) {
			sum = sum+i;
			
		}i++;
	}System.out.println(" total sum of 1 to 5 Even Num is: "+sum );
	}
}
