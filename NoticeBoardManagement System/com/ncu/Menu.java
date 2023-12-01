package com.ncu;
import com.ncu.*;

import java.io.*;
import java.util.*;

class Menu
{
	public void showmenu() throws IOException{
	
	Scanner str = new Scanner(System.in);
        String v = "y";        
        int o;
        try{
        	 while( v.equalsIgnoreCase("y") ) {        	
        	System.out.println("\n\n------------------ NOTICE BOARD MANAGEMENT SYSTEM ----------------------\n\n");
        
	        System.out.println("1 ===> Add notice ");
	        System.out.println("2 ===> Display All notices ");	
	        System.out.println("3 ===> Delete notices ");
	        System.out.println("4 ===> Search for notice ");
	        System.out.println("5 ===> Update notice ");	        
	    
	        System.out.print("\n\n");
	        System.out.println("Enter your Choice:");
	        o = str.nextInt();
	        
	        if(o==1) {
	       		Add a1=new Add();
	       		a1.callAdd();
	        } 
	        else if( o==2) {
	       		Display d1=new Display();
	       		d1.callDisplay();
	        } 
	        else if( o==3) {
	        	
	       		Delete del=new Delete();
	       		del.callDelete();
	        }	
	        else if(o==4 ) {
	        	Search se=new Search();
	        	se.callSearch();
	        }	
	        else if( 0==5 ) {
	        	Update u=new Update();
	        	u.callupdate();
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
