package com.practice;

public class Character {
	
	void check(char ch) {
		if (ch == 'a' ||  ch == 'e'|| 
			ch == 'i' || ch == 'o' ||
			ch == 'u' ||
			
			ch == 'A' || ch== 'E' ||
			ch == 'I' || ch == 'O'||
			ch == 'U') {
			System.out.println("Character is Vowel :"+ ch);
			
		}else
			System.out.println("Character is Consonant : " + ch);
	}
	public static void main(String[] args) {
		Character c = new Character();
		c.check('a');
		c.check('B');
	}

}
