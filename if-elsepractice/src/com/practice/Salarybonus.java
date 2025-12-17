package com.practice;

public class Salarybonus {
	
	void show(int salary) {
		if (salary>= 5000) {
			System.out.println("Eligible For Bonus Current salary is: "+  salary);
		}else {
			System.out.println("Not Eligible For Bonus Current salary is: "+  salary);
		}
	} public static void main(String[] args) {
		Salarybonus s = new Salarybonus();
		s.show(54356);// Eligible
		s.show(4270); // Not Eligible
	}

}
