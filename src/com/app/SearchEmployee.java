package com.app;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Query;
import java.util.List;
import java.util.Iterator;
public class SearchEmployee
{
	public static void main(String[] args)
	{
		Session session = null;
		SessionFactory factory;
		try
		{
			factory=new Configuration().configure().buildSessionFactory();
			session=factory.openSession();
			
			Transaction tr=session.beginTransaction();
			int id=Integer.parseInt(args[0]);
			
			Object obj=session.load(Employee.class,new Integer(id));

			Employee emp=(Employee)obj;
			System.out.println(emp);
			
			tr.commit();

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