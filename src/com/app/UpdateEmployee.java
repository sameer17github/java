package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;

public class UpdateEmployee 
{
	public static void main(String[] args) 
	{
		Session session=null;
		SessionFactory factory;
		try
		{
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			Transaction t=session.beginTransaction();
			int id=Integer.parseInt(args[0]);
			int sal=Integer.parseInt(args[2]);
			Employee emp=session.load(Employee.class, new Integer(id));
			emp.setName(args[1]);
			emp.setSalary(sal);
			session.update(emp);
			t.commit();
			System.out.println("Record updated");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
		
		
	}

}
