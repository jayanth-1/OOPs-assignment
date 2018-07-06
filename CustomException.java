import java.util.*;
import java.io.*;
import java.lang.*;

class InvalidAge extends Exception{  
 InvalidAge(String s){  
  super(s);  
 }  
} 

class CustomException{  
  
   static void validate(int age)throws InvalidAgeException{  
     if(age<18)  
      throw new InvalidAgeException("vote is not valid");  
     else  
      System.out.println("your vote is valid");  
   }  
     
   public static void main(String args[]){ 
    System.out.println("Enter your age :\n") 
   	Scanner sc = new Scanner(System.in);
   	int a = sc.nextInt();
      try{  
      validate(a);  
      }catch(Exception m){System.out.println("Exception occured: "+m);}  
    
  } 
 
}

   