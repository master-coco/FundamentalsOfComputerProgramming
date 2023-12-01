package com.ncu;

import java.io.*;
import java.util.*;

public class Search
{
   public void callSearch() throws IOException {
            try{
               String id,rec;
            Scanner strInput = new Scanner(System.in);
            String fd;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter File name(ID.txt):");
            fd=s.nextLine();
            FileReader f = new FileReader(fd);
            BufferedReader br = new BufferedReader(f);
            
                        
            System.out.println("\t\t Search notice\n");
        
            
            System.out.println("Enter the notice id: ");
            id = strInput.nextLine();

            System.out.println(" ---------------------------------------------- ");
            System.out.println("|\tNotice                         |");
            System.out.println(" --------------------------------------------- ");
            
            while( ( rec = br.readLine() ) != null ) {
                
                StringTokenizer st = new StringTokenizer(rec,",");
                if( rec.contains(id) )
                 {
                    
                    System.out.println(st.nextToken());
                
                }             
                
            }
            
            System.out.println("|                                                             |");
            System.out.println(" ------------------------------------------------------------- ");
            
            br.close();
            }

            catch(Exception e){
               System.out.println(e);
            }
            
                   
    }
    }