package com.sourceit.java.basic.gutorov.classwork26;


class Marker 
{ 
    public Marker() 
    { 
        // no initialisation to do 
    } 

    public void printGrade(int mark) 
    { 
        if (mark >= 85){ 
            System.out.println("High Distinction"); 
            return;
        	}
        if (mark >= 75){ 
            System.out.println("Distinction"); 
            return;
    	}
        if (mark >= 65){ 
            System.out.println("Credit");
        return;
	}
        if (mark >= 50){ 
            System.out.println("Pass"); 
        return;
}
        if (mark >= 45){ 
            System.out.println("Concessional Pass"); 
        return;
	}
        if (mark < 45){ 
            System.out.println("Fail"); 
        return;
	}
    } 
} 