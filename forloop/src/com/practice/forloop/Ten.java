package com.practice.forloop;
// print even and odd No 1 to 50
public class Ten {

	public static void main(String[] args) {
		for(int i = 1; i<=50; i++) {
			if (i %2 ==0) {
				System.out.println("Even numb :"+ i);
			}else if (i % 2 !=0) {
				System.out.println("Odd num :"+ i);
			}
		} 
	}
}
