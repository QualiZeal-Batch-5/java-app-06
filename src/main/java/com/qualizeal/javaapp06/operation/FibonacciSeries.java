package com.qualizeal.javaapp06.operation;

public class FibonacciSeries {
	
	public String defineFibonacciSeries() {
		return "Fibonacci sequence is a type series where each number is the sum of the two that precede it.";
	}
	
	public String generateFibonacciSeries(int number) {
		
		int a = 0;
		int b = 1;
		int next = 0;
		String str = " "; 
		
		
        if (number < 0) {
            return "-1"; 
        }
        if (number == 0) {
            return "-2"; 
        }
        else {
        while (a <= number) {
            str = a + ", ";
            int next = a + b;
            b = a;
            a = next;
        }
        }
        
        str.trim();
        str.trim();
        
        

        return str ;
    
}

}
