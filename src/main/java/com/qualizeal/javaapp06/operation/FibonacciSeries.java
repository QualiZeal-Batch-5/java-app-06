package com.qualizeal.javaapp06.operation;

public class FibonacciSeries{
	
	public String defineFibonacciSeries(){
      return "Fibonacci sequence is a series of numbers where each number is the sum of the two numbers that come before it";
		
    }
	public String generateFibonacciSeries(int num1){
		if(num1 < 0){
			return "-1";
		}
		
		else if(num1 == 0){
			return "-2";
		}
		
		else{
			String result="0";
			int first = 0,second = 1;
			while(second <= num1){
				result = result + ", " + second;
				int next = first+second;
				first = second;
				second = next;
			}
			return result;
		}
		
	}
}