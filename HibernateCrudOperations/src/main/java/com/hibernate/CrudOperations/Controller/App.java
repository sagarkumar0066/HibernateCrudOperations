package com.hibernate.CrudOperations.Controller;

import java.util.*;

import com.hibernate.CrudOperations.DaoLayer.EmpDao;
import com.hibernate.CrudOperations.Model.Employe;
public class App 
{
	static EmpDao ed = new EmpDao();
	static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
        System.out.println("1. Fetch All Data");
        System.out.println("2. Fetch By Id");
        System.out.println("3. Insert Data");
        System.out.println("4. Update Data");
        System.out.println("5. Delete Data");
        
        System.out.print("Enter your option : ");
        int input = sc.nextInt();
        
        switch(input)
        {
          case 1 : FetchAllData();
                    break;
          case 2 : FetchById();
                    break;
          case 3 : InsertData();
                    break;
          case 4 : UpdateData();
                    break;
          case 5 : DeleteData();
                    break;
          default : System.out.println("Invalid Input..");
                    break;
        }
        
        
    }
    
    static void FetchAllData()
    {
    	List<Employe> list = ed.FetchAll();
    	for(Employe e : list) System.out.println(e);
    }
    static void FetchById()
    {
    	System.out.print("Enter ID : ");
    	int id = sc.nextInt();
    	
    	System.out.println(ed.FetchById(id));	
    }
    static void InsertData()
    {
    	System.out.print("Enter Id : ");
    	int id = sc.nextInt();
    	System.out.print("Enter name : ");
    	String name = sc.next();
    	System.out.print("Enter tech : ");
    	String tech = sc.next();
    	System.out.print("Enter email : ");
    	String email = sc.next();
    	System.out.print("Enter phonenumber : ");
    	String phonenumber = sc.next();
    	
    	System.out.println(ed.insert(id, name, tech, email, phonenumber)); 	
    }
    static void UpdateData()
    {
    	System.out.print("Enter Id : ");
    	int id = sc.nextInt();
    	new updateData().empData(id);
    }
    static void DeleteData()
    {
    	System.out.print("Enter Id : ");
    	int id = sc.nextInt();
    	
    	System.out.println(ed.delete(id));
    }
}
