package com.qualizeal;

import com.qualizeal.javaapp06.operation.FibonacciSeries;

public class App {
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		String result = fibonacciSeries.generateFibonacciSeries(6);
		System.out.print(result);
	}
}