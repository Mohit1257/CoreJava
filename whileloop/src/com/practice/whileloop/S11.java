package com.practice.whileloop;
//5) Generate the Series... 1 10 100 1000.
public class S11 {
	public static void main(String[] args) {
		int i = 1;

        while (i <= 1000) {
            System.out.print(i + " ");
            i = i * 10;
        }
    }

}
