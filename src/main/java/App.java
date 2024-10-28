package com.qualizeal.javaapp06.operation;

import com.qualizeal.javaapp06.operation.FibonacciSeries;

public class App{
	public static void main(String[] args){
		
		FibonacciSeries fibonacciSeries =  new FibonacciSeries();
		
		String result1 = fibonacciSeries.generateFibonacciSeries(20);
		
		System.out.println(result1);
		
	}
}