package pack;

import pack.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class TestFHibernate{
	public static void main(String[] args){
		Configuration c=new Configuration();
		c.configure();
		
		SessionFactory sf=c.buildSessionFactory();
		Session s=sf.openSession();
		/*Transaction tx=s.beginTransaction();
		Employee emp= new Employee(2211, "Atharva", 5000);
		s.save(emp);
		tx.commit();*/
		/*Employee emp=s.get(Employee.class, 2211);
		System.out.println(emp.getId()+emp.getName()+emp.getSalary());
		s.close();
		sf.close();
		System.out.println("***DONE***");*/
}
}
