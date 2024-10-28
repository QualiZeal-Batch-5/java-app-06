package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {


    public String defineFibonacciSeries() {
        return "The Fibonacci sequence is a series where each number is the sum of the two preceding ones, usually starting with 0 and 1.";
    }

    
    public  String generateFibonacciSeries(int limit) {
        if (limit < 0) {
            return "-1"; // Return -1 if the input is negative
        } else if (limit == 0) {
            return "-2"; // Return -2 if the input is zero
        }

        String series = ""; 
        int a = 0, b = 1;

     
        series += a; 
        if (limit > 0) {
            series += ", " + b;
        }

      
        while (b <= limit) {
            int next = a + b;
            if (next > limit) {
                break;
            }
            series += ", " + next;
            a = b; 
            b = next;
        }

        return series; 
    }
}

