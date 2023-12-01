package com.ncu;
import com.ncu.*;

import java.io.*;
import java.util.*;

public class Login{
	public void calllogin(){ 
		int role;
		String s1;
		String s2;
		boolean flag = false;
		int count = 0;
		Scanner sc = new Scanner(System.in);

		try{
			System.out.println("Are you a Student or Teacher?");
			System.out.println("1 ==> Student");
			System.out.println("2 ==> Teacher");
			System.out.println("Enter your choice:");
			role=sc.nextInt();
			if (role==1) {
//STUDENT LOGIN
			FileReader f1 = new FileReader("C:\\Users\\ria_s\\OneDrive\\Desktop\\Notice\\user.txt");
			BufferedReader b1 = new BufferedReader(f1);
			b1.mark(100000000);
			FileReader f2 = new FileReader("C:\\Users\\ria_s\\OneDrive\\Desktop\\Notice\\pass.txt");
			BufferedReader b2 = new BufferedReader(f2);
			b2.mark(100000000);

			//Comparing user provided input with data in files and if it matches then user is logged in.
			while(count<3 && flag==false){
				count = count+1;
				System.out.println("----------------------- LOGIN PAGE ---------------------------");
				//Getting username and password from the user.
				System.out.println("Enter Username:");
				String user = sc.next();
				System.out.println("Enter Password:");
				String pass = sc.next();


				while((s1=b1.readLine())!=null && (s2=b2.readLine())!=null && flag==false){
					if(user.equals(s1) && pass.equals(s2)){
						flag = true;
					}
					else{
						flag = false;
					}
				}

				if(flag==true){}
				else{
					System.out.println("Invalid Username or Password!!");
				}
				b1.reset();
				b2.reset();
			}

			// After 3 trials/ one successful
			if(flag==true){
				System.out.println("-------------------------- You Have Successfully Logged in ----------------------------");
				//Closing all resources.
				b1.close();
				f1.close();
				b2.close();
				f2.close();

				Smenu mn=new Smenu();
				mn.showsmenu();
			}
			else{
				System.out.print("---------------------- You Have Entered Data Too Many Times!! --------------------- \n");
				System.out.println("--------------------- CLOSING--------------------");
				//Closing all resources.
				b1.close();
				f1.close();
				b2.close();
				f2.close();
				System.exit(0);
			}
			}

// FOR TEACHER LOGIN
			else if (role==2) {
				//Opening username and password files.
			FileReader f1 = new FileReader("C:\\Users\\ria_s\\OneDrive\\Desktop\\Notice\\admin.txt");
			BufferedReader b1 = new BufferedReader(f1);
			b1.mark(100000000);
			FileReader f2 = new FileReader("C:\\Users\\ria_s\\OneDrive\\Desktop\\Notice\\adpass.txt");
			BufferedReader b2 = new BufferedReader(f2);
			b2.mark(100000000);

			//Comparing user provided input with data in files and if it matches then user is logged in.
			while(count<3 && flag==false){
				count = count+1;
				System.out.println("----------------------- LOGIN PAGE ---------------------------");
				//Getting username and password from the user.
				System.out.println("Enter Username:");
				String user = sc.next();
				System.out.println("Enter Password:");
				String pass = sc.next();


				while((s1=b1.readLine())!=null && (s2=b2.readLine())!=null && flag==false){
					if(user.equals(s1) && pass.equals(s2)){
						flag = true;
					}
					else{
						flag = false;
					}
				}

				if(flag==true){}
				else{
					System.out.println("Invalid Username or Password!!");
				}
				b1.reset();
				b2.reset();
			}

			// After 3 trials/ one successful
			if(flag==true){
				System.out.println("-------------------------- You Have Successfully Logged in ----------------------------");
				//Closing all resources.
				b1.close();
				f1.close();
				b2.close();
				f2.close();

				Menu mn=new Menu();
				mn.showmenu();
			}
			else{
				System.out.print("---------------------- You Have Entered Data Too Many Times!! --------------------- \n");
				System.out.println("--------------------- CLOSING--------------------");
				//Closing all resources.
				b1.close();
				f1.close();
				b2.close();
				f2.close();
				System.exit(0);
			}
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
