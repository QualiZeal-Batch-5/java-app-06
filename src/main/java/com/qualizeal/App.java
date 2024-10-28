package com.qualizeal;

import com.qualizeal.javaapp06.operation.FibonacciSeries;

public class App {
	public static void main(String[] args) {
		FibonacciSeries fibonacci = new FibonacciSeries();
		System.out.println(fibonacci.generateFibonacciSeries(20));
		System.out.println(fibonacci.generateFibonacciSeries(-20));
		System.out.println(fibonacci.generateFibonacciSeries(0));
	}
}