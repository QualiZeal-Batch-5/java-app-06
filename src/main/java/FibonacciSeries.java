package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {
	public String defineFibonacciSeries() {
		return "Fibonacci series";
	}
	
	public int generateFibonacciSeries(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        return generateFibonacciSeries(n - 1) + generateFibonacciSeries(n - 2);
	    }
}
	    