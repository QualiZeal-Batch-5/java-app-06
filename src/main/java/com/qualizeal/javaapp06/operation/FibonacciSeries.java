package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {
	public String defineFibonacciSeries() {
		return "Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones.";
	}
	public String generateFibonacciSeries (int num) {
		if (num<0) {
			return "-1";
		}
		else if (num==0) {
			return "-2";
		}
		else {
			String result = "0";
			int first = 0, second = 1;
			while(second<num) {
				result += ", "+ second;
				int Third = first + second ;
				first = second;
				second = Third;
			}
			return result;
		}
	}
}
