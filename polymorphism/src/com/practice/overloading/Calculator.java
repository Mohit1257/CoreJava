package com.practice.overloading;

public class Calculator {
	
	// Method 1: No parameters
    int add() {
        return 10 + 20;
    }

    // Method 2: Two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method 3: Three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 4: Different data type
    double add(double a, double b) {
        return a + b;
    }

}
