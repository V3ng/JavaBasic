package com.sourceit.java.basic.gutorov.hometask11;


import com.sourceit.java.basic.Lesson11.TextStatistics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class TextStatisticsNew extends TextStatistics{
	//private static String text;

	public TextStatisticsNew(String text) {
		super(text);
	}
	
	public static void main (String [] args){
		//TextStatisticsNew text = new TextStatisticsNew("Buddy you're a boy make a big noise Playin' in the street gonna be a big man some day You got mud on yo' face ");
//	
//		System.out.println(text.getText());
//		System.out.println("Frequency of " + " " + text.getCharFrequency() + "%");  
//		System.out.println("Char count of "+ letter + " " + text.getCharCount(letter));
//		System.out.println(text.words());
//		text.words();
	}
	
	
	public String getText(String text) {
				return text;
			}

	@Override
	public int getCharFrequency(char c) {
		char [] arrOfChars = getText().toCharArray();
		int counter = getCharCount(c);    
		return (counter*100)/arrOfChars.length;
	}

	@Override
	public int getCharCount(char c) {
		char [] arrOfChars = getText().toCharArray();
		int counter =0;
		if (arrOfChars.length >0) {
		for (int i = 0; i < arrOfChars.length; ++i){
			if (arrOfChars[i] == c) {
				++counter;
			}
			else {System.out.println("Incoorrect data");
	    	break;
		}	
		}
		}
		return counter;
	}

	@Override
	public Map<Character, Integer> getChars() {
		Map<Character, Integer> map = new TreeMap <> ();
		char [] arrOfChars = getText().toCharArray();
		for (int i = 0; i < arrOfChars.length; ++i){
			char c = arrOfChars[i];
			if (map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}
			map.put (c, 1);
		}
		return map ;         
	}


	@Override
	public List<String> words() {
		String t = " ";
		char [] arrOfChars = getText().toCharArray();
		ArrayList <String> myList = new ArrayList<String>();
		for (int i = 0; i < arrOfChars.length; ++i){
			char c = arrOfChars[i];

			while (c != ' ' ){
				t = (t + c);}
			myList.add(t);
			System.out.println(t);
			t = "";

		}
		return myList;
	}

	@Override
	public int getMostPopularCharCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getLeastPopularCharCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char[] getCharByCount(int count) {
		return null;
	}

}


