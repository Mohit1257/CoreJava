package com.practice;

public class Pass {
	
	void check(int marks) {
		if (marks >= 35 ) {
			System.out.println(" Pass");
		
		}else {
			System.out.println(" fail ");
		}
	}
	public static void main(String[] args) {
		Pass c = new Pass();
		c.check(35); // pass
		c.check(93); // pass
		c.check(24);// fail
	}

}
