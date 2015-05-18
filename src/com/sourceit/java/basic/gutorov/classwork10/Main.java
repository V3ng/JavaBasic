package com.sourceit.java.basic.gutorov.classwork10;


public class Main {


	public static void main(String[] args) {
	
		if (args.length<=1){
			System.out.println ("Error");
			return;
		}
		Integer sum = 0;
		for (int i=0; i < args.length; ++i){
			int number = Integer.parseInt(args[i]);
			sum += number;
			
		}

		System.out.println ("Sum = " + sum);
	}







	public static void array (String [] args){
		
		String s = args [0];
		
		StringBuilder result = new StringBuilder();
		
		char [] charArray = s.toCharArray();
		// Var #1
		for (int i=s.length()-1 ; i >= 0 ; i--){
			result.append(charArray[i]);
			
		}
		//Var #2
		for (char c: s.toCharArray()){
			result.insert(0, c);
		}
	    //Var #3
		for (int i=s.length()-1 ; i >= 0 ; i--){
			result.append(s.charAt(i));
		}
		//Var #4
		for (int i= 0 ; i < s.length()-1 ; i++){
			result.append(s.charAt(s.length()-1));
		}
		System.out.println (result);
	}
}