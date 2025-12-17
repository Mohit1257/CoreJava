package com.practice;

public class Sumofeven {

	
	void sum(int a, int b) {
		if (a % 2==0 && b % 2 ==0) {
			int sum=a +b;
			System.out.println(" Sum of Even Number is: "+ sum);
		}else {
			System.out.println("Both numbers are not even, sum not possible");
		}
	}
	public static void main(String[] args) {
		Sumofeven n= new Sumofeven ();
		n.sum(2, 4); // sum Of Even Num
		n.sum(3, 4); // Not Possible 
	}
}
