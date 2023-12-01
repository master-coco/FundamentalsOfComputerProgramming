package com.ncu;
import com.ncu.*;

import java.io.*;
import java.util.*;

public class Signup{
	public void callsignup() throws IOException{ 
		int count=0,role;
		Scanner sc = new Scanner(System.in);
		System.out.println("Are you a Student or Teacher?");
		System.out.println("1 ==> Student");
		System.out.println("2 ==> Teacher");
		System.out.println("Enter your choice:");			
		role=sc.nextInt();
		Scanner str=new Scanner(System.in);
		System.out.println("Enter new Username:");
		System.out.println("Enter new Password:");
		try{
			if (role==1) {
				FileWriter f1 = new FileWriter("C:\\Users\\ria_s\\OneDrive\\Desktop\\Notice\\user.txt",true);
			BufferedWriter b1 = new BufferedWriter(f1);
			PrintWriter p1 = new PrintWriter(b1);

			//Writing to file.
			while(str.hasNext() && count<1){
				b1.write(str.nextLine()+"\n");
				count = count+1;
			}
			//Closing all resources.
			p1.close();
			b1.close();
			f1.close();
			count = 0;

			//Opening the password file.
			FileWriter f2 = new FileWriter("C:\\Users\\ria_s\\OneDrive\\Desktop\\Notice\\pass.txt",true);
			BufferedWriter b2 = new BufferedWriter(f2);
			PrintWriter p2 = new PrintWriter(b2);

			//Writing to file.
			while(sc.hasNext() && count<1){
				b2.write(str.nextLine()+"\n");
				count = count+1;
			}
			//Closing all resources.
			p2.close();
			b2.close();
			f2.close();

			System.out.println("********************* Youv've Successgully Signed Up ***********************");
			Login l1=new Login();
			l1.calllogin();
			}
			
// TEACHER LOGIN
			else if (role==2) {
				FileWriter f1 = new FileWriter("C:\\Users\\ria_s\\OneDrive\\Desktop\\Notice\\admin.txt",true);
			BufferedWriter b1 = new BufferedWriter(f1);
			PrintWriter p1 = new PrintWriter(b1);

			//Writing to file.
			while(str.hasNext() && count<1){
				b1.write(str.nextLine()+"\n");
				count = count+1;
			}
			//Closing all resources.
			p1.close();
			b1.close();
			f1.close();
			count = 0;

			//Opening the password file.
			FileWriter f2 = new FileWriter("C:\\Users\\ria_s\\OneDrive\\Desktop\\Notice\\adpass.txt",true);
			BufferedWriter b2 = new BufferedWriter(f2);
			PrintWriter p2 = new PrintWriter(b2);

			//Writing to file.
			while(str.hasNext() && count<1){
				b2.write(str.nextLine()+"\n");
				count = count+1;
			}
			//Closing all resources.
			p2.close();
			b2.close();
			f2.close();

			System.out.println("********************* Youv've Successgully Signed Up ***********************");
			Login l1=new Login();
			l1.calllogin();
			}

			else{
				System.out.println("Wrong Input.");
				System.exit(0);
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}