
package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {

  
    public String defineFibonacciSeries() {
        return "The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.";
    }

    
    public String generateFibonacciSeries(int limit) {
        // Check for negative numbers
        if (limit < 0) {
            return "-1";
        }
        // Check for zero
        if (limit == 0) {
            return "-2";
        }

        StringBuilder fibonacciSeries = new StringBuilder();
        int a = 0, b = 1;

       
        while (a <= limit) {
            fibonacciSeries.append(a);
            fibonacciSeries.append(", ");
            int next = a + b;
            a = b;
            b = next;
        }

        
        if (fibonacciSeries.length() > 0) {
			fibonacciSeries.setLength(fibonacciSeries.length() - 2);
        }

        return fibonacciSeries.toString();
    }
}
