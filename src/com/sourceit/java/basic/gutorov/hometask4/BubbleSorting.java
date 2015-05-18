package com.sourceit.java.basic.gutorov.hometask4;

public class BubbleSorting {
	
	static int [] array;
	static int set_length=10; //Set length of array; currently is 10
	static int set_counter;

	public static void main (String [] args){
		array = new int [set_length];		
		int i;
		int j;
		int x; //temporary value
		java.util.Random random = new java.util.Random();

		
		for (i = 0; i < set_length; ++i){
			int r = random.nextInt(50);  //Array is randomizing in [0..49]
			array [i] = r;
			System.out.print(array[i] + " " );
		}
				
		for (i = 0; i < set_length; ++i){
			set_counter = 0;
			for (j = 0; j < set_length-1; ++j){ 
				if (array [j] > array [j+1]) {
					x = array [j];
					array[j] = array [j+1];
					array [j+1] = x;
					set_counter++;		
				}
			}	
			if (set_counter == 0)	break;
		}
		System.out.println("");
		System.out.println("Массив отсортирован: ");
		for (i = 0; i < set_length; ++i)
		System.out.print(array[i] + " " );		
	}	
}

