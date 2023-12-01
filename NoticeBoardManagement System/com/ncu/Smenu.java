package com.ncu;
import com.ncu.*;

import java.io.*;
import java.util.*;

class Smenu
{
	public void showsmenu() throws IOException{
	
	Scanner str = new Scanner(System.in);
        String v = "y";        
        int o;
        try{
        	 while( v.equalsIgnoreCase("y") ) {        	
        	System.out.println("\n\n------------------ NOTICE BOARD MANAGEMENT SYSTEM ----------------------\n\n");
        
	        System.out.println("1 ===> Display Notice");
	        System.out.println("2 ===> Search for notice ");
	        
	        System.out.print("\n\n");
	        System.out.println("Enter your Choice:");
	        o = str.nextInt();
	        
	        
	        if( o==1) {
	       		Display d1=new Display();
	       		d1.callDisplay();
	        } 
	        
	        else if(o==2) {
	        	Search se=new Search();
	        	se.callSearch();
	        }		 
		else{
			System.out.println("Wrong input\n Check menu again.");
		}    	
	        System.out.println("Do you want to check the menu again? \t Y/N");
	        v = str.next();
	 }
        }
       

	 catch(Exception e){
	 	System.out.println(e);
	 }
	       	
        }
    }
