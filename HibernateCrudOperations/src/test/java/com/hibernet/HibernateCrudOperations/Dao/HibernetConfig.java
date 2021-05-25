package com.hibernet.HibernateCrudOperations.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.hibernet.HibernateCrudOperations.Model.Employe;



public class HibernetConfig 
{
	public Session getSession()
	{
		Configuration cnf = new Configuration().configure().addAnnotatedClass(Employe.class);
    	ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(cnf.getProperties()).buildServiceRegistry();
    	SessionFactory sf = cnf.buildSessionFactory(sr);
		Session session = sf.openSession();		
		  return session;
	}
}
