package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

public class TestCriteria {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtility.getSessionFactory();
		Session s = sf.openSession();
		Criteria crt = s.createCriteria(Employee.class);
		crt.add(Restrictions.between("id", 100,200));
		crt.add(Restrictions.gt("salary", 10000.0));
		
		List list = crt.list();
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			Employee emp = (Employee) it.next();
			System.out.println("Id= "+emp.getId()+",Name = "+emp.getName()+", Salary = "+emp.getSalary());
			
		}
		s.close();
		sf.close();
	}
}
	
