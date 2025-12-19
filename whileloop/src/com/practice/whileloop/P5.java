package com.practice.whileloop;
//Print sum of 1 to 50 Odd Numb.
public class P5 {
	
	public static void main(String[] args) {
		 int i = 1;
		int sum = 0;
		 while(i <=50) {
			 if (i %2 !=0) {
				sum = sum + i;
				
			}i++;
			
		 }System.out.println("Sum of odd numbers from 1 to 50 is: "+ sum);
	}

}
