package com.practice.whileloop;
//print count of even No 1 to 25 no. 
public class P14 {
	
	public static void main(String[] args) {
		int i = 1;
		int count =0;
		while(i <=25) {
			if (i % 2==0) {
				count= count +i;
				
			}i++;
		}
		
		System.out.println("Count of even numbers from 1 to 25 is: " + count);
	}
	

}
