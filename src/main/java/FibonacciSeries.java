// Define the package
package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {

    // Method to define a Fibonacci series
    public String defineFibonacciSeries() {
        return "The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.";
    }

    // Method to generate Fibonacci series
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

        // Generate Fibonacci series up to the limit
        while (a <= limit) {
            fibonacciSeries.append(a);
            fibonacciSeries.append(", ");
            int next = a + b;
            a = b;
            b = next;
        }

        // Remove the last comma and space
        if (fibonacciSeries.length() > 0) {
			fibonacciSeries.setLength(fibonacciSeries.length() - 2);
        }

        return fibonacciSeries.toString();
    }
}
