package com.qualizeal;

import com.qualizeal.javaapp06.operation.FibonacciSeries;

public class App {
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		
		System.out.println(fibonacciSeries.defineFibonacciSeries());
		System.out.println(fibonacciSeries.generateFibonacciSeries(20));
	}
}