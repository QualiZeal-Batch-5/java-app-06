package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {
	public String defineFibonacciSeries() {
		return "sequence of numbers in which each number in the sequence is equal to the sum of two numbers before it.";
	}
	
	public String generateFibonacciSeries(int num) {
		if(num < 0) {
			return "-1";
		}
		
		else if(num == 0) {
			return "-2";
		}
		
		else {
			String result = "0, 1";
			int num1 = 0,num2 = 1,i = 2,next = 0;
			while((next + num1) <= num) {
				next = num1 + num2;
				num1 = num2;
				num2 = next;
				i = i+1;
				result = result + ',' + ' ' + next;
			}
			return result;
	     }
	        
	}
		
	
		
}
