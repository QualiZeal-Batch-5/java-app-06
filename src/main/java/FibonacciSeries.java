package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {
	int num;
	
	public String defineFibonacciSeries() {
		return "Fibonacci Series";
		}
		
	public String generateFibonacciSeries(int num) {
		if(num < 0) {
			return "-1";
		}
		else if(num == 0) {
			return "-2";
		}
		else {
			String result = "0";
			int num1 = 0;
			int num2 = 1;
				while (num2 <= num) {
					result += ", " + num2;
					int next = num1 +num2;
					num1 = num2;
					num2 = next;
				}
			return result;	
		}
		
	}	
}