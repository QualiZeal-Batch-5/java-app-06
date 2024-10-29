package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {
	public String defineFibonacciSeries() {
		return "A Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones";
	}
 
	public String generateFibonacciSeries(int num) {
		if (num < 0) {
            return "-1";
        }
        if (num == 0) {
            return "-2";
        }
        else {
        	String result = "0, 1";
        	int a = 0, b = 1, c = 0;
        	while ((c+a) < num) {
        		c = a + b;
        		a = b;
        		b = c;
        		
        		result += ", " + c;
        	}
        	return result;			
        }
		
	}
}

