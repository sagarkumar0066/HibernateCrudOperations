package com.hibernate.CrudOperations.DaoLayer;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.CrudOperations.Model.Employe;

public class EmpDao 
{
	Session session = new DatabaseConnection().getSession();
	
   public List<Employe> FetchAll()
   {
	   session.beginTransaction();
	   Query q = session.createQuery("from Employe");
	   List<Employe> list = q.list();
	   session.getTransaction().commit();
	   
	   return list;
	   
   }
   public Employe FetchById(int id)
   {
	   session.beginTransaction();
	   Query q =  session.createQuery("from Employe where id= :id");
	   q.setParameter("id", id);
	   Employe e = (Employe) q.uniqueResult();
	   session.getTransaction().commit(); 
	   
	   return e;
   }
   public String insert(int id, String name, String tech, String email, String phonenumber)
   {
	   Employe e = new Employe();
	   e.setId(id);
	   e.setName(name);
	   e.setEmail(email);
	   e.setTech(tech);
	   e.setPhonenumber(phonenumber);
	   
	   session.beginTransaction();
	   session.save(e);
	   session.getTransaction().commit();    
	   
	   return "Data Inserted";
   }
   public String update(Employe e)
   {
	   session.beginTransaction();
	   session.update(e);
	   session.getTransaction().commit(); 
	   return "Data Updated";
   }
   public String delete(int id)
   {
	   session.beginTransaction();
	   Employe e = (Employe) session.load(Employe.class, id);
	   session.delete(e);
	   session.getTransaction().commit(); 
	   return "Data Deleted";
   }
   
}
