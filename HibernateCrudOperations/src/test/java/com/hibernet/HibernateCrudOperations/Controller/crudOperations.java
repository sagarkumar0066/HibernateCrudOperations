package com.hibernet.HibernateCrudOperations.Controller;

import java.util.*;

import com.hibernet.HibernateCrudOperations.Dao.EmployeDao;
import com.hibernet.HibernateCrudOperations.Model.Employe;
public class crudOperations 
{
  static EmployeDao ed = new EmployeDao();
  static Scanner sc = new Scanner(System.in);
   public static void main(String args[])
   {  
	   System.out.println("1. Fetch All Employes Data");
	   System.out.println("2. Fetch Employe Data By Id");
	   System.out.println("3. Update Employe Data");
	   System.out.println("4. Delete Employe Data");
	   System.out.println("5. Insert Employe Data");
	   System.out.print("Enter your Option : ");
	   int input = sc.nextInt();
	   
	   switch(input)
	   {
	     case 1 : fetchAll();
	              break;
	              
	     case 2 : fetchById();
                  break;
                  
	     case 3 : update();
                  break;
                  
	     case 4 : delete();
                  break;
                  
	     case 5 : insert();
                  break;
                  
	     default : System.out.println("Wrong Input");
                     break;
	    	    
	   }
   }
   
   static void fetchAll()
   {
	  ed.fetchAll();
   }
   static void fetchById()
   {
	   System.out.print("Enter id : ");
	   int i = sc.nextInt();
	   ed.fetchById(i);
   }
   static void update()
   {
	   System.out.print("Enter id : ");
	   int id = sc.nextInt();
	   
	   System.out.print("Enter name : ");
	   String name = sc.next();
	   
	   System.out.print("Enter tech : ");
	   String tech = sc.next();
	   
	   System.out.print("Enter email : ");
	   String email = sc.next();
	   
	   System.out.print("Enter phonenumber : ");
	   String phonenumber = sc.next();
	   ed.update(id,name,tech,email,phonenumber);
   }
   static void delete()
   {
	   System.out.print("Enter id : ");
	   int id = sc.nextInt();
	   ed.delete(id);
   }
   static void insert()
   {
	   System.out.print("Enter id : ");
	   int id = sc.nextInt();
	   
	   System.out.print("Enter name : ");
	   String name = sc.next();
	   
	   System.out.print("Enter tech : ");
	   String tech = sc.next();
	   
	   System.out.print("Enter email : ");
	   String email = sc.next();
	   
	   System.out.print("Enter phonenumber : ");
	   String phonenumber = sc.next();
	   
	   ed.insert(id,name,tech,email,phonenumber);
   }
}
