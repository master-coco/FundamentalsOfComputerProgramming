package com.ncu;

import java.io.*;
import java.util.*;


 public class Display
{

	public void callDisplay() throws IOException 
	 {
	 	String fd;
		Scanner s=new Scanner(System.in);
		try{
			System.out.println("Enter File name(ID.txt):");
			fd=s.nextLine();
			FileReader f2 = new FileReader(fd);
			BufferedReader b2 = new BufferedReader(f2);
        	String rec;

	    	System.out.println(" ------------------------------------------------------------- ");
	    	System.out.println("|						NOTICE  						   |");
	    	System.out.println(" ------------------------------------------------------------- ");

			
			while((rec=b2.readLine())!=null)
			{
					System.out.println(rec);
				}

	    		
	    	System.out.println("|	                                            	          |");
	    	System.out.println(" ------------------------------------------------------------- ");
	    	f2.close();
	    	b2.close();  
		}

		catch(Exception e){
			System.out.println(e);
		}
		  		
    		
    }
}

