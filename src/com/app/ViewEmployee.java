package com.app;
import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;
import java.util.Iterator;
import org.hibernate.Query;

public class ViewEmployee
{
	public static void main(String[] args)
	{
		Session session = null;
		SessionFactory factory;
		try
		{
			factory=new Configuration().configure()
					.buildSessionFactory();
			session=factory.openSession();
			Transaction tr=session.beginTransaction();
			Query query=session.createQuery("from Employee e");
			List list=query.list();
			Iterator iter=list.iterator();
			while(iter.hasNext())
			{
				System.out.println(iter.next());
			}
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