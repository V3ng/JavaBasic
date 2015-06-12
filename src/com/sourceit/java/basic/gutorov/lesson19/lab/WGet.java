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
	
	public static final String[] COMMANDS = {"Web server available", "Save page", "Display title", "Find a word", "List all URL's on the page"};


	

	public static void main(String[] args) throws Exception {
		
		 URL url = null;
		    InputStream is = null;
		    BufferedReader br;
		    String line;
		    StringBuilder sb = null;
		    PrintWriter out = null;
		    String title;
		    String[] httpArr = null;
			String currentURL = "";  
		    
		    
			System.out.println("Hi");
			
			if (args.length ==0){
				System.out.println(getInstruction());
				return;
			}
			
			
//			String command = url.toString();
	    		String command = args[0];

				if("-i".equals(command)){
					//TODO ask for URL
					System.out.println("Enter an URL:");
			} else if(!command.startsWith("http")){
				System.out.println(getInstruction());
				return;	
			}else currentURL = command;
				  url = new URL( currentURL);
			
			


	        
	        
		    try {
		        is = url.openStream();
		        br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		        out = new PrintWriter(new FileWriter("Output.txt"));
		        
		        while ((line = br.readLine()) != null) {
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
		    	System.out.println("Smth. wrong  " + ex);
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
		    }
		    
			System.out.println("Select what to do next:");
			for(int i = 0; i < COMMANDS.length; i++){
				System.out.println((i+1) + ") " + COMMANDS[i]);
			}
//----------temp data, still needed--------------------
//			TextDoc.displayTitle();
//			TextDoc.savePage();
//	        TextDoc.showHttp();
//------------------------------------------------------			
			int choise = -1;

			br = new BufferedReader(new InputStreamReader(System.in));
			choise = Integer.parseInt(br.readLine());
			

			executeCommand(choise);


}
	
		private static void executeCommand(int commandNumber) throws Exception{
			switch (commandNumber) {
			case 1:
				System.out.println("Temporary unavailable. Sorry =( ");
				break;
			case 2:
				TextDoc.savePage();
				break;
			case 3:
				TextDoc.displayTitle();
				break;
			case 4:
				System.out.println("Temporary unavailable. Sorry =( ");
				break;
			case 5:
				TextDoc.showHttp();
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
