package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {
	
	public String defineFibonacciSeries() {
		return "The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.";
	}
	
	public String generateFibonacciSeries(int num) {
		
		String answer = "0, 1";
		int first = 0;
		int second = 1;
		int sum = sum = first + second;
		first = second;
		second = sum;
		while(second < num) {
			answer = answer + ", " + String.valueOf(sum);
			sum = first + second;
			first = second;
			second = sum;
		}
		
		if(num < 0) {
			answer = "-1";
		}
		
		if(num == 0) {
			answer = "-2";
		}
		
		return answer;
	}
}
