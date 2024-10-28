package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {
	 public String defineFibonacciSeries() {
	        return "The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.";
	    }

	    public String generateFibonacciSeries(int number) {
	        
	        if (number < 0) {
	            return String.valueOf(-1);
	        }
	        
	        if (number == 0) {
	            return String.valueOf(-2);
	        }

	        StringBuilder result = new StringBuilder();
	        int a = 0, b = 1;
	        
	        
	        while (a <= number) {
	            if (result.length() > 0) {
	                result.append(", ");
	            }
	            result.append(a);
	            int next = a + b;
	            a = b;
	            b = next;
	        }
	        
	        return result.toString();
	    }
	}


