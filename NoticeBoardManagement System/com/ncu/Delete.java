package com.ncu;

import java.io.*;
import java.util.*;

public class Delete
 {

    public void callDelete() throws IOException{
         try{
            String id,rec;
         Scanner strInput=new Scanner(System.in);

        String fd;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter File name(ID.txt):");
        fd=s.nextLine();
        File f1 = new File(fd);
        BufferedReader br = new BufferedReader( new FileReader( f1 ) );
        
        System.out.println("\t\tDELETE NOTICE\n");
        System.out.println("Enter Notice ID:");
            
        id=strInput.nextLine();

        while( ( rec = br.readLine() ) != null )
            {
                if( rec.contains(id) ) 
                    continue;
            }
            
        br.close();
        
        f1.delete();

        System.out.println("----------------------- SUCCESSFULLY DELETED NOTICE!! ----------------------");
         }
         
         catch(Exception e){
            System.out.println(e);
         }
            
            
 
    }

        
        }
          

