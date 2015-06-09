package com.sourceit.java.basic.gutorov.lesson19.lab;


import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Arrays;
import java.util.List;


public class WGet {
	
	public static final String[] COMMANDS = {"Save page", "Display title", "Find a word", "List all URL's on the page"};


	
	public static void main(String[] args) throws Exception {
		
		 URL url = null;
		    InputStream is = null;
		    BufferedReader br;
		    String line;
		    StringBuilder sb = null;
		    PrintWriter out = null;
		    String title;
		    String[] httpArr = null;
		    
		    

	        
	        
		    try {
		        url = new URL("http://vk.com/mnml_techno_music");
		        is = url.openStream();
		        br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		        out = new PrintWriter(new FileWriter("Output.txt"));
		        
		        while ((line = br.readLine()) != null) {
//		            System.out.println(line);
			         out.println(line);
			         if (line.contains("<title>")){
			        	title = line;
			        	System.out.println(title);
			         }
			         if (line.contains("http://")){
//			            	line.split("http://");
				        	httpArr = line.split("http://");
				        	String[] a = httpArr[1].split("\"");
				        	System.out.println("http://" + a[0]);
				         }
		            
		        }

		    }catch(Exception ex){
		    	System.out.println("Smth. wrong" + ex);
		    } finally {
		    	if (is != null){
		    		try {
						is.close();
					} catch (IOException e) {}
		    	}
		    	
				List<String> q = Arrays.asList(httpArr);
				for (String l:q){
					System.out.println(l);
				}    	
		System.out.println("Hi");
		
		if (args.length ==0){
			System.out.println(getInstruction());
			return;
		}
		
		
		String command = url.toString();
//			String command = args[0];
			String currentURL;
			if("-i".equals(command)){
				//TODO ask for URL
				System.out.println("Enter an URL:");
		} else if(!command.startsWith("http")){
			System.out.println(getInstruction());
			return;	
		}else currentURL = command;
		}
		
		System.out.println("Select what to do next:");
		for(int i = 0; i < COMMANDS.length; i++){
			System.out.println((i+1) + ") " + COMMANDS[i]);
		}
		
		int choise = -1;
		//TODO ask for input
		choise = Integer.parseInt(args[0]);
		
		
		executeCommand(choise);
		TextDoc.displayTitle();
		TextDoc.savePage();
        TextDoc.showHttp();
}
	
		private static void executeCommand(int commandNumber) throws Exception{
			switch (commandNumber) {
			case 1:
				TextDoc.savePage();
				break;
			case 2:
				System.out.println();
				break;
			default:
				break;
			}
		}
	

	
	
	public static String getInstruction(){
		return 			"Usage: webadress\n"+
		                "       or -i\n"+
		                "Example: http://google.com\n";
	}
	
}
