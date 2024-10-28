package com.qualizeal.javaapp06.operation;
public class FibonacciSeries{
	public String defineFibonacciSeries(){
      return "FibonacciSeries";
		
    }
	public String generateFibonacciSeries(int num){
		if(num<0){
			return "-1";
		}
		
		else if(num == 0){
			return "-2";
		}
		
		else{
			String result = "0, 1";
			int a=0,b=1,i=2,c=0;
			while((c+a) <= num) {
				c=a+b;
				a=b;
				b=c;
				i=i+1;
				result = result+','+' '+c;
			}
			return result;
		}
		
	}
}