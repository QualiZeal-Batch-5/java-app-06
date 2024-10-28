package com.qualizeal.javaapp06.operation;
public class FibonacciSeriesApp {
	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		 String res = fibonacciSeries.generateFibonacciSeries(4);
		 System.out.println(res);
	 }
}