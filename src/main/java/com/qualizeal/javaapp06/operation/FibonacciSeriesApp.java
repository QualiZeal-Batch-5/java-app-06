package com.qualizeal.javaapp06.operation;

public class FibonacciSeriesApp {
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
	
		String result = fibonacciSeries.generateFibonacciSeries(6);
		System.out.print(result);
	}
}
