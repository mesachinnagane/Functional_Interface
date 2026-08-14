package com.functional_Interface;

public class A {

	public static void main(String[] args)
	{
		//Addition
		I add = (a ,b) -> {
			return a+b;
		};
		int addRes=add.m1(2,4);
		System.out.println("Addition is:"+addRes);
		
		
		
		//Substraction
		I sub =(a ,b) -> {
		return a-b;
		};
	    int subRes=sub.m1(3,5);
	    System.out.println("Substraction is:"+subRes);
	    
	    
	    
	    //Multiplication
	    I mul =(a ,b)->{
	    	return a*b;
	    };
	    int mulRes= mul.m1(21,30);
	    System.out.println("Multiplication is:"+mulRes);
	    
	    
	    
	    //Division
	    I div =(a,b) -> { 
	    	return a/b;
	    	};
	    int divRes =div.m1(10,5);
	    System.out.println("Division is:"+divRes);
		
	    
		
	}
}
