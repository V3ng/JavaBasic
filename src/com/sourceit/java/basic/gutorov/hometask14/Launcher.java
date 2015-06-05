package com.sourceit.java.basic.gutorov.hometask14;

public class Launcher {

	static String text;
	static int firstPar;
	static int secondPar;
	
	public static void main(String[] args) {
		try {
			creatingSubstring(args);
			System.out.println(text.substring(firstPar, secondPar));
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("End of program");
		}
	}

	
	public static void creatingSubstring (String[] args) throws Exception{
		text =args [0];
		if (args.length < 2 || args.length >3)
			throw new Exception ("Incorrect data");
		
		try {
			firstPar = Integer.parseInt(args[1]);
		}
		catch (NumberFormatException ex){
			throw new Exception("Second arg should be integer");
		}
		
		try {
			if (args.length == 3 && secondPar > firstPar )
				secondPar = Integer.parseInt(args[2]);
				else secondPar = (text.length()-1);	
		}
		catch (NumberFormatException ex){
			throw new Exception("Third arg should be integer");
		}
		
		if (secondPar > text.length()-1)
			secondPar = (text.length()-1);
		
		
		if (firstPar > secondPar)
			throw new Exception("Third arg should be bigger then second");
		
		if (firstPar > text.length()-1)
			throw new Exception("Second arg is incorrect");
		
		
		
		
	}
}
