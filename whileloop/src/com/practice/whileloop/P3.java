package com.practice.whileloop;
// Print 1 to 100 Even Number
public class P3 {

	public static void main(String[] args) {
		int i = 1;
			while( i <= 100)	{
				i++;
				if ( i % 2 ==0) {
					System.out.print(i+ " ");
				}
			}
	}
}
