package com.practice;

public class Sumofevenodd {
	 
	
	void sum(int a , int b) {
		 int sum =a+b;
		 if ((a % 2 == 0 && b % 2 !=0) || ( a %2 != 0 && b %2 ==0)) {
			 System.out.println(" Sum Of Even & Odd Num: "+ sum);
			}
			else {
				System.out.println("Sum not possible (both are even or both are odd) ");
			}
		} public static void main(String[] args) {
			Sumofevenodd  x = new Sumofevenodd ();
			x.sum(2, 15); // sum of even & odd
			
			x.sum(15, 12); // sum of odd & even
			
			x.sum(2 , 2); // not possible bcoz same 
		}
		

	}
