package com.sourceit.java.basic.gutorov.lesson19.lab;

public class WGet {

	
	public static void main(String[] args) {
		System.out.println("Hi");
		
		if (args.length ==0){
			System.out.println(getInstruction());
			return;
		}
		
		String command = args[0];
		
		if ("-i".equals(command)){
			
		} else {
			
		}
		
		System.out.println("Choose what to do next:");
		System.out.println("1) Save page;");
		System.out.println("2) Display title;");
		System.out.println("3) Find a word;");
		System.out.println("4) List all URL`s on the page;");
	}

	
	
	public static String getInstruction(){
		return 			"Usage: webadress\n"+
		                "       or -i\n"+
		                "Example: http://google.com\n";
	}
}
