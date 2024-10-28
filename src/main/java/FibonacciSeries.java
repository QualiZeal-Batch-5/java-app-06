package com.qualizeal.javaapp06.operation;
public class FibonacciSeries{
	public String defineFibonacciSeries(){
      return "FibonacciSeries";
		
    }
	public String generateFibonacciSeries(int num1){
		
		if(num1 < 0){
			return "-1";
		}
		
		else if(num1 == 0){
			return "-2";
		}
		
		else{
			
			
			int first=0,second=1,next=0;
			String result="0";
			
			while(second <= num1){
				
				result=result+", "+second;
				next=first+second;
				first=second;
				second=next;
			}
			
			return result;
		}
		
		
	}
}