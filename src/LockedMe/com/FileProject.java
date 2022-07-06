package LockedMe.com;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileProject {
 
	     Scanner sc= new Scanner(System.in);
	     String path= "C:\\FileConcept";
	     public void display()
	     {
	    	 System.out.println("  Project: LockedMe.com");
	    	 System.out.println("**** By Rishu Kumar ****\n");
	     }
	     public void show() throws Exception
	     {
	    	 System.out.println("Please choose any operations which you want to do from below:\n");
	    	 System.out.println("1. Show all files and folders");
	    	 System.out.println("2. Add a file");
	    	 System.out.println("3. Delete a file");
	    	 System.out.println("4. Search a file");
	    	 System.out.println("5. Exit application");
	    	 int i=sc.nextInt();
	    	 
	    	 switch(i)
	    	 {
	    	 case 1:
	    		 
	    		 File f= new File(path);
	    		 String[] arr= f.list();
	    		 List<String> l= Arrays.asList(arr);
	    		 Collections.sort(l);
	    		 
	    		 for(String arr1:l)
	    		 {   
	    			 if(arr1.endsWith(".txt"))
	    				  
	    			  System.out.println("File:"+" "+arr1);	    		     
	    		     else
	    		    	 
	    		      System.out.println("Folder:"+" "+arr1);	    	
	    		 
	             } 
	    		 break;
	    	 case 2:
	    		 
	    		 System.out.println("Enter the name of new file and add .txt as extention:");
	    		 String name=sc.next();
	    	     if(name.endsWith(".txt"))
	    		 {	 
                 File f1= new File(path,name);  
	    		 Boolean b= f1.createNewFile();
                 if(b==true)System.out.println("File created");
                 else System.out.println("File already exists");
	    		 }
	    		 else 
	    		  System.out.println("\nkindly add .txt as an extention\n");
	    
	    		break;
	    		
	    	 case 3:
	    		 
	    		 System.out.println("Enter the file or folder name which you want to delete:");
	    		  String name1=sc.next();
	    		  File f2= new File(path,name1);
	    		  if (f2.exists())
	    			  if(f2.isFile())
	    			  {  f2.delete();
	    		         System.out.println(name1+" file is now succefully deleted from the directory");
	    			  }
	    			  else
	    			  { if(f2.isDirectory())
	    				  {  f2.delete();
	    		             System.out.println(name1+" folder is now succefully deleted from the directory");
			              }
	    			  }
	    				  else
	    					  System.out.println("\nfile not found, try again...?\n");
	    		  break;
	    		  
	    	 case 4:
	    		     System.out.println("enter the name of the file or folder which you are searching for:");
	    		     String name2= sc.next();
	    		     File f3= new File(path,name2);
	    		      if(f3.exists())
	    		        System.out.println("File found");
	    		      else
	    		    	  System.out.println("File not found");
	    		      break;
	    		      
	    	 case 5:
	    		     System.out.println("closing application...");
	    		     System.out.println("closed");
	    		     System.exit(0);
	    		     
	        default:
	        	 System.out.println("choose right option from the list. choose again...");
	        	 
	    	 }         
	    	 show1();
	     }
	     public void show1() throws Exception
	     { 
	    	 System.out.println("\n redirecting to main menu in 7 seconds...\n");
	    	 try{Thread.sleep(7000);}
	    	 catch(Exception e) {}
	    	 show();
	     }
  
public static void main(String args[]) throws Exception
  {
	  FileProject fp= new FileProject();
	  fp.display();
	  fp.show();
	  
  }
}
