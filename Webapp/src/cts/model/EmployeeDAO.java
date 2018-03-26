package cts.model;
	import java.util.List;

	import org.hibernate.Criteria;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;

	public class EmployeeDAO {
		// store logic
		public int store(Employee emp) {
			int status = 0;
			SessionFactory sf = HibernateUtility.getSessionFactory();
			Session s = sf.openSession();
			Transaction tx = s.beginTransaction();
			s.save(emp);
			tx.commit();
			status = 1;
			
			s.close();
			sf.close();
			return status;
		}
		// display all
		public List retrieveAll() {
			List list = null;
			SessionFactory sf = HibernateUtility.getSessionFactory();
			Session s = sf.openSession();
			Criteria crt = s.createCriteria(Employee.class);
			list = crt.list();
			return list;
		}
	}
