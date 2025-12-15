package com.constructor;

public class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	
	
	public static void main(String[] args) {
		Person P1 = new Person("Raj", 21);
		Person P2 = new Person("Riya", 25);
		System.out.println("P1 :Name -" + P1.name + ", Age - " + P1.age);
		System.out.println("P2 :Name -" + P2.name + ", Age - " + P2.age);
		
	}

}
