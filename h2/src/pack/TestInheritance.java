package pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestInheritance {
public static void main(String[] args) {
	SessionFactory sf = HibernateUtility.getSessionFactory();
	Session s = sf.openSession();
	Transaction tx = s.beginTransaction();
	Person p = new Person("Pavi",101);
	Customer c = new Customer("Sharmi",102,"ICICI");
	Student std = new Student("kayal",103,"S");
	s.save(p);
	s.save(c);
	s.save(std);
	
	tx.commit();
	s.close();
	sf.close();
			}
}
