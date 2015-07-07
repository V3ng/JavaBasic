package com.sourceit.java.basic.gutorov.classwork26;


class DebuggingExercise2
{ 
	   public static void main(String[] args) 
	    { 
	        Account  a = new Account ("$name") ;
	        a.deposit(100); 
	        System.out.println(a.getOwner() + " has $" + a.getBalance()); 
	    } 
	}

