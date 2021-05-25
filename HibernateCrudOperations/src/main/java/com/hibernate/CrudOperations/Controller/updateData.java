package com.hibernate.CrudOperations.Controller;

import java.util.Scanner;

import com.hibernate.CrudOperations.DaoLayer.EmpDao;
import com.hibernate.CrudOperations.Model.Employe;

public class updateData 
{
	Scanner sc = new Scanner(System.in);
	EmpDao ed = new EmpDao();
	Employe e = new Employe();
  public void empData(int id)
  {
	 new updateData().getData(id);
  }
  public void getData(int id)
  {
	  e = ed.FetchById(id);
	  String name = e.getName();
	  String tech = e.getTech();
	  String email = e.getEmail();
	  String phn = e.getPhonenumber();
	  
	  System.out.println("1. Name  : "+name);
	  System.out.println("2. Tech  : "+tech);
	  System.out.println("3. Email  : "+email);
	  System.out.println("4. Phone number  : "+phn);
	  
	  System.out.print("\n Enter option to change data : ");
	  int input = sc.nextInt();
	  
	   switchStatement(input,id);
	  
  }
  public void switchStatement(int input,int id)
  {
	  String name="",email="",tech="",phn="";
	  switch(input)
	  {
	    case 1 : System.out.print("Enter Name : ");
			        name = sc.next();
			        updateName(id, name);
			        break;
	    case 2 : System.out.print("Enter Tech : ");
			        tech = sc.next();
			        updateTech(id, tech);
			        break;
	    case 3 : System.out.print("Enter Email : ");
			        email = sc.next();
			        updateEmail(id, email);
			        break;
	    case 4 : System.out.print("Enter Phone number : ");
			        phn = sc.next();
			        updateEmail(id, email);
			        break;
	    default : System.out.print("Invalid option");
			        break;
	  }
  }
  public void updateName(int id, String name)
  {
	  Employe e = ed.FetchById(id);
	  e.setName(name);
	  System.out.println(ed.update(e));
  }
  public void updateTech(int id, String tech)
  {
	  Employe e = ed.FetchById(id);
	  e.setTech(tech);
	  System.out.println(ed.update(e));
  }
  public void updateEmail(int id, String email)
  {
	  Employe e = ed.FetchById(id);
	  e.setEmail(email);
	  System.out.println(ed.update(e));
  }
  public void updatePhonenumber(int id, String phonenumber)
  {
	  Employe e = ed.FetchById(id);
	  e.setPhonenumber(phonenumber);
	  System.out.println(ed.update(e)); 
  }
}
