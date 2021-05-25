package com.hibernet.HibernateCrudOperations.Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernet.HibernateCrudOperations.Model.Employe;

public class EmployeDao 
{
   HibernetConfig conf = new HibernetConfig();
   public void fetchById(int id)
   {
	   Session session = conf.getSession();
	   session.beginTransaction();
	   
	   Query q = session.createQuery("from Employe where id = :id");
	   q.setParameter("id", id);
	   Employe e  = (Employe) q.uniqueResult();
	   
	   System.out.println(e);
	   
	   session.getTransaction().commit(); 
	   
   }
   public void insert(int id, String name, String tech, String email, String phonenumber)
   {
	   Session session = conf.getSession();
	   session.beginTransaction();
	  
	   Employe e = new Employe();
	   e.setId(id);
	   e.setName(name);
	   e.setTech(tech);
	   e.setEmail(email);
	   e.setPhonenumber(phonenumber);
	  
	   session.save(e);
	   
	   session.getTransaction().commit();  
   }
   public void update(int id, String name, String tech,String email,String phonenumber)
   {
	   Session session = conf.getSession();
	   session.beginTransaction();
	  
	   Employe e = new Employe();
	   e.setId(id);
	   e.setName(name);
	   e.setTech(tech);
	   e.setEmail(email);
	   e.setPhonenumber(phonenumber);
	  
	   session.update(e);
	   
	   session.getTransaction().commit();  
   }
   public void delete(int id)
   {
	   Session session = conf.getSession();
	   session.beginTransaction();
	   Employe e = (Employe) session.load(Employe.class, id);
	     session.delete(e);  
	   session.getTransaction().commit();  
   }
   public void fetchAll() 
   {
	   Session session = conf.getSession();
	   session.beginTransaction();
	   
	   Query q = session.createQuery("from Employe");
	   List<Employe>list = q.list();
	   
	   for(Employe e : list)System.out.println(e);
	   
	   session.getTransaction().commit();
	   
   }
}
