package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {
	public String defineFibonacciSeries() {
		return "The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones.";
	}
	
	public String generateFibonacciSeries(int num1) {
		if(num1 < 0) {
			return "-1";
		}
		else if(num1 == 0) {
			return "-2";
		}
		else {
			String result = "0, 1";
			int a=0,b=1,i=2,c=0;
			int temp=num1;
			while((c+a) <=temp) {
				c=a+b;
				a=b;
				b=c;
				i=i+1;
				result = result+','+' '+c;
			}
			return result;
		}
	}

}
