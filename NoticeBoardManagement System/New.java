import com.ncu.*;
import java.io.*;
import java.util.*;

 class New
{
  public static void main(String[] args) {
    try{
      Scanner sc = new Scanner(System.in);
        String o,v = "y";        
        
        while( v.equalsIgnoreCase("y") ) {   
            System.out.println("***************************************************************************");      
             System.out.println("\t\t WELCOME TO NOTICE MANAGEMENT SYSTEM");
          System.out.println("***************************************************************************\n");  
          System.out.println("1 ===> LOGIN ");
          System.out.println("2 ===> SIGNUP "); 
          
          System.out.print("\n\n");
          System.out.println("Enter your choice: ");
          o=sc.next();
          
          if( o.equals("1") ) {
              Login l=new Login();
              l.calllogin();
          } 
          else if( o.equals("2") ) {
              Signup su=new Signup();
              su.callsignup();
          }              
          System.out.println("Do you want to continue LOGIN/SIGNUP? y/n");
          v = sc.next();
          
        }
    }
    catch(Exception e){
      System.out.println(e);
    }
        
    }
}