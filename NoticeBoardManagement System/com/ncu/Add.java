package com.ncu;

import java.util.*;
import java.io.*;

public class Add
{
  public void callAdd()throws IOException{
    try{
        String fd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter File name(ID.txt):");
        fd=sc.nextLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(fd,true));
            
        String notice,id;
        System.out.println("Enter ID:");
        id=sc.nextLine();
        bw.write(id+"\n");
        System.out.println("Enter Notice:");
        while(sc.hasNext()){
           bw.write(sc.nextLine());
         }
                
                  
        bw.flush();
        bw.newLine();
        bw.close();

        System.out.println("\n\n-------------- NOTICE SUCCESSFULLY ADDED!! ----------------\n\n");
    }
   	catch(Exception e){
      System.out.println(e);
    }
  }
}
