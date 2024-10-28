package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {
	public String defineFibonacciSeries() {
		return "FibonacciSeries:Series of numbers where each number is the sum of the two numbers that come before it.";
	}
	
	public String generateFibonacciSeries(int number) {
		if(number < 0) {
			return "-1";
		}
		else if(number == 0) {
			return "-2";
		}
		else {
			String result = "0, 1";
			int num1=0,num2=1,next=0,count=2;
			while((next+num1) <=number) {
				next=num1+num2;
				num1=num2;
				num2=next;
				count=count+1;
				result = result+','+' '+next;
	        }
			return result;
		}
		
	}

}
