package com.sourceit.java.basic.gutorov.lesson19.lab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextDoc {

	static BufferedReader inputStream;
	
	public static void openingStream(){
		try {
			inputStream = new BufferedReader(new FileReader("Output.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void savePage (){
		System.out.println("Page saved at:");
        System.out.println("C:/Users/Антон/git/JavaBasic42/Output.txt ");
	}
	
	public static void displayTitle() throws IOException{
		String l;

		while ((l = inputStream.readLine())!= null)
			l.split("<title>");
		System.out.println(l);

	}
	
	public static void showHttp () throws Exception{
		String l;
		String[] httpArr;

		while ((l = inputStream.readLine())!= null)
			 if (l.contains("http://")){
		        	httpArr = l.split("http://");
		        	String[] a = httpArr[1].split("\"");     //TODO more correct split
		        	System.out.println("http://" + a[0]);
	         }
    	}
}
