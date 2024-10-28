package com.qualizeal.javaapp06.operation;
 
public class FibonacciSeries {
	public String defineFibonacciSeries() {
		return "FibonacciSeries";
	}
	public String generateFibonacciSeries(int num1){
		if(num1 < 0){
			return "-1";
		}else if(num1 == 0){
			return "-2";
		}else{
			String result="0";
			int a=0,b=1;
			while(b <= num1){
				result=result+", "+b;
				int next=a+b;
				a=b;
				b=next;
				}
				return result;
			}
			
		}
}
 