package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {
	String s = "";

	public String defFibonacciSeries() {
		return "FibonacciSeries";
	}

	public int generateFibonacciSeries(int n) {
		if (n <= 1) {
			return n;
		}
		return generateFibonacciSeries(n - 1) + generateFibonacciSeries(n - 2);
	}
}
