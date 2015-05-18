package com.sourceit.java.basic.gutorov.hometask3;

import com.sourceit.java.basic.gutorov.hometask3.Reader;




public class Cell{
    boolean wall;
	static boolean leftBorder;
	static boolean rightBorder;
	static boolean upBorder;
	static boolean bottomBorder;
   
    public  boolean boolean_random () {
    	
    int r;
    java.util.Random random = new java.util.Random();
    r= random.nextInt();
    	if (r < 0.51)   // IMHO walls should be less than just decrease 0.51 
    		wall = true;
    	else wall = false; 
    return wall;
    }
    
    public  Cell cell () {
    
    Cell.leftBorder = boolean_random();
    Cell.rightBorder = boolean_random();
    Cell.upBorder = boolean_random();
    Cell.bottomBorder = boolean_random();
    return cell();
    }

	public Cell[][] getMaze(){
		
		 int i, j, rows, columns;
	        Cell[][] array = null ;

	        Reader r = new Reader();
	        r.scan();
	        Cell c = new Cell();
	        c.cell();  
	        columns = r.i;
	        rows = r.j;

	       
	        int[][] Cell = new int[rows][columns];
	   
	                
	        for (i = 0; i < rows; ++i)
	            for (j = 0; j < columns; ++j)
	                array[i][j] = c.cell();
	        return array;
	}

}