package com.sourceit.java.basic.gutorov.hometask11;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TextStatisticsNew extends TextStatistics{

	public TextStatisticsNew(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String [] args){
		TextStatisticsNew text = new TextStatisticsNew("Buddy you're a boy make a big noise Playin' in the street gonna be a big man some day You got mud on yo' face ");
	
		char letter = 'b';
		System.out.println(text.getCurrentText());
		System.out.println("Frequency of " + letter + " " + text.getCharFrequency(letter) + "%");  
		System.out.println("Char count of "+ letter + " " + text.getCharCount(letter));
		System.out.println(text.words());
		text.words();
	}
	
	
	private String getCurrentText() {
				String result = getText().toLowerCase();
				result.replaceAll("^[a-z]+", "");
				return result;
			}

	@Override
	public int getCharFrequency(char c) {
		char [] arrOfChars = getCurrentText().toCharArray();
		//System.out.println(arrOfChars.length);
		int counter =0;         // Counter of char
		int freq = 0;               // Frequency of char
		for (int i = 0; i < arrOfChars.length; ++i){
			
			if (arrOfChars[i] == c) {
				++counter;
			}
		}
		//System.out.println(counter);
		freq = (counter*100/arrOfChars.length);
		return freq;
	}

	@Override
	public int getCharCount(char c) {
		char [] arrOfChars = getCurrentText().toCharArray();
		int counter =0;
		for (int i = 0; i < arrOfChars.length; ++i){
			if (arrOfChars[i] == c) {
				++counter;
			}
		}
		return counter;
	}

	@Override
	public Map<String, Integer> getChars() {
		String s = null;
		Map<String, Integer> map = new TreeMap <> ();
		char [] arrOfChars = getCurrentText().toCharArray();
		for (int i = 0; i < arrOfChars.length; ++i){
			char c = arrOfChars[i];
			if (map.containsKey(c)){
				s = toString(c);  
				System.out.println(s);//Needed Char2String
				map.put(s, map.get(s)+1);
			}
			map.put (s, 1);

		}
		return map ;         
	}

	private String toString(char c) {
		
		String s = toString(c) ;
		return s;
		
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
	public char getCharByCount(int count) {
		// TODO Auto-generated method stub
		return 0;
	}

}
