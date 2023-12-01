package com.ncu;

import java.io.*;
import java.util.*;

public class Update{

            public void callupdate() throws IOException {

                try{
                String newn, rec, id,rec1;
                String fd;
                Scanner s=new Scanner(System.in);
                System.out.println("Enter File name(ID.txt):");
                fd=s.nextLine();
                File f1 = new File(fd);
                File f2=new File("C:\\Users\\ria_s\\OneDrive\\Desktop\\Notice\\notice3.txt");
                
                BufferedReader br = new BufferedReader( new FileReader(f1) );
                BufferedWriter bw = new BufferedWriter( new FileWriter(f2) );
                
                System.out.println("\t\t Update Notice\n\n");       
                System.out.println("Enter the Notice ID: ");
                    id = s.nextLine();               
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
           
                System.out.println("Enter the new Notice: ");
                newn = s.nextLine();    
                
                BufferedReader br2 = new BufferedReader( new FileReader(f1) );
                    
                while( (rec1 = br2.readLine() ) != null ) {              
                    if(rec1.contains(id)) {
                        bw.write(id+"-"+newn);
                    } else {
                    
                        bw.write(rec1);  
                    }               
                    bw.flush();
                    bw.newLine();
                }
                
                bw.close();
                br2.close();            
                f1.delete();            
                boolean success = f2.renameTo(f1);          
                System.out.println(success);

                System.out.println("------------------------- SUCCESSFULLY UPDATED NOTICE!! -------------------------------");
            }
                
                catch(Exception e){
                    System.out.println(e);
                }        
            
    }
    }