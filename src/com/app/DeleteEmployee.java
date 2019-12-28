package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmployee {

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
			Employee emp=(Employee)session.load(Employee.class, new Integer(id));
			session.delete(emp);
			tr.commit();
			System.out.println("Record deleted");
			
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
