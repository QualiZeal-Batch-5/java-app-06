package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {
	public String defineFibonacciSeries() {
		return "FibonacciSeries is defined as the sequence of numbers in which each number in the sequence is equal to the sum of two numbers before it.";
	}

	public String generateFibonacciSeries(int number1) {
		if (number1 < 0) {
			return "-1";
		} else if (number1 == 0) {
			return "-2";
		} else {
			String result = "0, 1";
			int a = 0, b = 1, i = 2, c = 0;
			while ((c + a) <= number1) {
				c = a + b;
				a = b;
				b = c;
				i = i + 1;
				result = result + ',' + ' ' + c;
			}
			return result;
		}
	}
}
